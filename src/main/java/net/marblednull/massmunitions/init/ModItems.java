package net.marblednull.massmunitions.init;

import net.marblednull.massmunitions.MassMunitions;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MassMunitions.MODID);

    //casings
    public static final RegistryObject<Item> CASING9MM = ITEMS.register("9mm_casing", () -> new Item(new Item.Properties()));

    //ammo
    public static final RegistryObject<Item> PISTOLBULLET = ITEMS.register("pistol_bullet", () -> new Item(new Item.Properties()));

    //misc
    public static final RegistryObject<Item> PRIMER = ITEMS.register("primer", () -> new Item(new Item.Properties()));

    //materials
    public static final RegistryObject<Item> C260INGOT = ITEMS.register("c260_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> C260NUGGET = ITEMS.register("c260_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> C260SHEET = ITEMS.register("c260_sheet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> C260COIL = ITEMS.register("c260_coil", () -> new Item(new Item.Properties()));
    
    //forms and tools
    public static final RegistryObject<Item> CARTFORM9MM = ITEMS.register("9mm_cartridge_form", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PISTOLCARTPUNCH = ITEMS.register("pistol_cartridge_punch", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
