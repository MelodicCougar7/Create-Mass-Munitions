package net.marblednull.massmunitions;

import com.mojang.logging.LogUtils;

import net.marblednull.massmunitions.init.Fluid.ModFluidTypes;
import net.marblednull.massmunitions.init.TACZModItems;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import static net.marblednull.massmunitions.MassMunitions.TACZ_PRESENT;

public class ModEvents {

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
                MinecraftForge.EVENT_BUS.addListener(ModEvents::rifleShootEvent);
                MinecraftForge.EVENT_BUS.addListener(ModEvents::pistolShootEvent);
                MinecraftForge.EVENT_BUS.addListener(ModEvents::heavyPistolShootEvent);
                MinecraftForge.EVENT_BUS.addListener(ModEvents::sniperShootEvent);
                MinecraftForge.EVENT_BUS.addListener(ModEvents::shotgunShootEvent);

                LogUtils.getLogger().info("CMM: Listeners registered.");
            } catch (ClassNotFoundException | NoClassDefFoundError e) {
                // If the GunShootEvent class is not found, log the issue
                LogUtils.getLogger().error("CMM: tacz's GunShootEvent class not found");
            }
        }
    }
    //help from and credit to Leducklet/Corrineduck and ChatGPT smh

    public static void rifleShootEvent(com.tacz.guns.api.event.common.GunShootEvent gunEvent) {

        if (gunEvent.getLogicalSide().isServer()) {
            for (String stringiterator : Config.RIFLELIST.get()) {
                if (gunEvent.getGunItemStack().getTag().getString("GunId").equals(stringiterator)) {
                    if (gunEvent.getShooter().getMainHandItem().getTag().getString("GunFireMode").equals("BURST")) {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(gunEvent.getShooter().level(), gunEvent.getShooter().getX(), gunEvent.getShooter().getY(), gunEvent.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYRIFLECARTRIDGE.get(), 3));
                        casing.setPickUpDelay(20);
                        //Add casing
                        gunEvent.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(gunEvent.getShooter().level(), gunEvent.getShooter().getX(), gunEvent.getShooter().getY(), gunEvent.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYRIFLECARTRIDGE.get()));
                        casing.setPickUpDelay(20);
                        //Add casing
                        gunEvent.getShooter().level().addFreshEntity(casing);
                    }
                }
            }
        }
    }

    public static void pistolShootEvent(com.tacz.guns.api.event.common.GunShootEvent gunEvent) {

        if (gunEvent.getLogicalSide().isServer()) {
            for (String stringiterator : Config.PISTOLLIST.get()) {
                if (gunEvent.getGunItemStack().getTag().getString("GunId").equals(stringiterator)) {
                    if (gunEvent.getShooter().getMainHandItem().getTag().getString("GunFireMode").equals("BURST")) {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(gunEvent.getShooter().level(), gunEvent.getShooter().getX(), gunEvent.getShooter().getY(), gunEvent.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYPISTOLCARTRIDGE.get(), 2));
                        casing.setPickUpDelay(20);
                        //Add casing
                        gunEvent.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(gunEvent.getShooter().level(), gunEvent.getShooter().getX(), gunEvent.getShooter().getY(), gunEvent.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYPISTOLCARTRIDGE.get()));
                        casing.setPickUpDelay(20);
                        //Add casing
                        gunEvent.getShooter().level().addFreshEntity(casing);
                    }
                }
            }
        }
    }

    public static void heavyPistolShootEvent(com.tacz.guns.api.event.common.GunShootEvent gunEvent) {

        if (gunEvent.getLogicalSide().isServer()) {
            for (String stringiterator : Config.HEAVYPISTOLLIST.get()) {
                if (gunEvent.getGunItemStack().getTag().getString("GunId").equals(stringiterator)) {
                    if (gunEvent.getShooter().getMainHandItem().getTag().getString("GunFireMode").equals("BURST")) {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(gunEvent.getShooter().level(), gunEvent.getShooter().getX(), gunEvent.getShooter().getY(), gunEvent.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYHEAVYPISTOLCARTRIDGE.get(), 3));
                        casing.setPickUpDelay(20);
                        //Add casing
                        gunEvent.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(gunEvent.getShooter().level(), gunEvent.getShooter().getX(), gunEvent.getShooter().getY(), gunEvent.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYHEAVYPISTOLCARTRIDGE.get()));
                        casing.setPickUpDelay(20);
                        //Add casing
                        gunEvent.getShooter().level().addFreshEntity(casing);
                    }
                }
            }
        }
    }

    public static void sniperShootEvent(com.tacz.guns.api.event.common.GunShootEvent gunEvent) {

        if (gunEvent.getLogicalSide().isServer()) {
            for (String stringiterator : Config.SNIPERLIST.get()) {
                if (gunEvent.getGunItemStack().getTag().getString("GunId").equals(stringiterator)) {
                    if (gunEvent.getShooter().getMainHandItem().getTag().getString("GunFireMode").equals("BURST")) {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(gunEvent.getShooter().level(), gunEvent.getShooter().getX(), gunEvent.getShooter().getY(), gunEvent.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYSNIPERCARTRIDGE.get(), 3));
                        casing.setPickUpDelay(20);
                        //Add casing
                        gunEvent.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(gunEvent.getShooter().level(), gunEvent.getShooter().getX(), gunEvent.getShooter().getY(), gunEvent.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYSNIPERCARTRIDGE.get()));
                        casing.setPickUpDelay(20);
                        //Add casing
                        gunEvent.getShooter().level().addFreshEntity(casing);
                    }
                }
            }
        }
    }

    public static void shotgunShootEvent(com.tacz.guns.api.event.common.GunShootEvent gunEvent) {

        if (gunEvent.getLogicalSide().isServer()) {
            for (String stringiterator : Config.SHOTGUNLIST.get()) {
                if (gunEvent.getGunItemStack().getTag().getString("GunId").equals(stringiterator)) {
                    if (gunEvent.getShooter().getMainHandItem().getTag().getString("GunFireMode").equals("BURST")) {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(gunEvent.getShooter().level(), gunEvent.getShooter().getX(), gunEvent.getShooter().getY(), gunEvent.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYSHOTGUNSHELL.get(), 2));
                        casing.setPickUpDelay(20);
                        //Add casing
                        gunEvent.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(gunEvent.getShooter().level(), gunEvent.getShooter().getX(), gunEvent.getShooter().getY(), gunEvent.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYSHOTGUNSHELL.get()));
                        casing.setPickUpDelay(20);
                        //Add casing
                        gunEvent.getShooter().level().addFreshEntity(casing);
                    }
                }
            }
        }
    }
}