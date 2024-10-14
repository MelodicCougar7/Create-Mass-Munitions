package net.marblednull.massmunitions.init;

import net.marblednull.massmunitions.MassMunitions;
import net.marblednull.massmunitions.init.fluid.ModFluids;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MassMunitions.MODID);

    //casings
    public static final RegistryObject<Item> CASING45ACP = ITEMS.register("45acp_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING9MM = ITEMS.register("9mm_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING338 = ITEMS.register("338_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING308 = ITEMS.register("308_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING357MAG = ITEMS.register("357mag_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING50B = ITEMS.register("50b_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING12G = ITEMS.register("12g_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING50AE = ITEMS.register("50ae_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING556X45 = ITEMS.register("556x45_casing", () -> new Item(new Item.Properties()));

    //ammo
    public static final RegistryObject<Item> PISTOLBULLET = ITEMS.register("pistol_bullet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SNIPERBULLET = ITEMS.register("sniper_bullet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIFLEBULLET = ITEMS.register("rifle_bullet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEAVYPISTOLBULLET = ITEMS.register("heavy_pistol_bullet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHOT = ITEMS.register("shot", () -> new Item(new Item.Properties()));

    //misc
    public static final RegistryObject<Item> PRIMER = ITEMS.register("primer", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHISKED_GUNPOWER_BUCKET = ITEMS.register("whisked_gunpowder_bucket", () -> new BucketItem(ModFluids.WHISKED_GUNPOWDER_STILL,new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));
    public static final RegistryObject<Item> WHISKED_GUNPOWDER_BLOCK = ITEMS.register("whisked_gunpowder_block", () -> new BlockItem(ModBlocks.WHISKED_GUNPOWDER_BLOCK.get(), new Item.Properties()));

    //materials
    public static final RegistryObject<Item> C260INGOT = ITEMS.register("c260_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> C260NUGGET = ITEMS.register("c260_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> C260SHEET = ITEMS.register("c260_sheet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> C260COIL = ITEMS.register("c260_coil", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> C260PLATE = ITEMS.register("c260_plate"), () -> new Item(new Item.Properties()));

    //empties
    public static final RegistryObject<Item> EMPTYHEAVYPISTOLCARTRIDGE = ITEMS.register("empty_heavy_pistol_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPTYPISTOLCARTRIDGE = ITEMS.register("empty_pistol_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPTYRIFLECARTRIDGE = ITEMS.register("empty_rifle_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPTYSHOTGUNSHELL = ITEMS.register("empty_shotgun_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPTYSNIPERCARTRIDGE = ITEMS.register("empty_sniper_cartridge", () -> new Item(new Item.Properties()));

    //transitional items
    public static final RegistryObject<Item> INCOMPLETEHEAVYPISTOLCARTRIDGE = ITEMS.register("incomplete_heavy_pistol_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEPISTOLCARTRIDGE = ITEMS.register("incomplete_pistol_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETERIFLECARTRIDGE = ITEMS.register("incomplete_rifle_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETESHOTGUNSHELL = ITEMS.register("incomplete_shotgun_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETESNIPERCARTRIDGE = ITEMS.register("incomplete_sniper_cartridge", () -> new Item(new Item.Properties()));

    //forms and tools
    public static final RegistryObject<Item> CARTFORM9MM = ITEMS.register("9mm_cartridge_form", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PISTOLCARTPUNCH = ITEMS.register("pistol_cartridge_punch", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
