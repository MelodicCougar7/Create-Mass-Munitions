package net.marblednull.massmunitions.init;

import net.marblednull.massmunitions.MassMunitions;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VPBModItems {
    public static final DeferredRegister<Item> VPBITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MassMunitions.MODID);

    //casings
    public static final RegistryObject<Item> CATO_CASING45ACP = VPBITEMS.register("cato_45acp_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_CASING9MM = VPBITEMS.register("cato_9mm_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_CASING338 = VPBITEMS.register("cato_338_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_CASING308 = VPBITEMS.register("cato_308_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_CASING357MAG = VPBITEMS.register("cato_357mag_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_CASING50BMG = VPBITEMS.register("cato_50bmg_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_CASING12G = VPBITEMS.register("cato_12g_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_CASING50AE = VPBITEMS.register("cato_50ae_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_CASING556X45 = VPBITEMS.register("cato_556x45_casing", () -> new Item(new Item.Properties()));

    //bullets



    public static final RegistryObject<Item> CATO_BULLET_9MM = VPBITEMS.register("cato_9mm_bullet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_SHOT = VPBITEMS.register("cato_shot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BULLET_45ACP = VPBITEMS.register("cato_45acp_bullet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BULLET_50BMG = VPBITEMS.register("cato_50bmg_bullet", () -> new Item(new Item.Properties()));

    //empties
    public static final RegistryObject<Item> CATO_EMPTY_HEAVY_PISTOL_CARTRIDGE = VPBITEMS.register("cato_empty_heavy_pistol_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_EMPTY_PISTOL_CARTRIDGE = VPBITEMS.register("cato_empty_pistol_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_EMPTY_RIFLE_CARTRIDGE = VPBITEMS.register("cato_empty_rifle_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_EMPTY_SHOTGUN_SHELL = VPBITEMS.register("cato_empty_shotgun_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_EMPTY_SNIPER_CARTRIDGE = VPBITEMS.register("cato_empty_sniper_cartridge", () -> new Item(new Item.Properties()));

    //transitional items
    public static final RegistryObject<Item> CATO_INCOMPLETE_HEAVY_PISTOL_CARTRIDGE = VPBITEMS.register("cato_incomplete_heavy_pistol_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_INCOMPLETE_PISTOL_CARTRIDGE = VPBITEMS.register("cato_incomplete_pistol_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_INCOMPLETE_RIFLE_CARTRIDGE = VPBITEMS.register("cato_incomplete_rifle_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_INCOMPLETE_SHOTGUN_SHELL = VPBITEMS.register("cato_incomplete_shotgun_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_INCOMPLETE_SNIPER_CARTRIDGE = VPBITEMS.register("cato_incomplete_sniper_cartridge", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CATO_INCOMPLETE_9_MM_CASING = VPBITEMS.register("cato_incomplete_9mm_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_INCOMPLETE_45_ACP_CASING = VPBITEMS.register("cato_incomplete_45acp_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_INCOMPLETE_388_CASING = VPBITEMS.register("cato_incomplete_388_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_INCOMPLETE_308_CASING = VPBITEMS.register("cato_incomplete_308_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_INCOMPLETE_357_MAG_CASING = VPBITEMS.register("cato_incomplete_357mag_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_INCOMPLETE_50_BMG_CASING = VPBITEMS.register("cato_incomplete_50bmg_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_INCOMPLETE_12_G_CASING = VPBITEMS.register("cato_incomplete_12g_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_INCOMPLETE_50_AE_CASING = VPBITEMS.register("cato_incomplete_50ae_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_INCOMPLETE_556_X_45_CASING = VPBITEMS.register("cato_incomplete_556x45_casing", () -> new Item(new Item.Properties()));
  
    public static final RegistryObject<Item> CATO_9MM_CARTRIDGE_FORM = VPBITEMS.register("cato_9mm_cartridge_form", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CATO_PISTOL_CARTRIDGE_PUNCH = VPBITEMS.register("cato_pistol_cartridge_punch", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        VPBITEMS.register(eventBus);
    }
}
