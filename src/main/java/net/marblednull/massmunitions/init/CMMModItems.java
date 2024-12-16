package net.marblednull.massmunitions.init;

import net.marblednull.massmunitions.MassMunitions;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CMMModItems {
    public static final DeferredRegister<Item> CMMITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MassMunitions.MODID);
    //misc
    public static final RegistryObject<Item> PRIMER = CMMITEMS.register("primer", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRIMER_CAP = CMMITEMS.register("primer_cap", () -> new Item(new Item.Properties()));

    //materials
    public static final RegistryObject<Item> C260INGOT = CMMITEMS.register("c260_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> C260NUGGET = CMMITEMS.register("c260_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> C260SHEET = CMMITEMS.register("c260_sheet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> C260COIL = CMMITEMS.register("c260_coil", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> C260PLATE = CMMITEMS.register("c260_plate", () -> new Item(new Item.Properties()));

        public static void register(IEventBus eventBus) {
        CMMITEMS.register(eventBus);
    }
}
