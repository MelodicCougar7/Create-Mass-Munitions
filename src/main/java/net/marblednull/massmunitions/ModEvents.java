package net.marblednull.massmunitions;

import com.tacz.guns.api.event.common.GunShootEvent;
import net.marblednull.massmunitions.init.TACZModItems;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

//dev from chatgpt
@Mod.EventBusSubscriber(modid = "massmunitions", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    private static boolean TACZ_PRESENT = ModList.get().isLoaded("tacz");

    // Register events conditionally
    public static void commonSetup(FMLCommonSetupEvent event) {
        if (TACZ_PRESENT) {
            // Register all the events manually
            MinecraftForge.EVENT_BUS.addListener(ModEvents::rifleShootEvent);
            MinecraftForge.EVENT_BUS.addListener(ModEvents::pistolShootEvent);
            MinecraftForge.EVENT_BUS.addListener(ModEvents::heavyPistolShootEvent);
            MinecraftForge.EVENT_BUS.addListener(ModEvents::sniperShootEvent);
            MinecraftForge.EVENT_BUS.addListener(ModEvents::shotgunShootEvent);
        }
    }
    //help from and credit to Leducklet/Corrineduck and ChatGPT smh
    @SubscribeEvent
    public static void rifleShootEvent(GunShootEvent event) {
        if (event.getLogicalSide().isServer()) {
            for (String stringiterator : Config.RIFLELIST.get()) {
                if (event.getGunItemStack().getTag().getString("GunId").equals(stringiterator)) {
                    if (event.getShooter().getMainHandItem().getTag().getString("GunFireMode").equals("BURST")) {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYRIFLECARTRIDGE.get(), 3));
                        casing.setPickUpDelay(20);
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYRIFLECARTRIDGE.get()));
                        casing.setPickUpDelay(20);
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    }
                }
            }
        }
    }
    @SubscribeEvent
    public static void pistolShootEvent(GunShootEvent event) {
        if (event.getLogicalSide().isServer()) {
            for (String stringiterator : Config.PISTOLLIST.get()) {
                if (event.getGunItemStack().getTag().getString("GunId").equals(stringiterator)) {
                    if (event.getShooter().getMainHandItem().getTag().getString("GunFireMode").equals("BURST")) {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYPISTOLCARTRIDGE.get(), 2));
                        casing.setPickUpDelay(20);
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYPISTOLCARTRIDGE.get()));
                        casing.setPickUpDelay(20);
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    }
                }
            }
        }
    }
    @SubscribeEvent
    public static void heavyPistolShootEvent(GunShootEvent event) {
        if (event.getLogicalSide().isServer()) {
            for (String stringiterator : Config.HEAVYPISTOLLIST.get()) {
                if (event.getGunItemStack().getTag().getString("GunId").equals(stringiterator)) {
                    if (event.getShooter().getMainHandItem().getTag().getString("GunFireMode").equals("BURST")) {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYHEAVYPISTOLCARTRIDGE.get(), 3));
                        casing.setPickUpDelay(20);
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYHEAVYPISTOLCARTRIDGE.get()));
                        casing.setPickUpDelay(20);
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    }
                }
            }
        }
    }
    @SubscribeEvent
    public static void sniperShootEvent(GunShootEvent event) {
        if (event.getLogicalSide().isServer()) {
            for (String stringiterator : Config.SNIPERLIST.get()) {
                if (event.getGunItemStack().getTag().getString("GunId").equals(stringiterator)) {
                    if (event.getShooter().getMainHandItem().getTag().getString("GunFireMode").equals("BURST")) {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYSNIPERCARTRIDGE.get(), 3));
                        casing.setPickUpDelay(20);
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYSNIPERCARTRIDGE.get()));
                        casing.setPickUpDelay(20);
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    }
                }
            }
        }
    }
    @SubscribeEvent
    public static void shotgunShootEvent(GunShootEvent event) {
        if (event.getLogicalSide().isServer()) {
            for (String stringiterator : Config.SHOTGUNLIST.get()) {
                if (event.getGunItemStack().getTag().getString("GunId").equals(stringiterator)) {
                    if (event.getShooter().getMainHandItem().getTag().getString("GunFireMode").equals("BURST")) {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYSHOTGUNSHELL.get(), 2));
                        casing.setPickUpDelay(20);
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(TACZModItems.EMPTYSHOTGUNSHELL.get()));
                        casing.setPickUpDelay(20);
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    }
                }
            }
        }
    }
}
