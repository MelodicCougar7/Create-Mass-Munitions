package net.marblednull.massmunitions;

import com.tacz.guns.api.event.common.GunShootEvent;
import net.marblednull.massmunitions.init.ModItems;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ModEvents {
    //help from and credit to Leducklet/Corrineduck and ChatGPT smh
    @SubscribeEvent
    public static void rifleShootEvent(GunShootEvent event) {
        if (event.getLogicalSide().isServer()) {
            for (String stringiterator : Config.RIFLELIST.get()) {
                if (event.getGunItemStack().getTag().getString("GunId").equals(stringiterator)) {
                    if (event.getShooter().getMainHandItem().getTag().getString("GunFireMode").equals("BURST")) {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(ModItems.EMPTYRIFLECARTRIDGE.get(), 3));
                        casing.setNoPickUpDelay();
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(ModItems.EMPTYRIFLECARTRIDGE.get()));
                        casing.setNoPickUpDelay();
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
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(ModItems.EMPTYPISTOLCARTRIDGE.get(), 3));
                        casing.setNoPickUpDelay();
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(ModItems.EMPTYPISTOLCARTRIDGE.get()));
                        casing.setNoPickUpDelay();
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
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(ModItems.EMPTYHEAVYPISTOLCARTRIDGE.get(), 3));
                        casing.setNoPickUpDelay();
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(ModItems.EMPTYHEAVYPISTOLCARTRIDGE.get()));
                        casing.setNoPickUpDelay();
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
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(ModItems.EMPTYSNIPERCARTRIDGE.get(), 3));
                        casing.setNoPickUpDelay();
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(ModItems.EMPTYSNIPERCARTRIDGE.get()));
                        casing.setNoPickUpDelay();
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    }
                }
            }
        }
    }
    @SubscribeEvent
    public static void rifleShootEvent(GunShootEvent event) {
        if (event.getLogicalSide().isServer()) {
            for (String stringiterator : Config.SHOTGUNLIST.get()) {
                if (event.getGunItemStack().getTag().getString("GunId").equals(stringiterator)) {
                    if (event.getShooter().getMainHandItem().getTag().getString("GunFireMode").equals("BURST")) {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(ModItems.EMPTYSHOTGUNSHELL.get(), 3));
                        casing.setNoPickUpDelay();
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    } else {
                        //Create casing entity
                        ItemEntity casing = new ItemEntity(event.getShooter().level(), event.getShooter().getX(), event.getShooter().getY(), event.getShooter().getZ(), new ItemStack(ModItems.EMPTYSHOTGUNSHELL.get()));
                        casing.setNoPickUpDelay();
                        //Add casing
                        event.getShooter().level().addFreshEntity(casing);
                    }
                }
            }
        }
    }
}
