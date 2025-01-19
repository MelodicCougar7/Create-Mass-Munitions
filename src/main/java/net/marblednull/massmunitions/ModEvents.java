package net.marblednull.massmunitions;

import com.mojang.logging.LogUtils;

import net.marblednull.massmunitions.init.Fluid.ModFluidTypes;
import net.marblednull.massmunitions.init.TACZModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;

import static net.marblednull.massmunitions.MassMunitions.TACZ_PRESENT;

public class ModEvents {
    // from corrine, config parser
    public static HashMap<String, Item> parseConfig() {
        HashMap<String, Item> map = new HashMap<>();
        for (String strToParse : Config.CASING_TO_GUNID.get()) {
            String gunId;
            String itemId;
            String[] strs = strToParse.split("\\|");
            gunId = strs[0];
            itemId = strs[1];
            Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(itemId));
            map.put(gunId, item);
        }
        return map;
    }

    // Register events conditionally
    public static void commonSetup(FMLCommonSetupEvent event) {
        if (TACZ_PRESENT) {
            registerTACZEventListeners();
            LogUtils.getLogger().info("CMM: TACZ -> Attempting registry.");
        } else {
            // Log or handle when tacz is not present (if necessary)
            LogUtils.getLogger().info("CMM: TACZ not present, skipping registration.");
        }
    }

    public static void registerTACZEventListeners() {
        if (TACZ_PRESENT) {
            try {
                // Dynamically load the GunShootEvent class from tacz mod using reflection
                Class<?> gunEvent = Class.forName("com.tacz.guns.api.event.common.GunShootEvent");

                // Register event listeners for gun-related events

                MinecraftForge.EVENT_BUS.addListener(ModEvents::pistolShootEvent);
                

                LogUtils.getLogger().info("CMM: Listeners registered.");
            } catch (ClassNotFoundException | NoClassDefFoundError e) {
                // If the GunShootEvent class is not found, log the issue
                LogUtils.getLogger().error("CMM: tacz's GunShootEvent class not found");
            }
        }
    }
    //help from and credit to Leducklet/Corrineduck and ChatGPT smh

    // testing new config code
     public static void pistolShootEvent(com.tacz.guns.api.event.common.GunShootEvent gunEvent) {

        if (gunEvent.getLogicalSide().isServer()) {
            HashMap<String, Item> gunItemMap = parseConfig();

            // Get the GunId from the event
            String gunId = gunEvent.getGunItemStack().getTag().getString("GunId");

            // Check if the GunId exists in the map
            if (gunItemMap.containsKey(gunId)) {
                // Get the item associated with the GunId
                Item gunItem = gunItemMap.get(gunId);
                // create new itemstack from the retrieved GunId
                ItemStack casingStack = new ItemStack(gunItem);

                if (gunEvent.getShooter().getMainHandItem().getTag().getString("GunFireMode").equals("BURST")) {
                    //burst fire mode spawning two casings
                    for (int i = 0; i < 2; i++) {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(gunEvent.getShooter().level(), gunEvent.getShooter().getX(), gunEvent.getShooter().getY(), gunEvent.getShooter().getZ(), casingStack.copy());
                        casing.setPickUpDelay(20);
                        //Add casing
                        gunEvent.getShooter().level().addFreshEntity(casing);
                    }
                } else {
                    //Create casing entity
                    ItemEntity casing = new ItemEntity(gunEvent.getShooter().level(), gunEvent.getShooter().getX(), gunEvent.getShooter().getY(), gunEvent.getShooter().getZ(), casingStack.copy());
                    casing.setPickUpDelay(20);
                    //Add casing
                    gunEvent.getShooter().level().addFreshEntity(casing);
                }
            }
        }
    }
}