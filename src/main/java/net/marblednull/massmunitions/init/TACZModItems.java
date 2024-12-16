package net.marblednull.massmunitions.init;

import net.marblednull.massmunitions.MassMunitions;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TACZModItems {
    public static final DeferredRegister<Item> TACZITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MassMunitions.MODID);

    //casings
    public static final RegistryObject<Item> CASING45ACP = TACZITEMS.register("45acp_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING9MM = TACZITEMS.register("9mm_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING338 = TACZITEMS.register("338_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING308 = TACZITEMS.register("308_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING357MAG = TACZITEMS.register("357mag_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING50BMG = TACZITEMS.register("50bmg_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING12G = TACZITEMS.register("12g_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING50AE = TACZITEMS.register("50ae_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASING556X45 = TACZITEMS.register("556x45_casing", () -> new Item(new Item.Properties()));

    //ammo
    public static final RegistryObject<Item> PISTOLBULLET = TACZITEMS.register("pistol_bullet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SNIPERBULLET = TACZITEMS.register("sniper_bullet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIFLEBULLET = TACZITEMS.register("rifle_bullet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEAVYPISTOLBULLET = TACZITEMS.register("heavy_pistol_bullet", () -> new Item(new Item.Properties()));

    //categorical bullets above will need to be removed for balance unfortunately
    public static final RegistryObject<Item> BULLET_9MM = TACZITEMS.register("9mm_bullet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHOT = TACZITEMS.register("shot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BULLET_45ACP = TACZITEMS.register("45acp_bullet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BULLET_50BMG = TACZITEMS.register("50bmg_bullet", () -> new Item(new Item.Properties()));

    //empties
    public static final RegistryObject<Item> EMPTYHEAVYPISTOLCARTRIDGE = TACZITEMS.register("empty_heavy_pistol_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPTYPISTOLCARTRIDGE = TACZITEMS.register("empty_pistol_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPTYRIFLECARTRIDGE = TACZITEMS.register("empty_rifle_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPTYSHOTGUNSHELL = TACZITEMS.register("empty_shotgun_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPTYSNIPERCARTRIDGE = TACZITEMS.register("empty_sniper_cartridge", () -> new Item(new Item.Properties()));

    //transitional items
    public static final RegistryObject<Item> INCOMPLETEHEAVYPISTOLCARTRIDGE = TACZITEMS.register("incomplete_heavy_pistol_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETEPISTOLCARTRIDGE = TACZITEMS.register("incomplete_pistol_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETERIFLECARTRIDGE = TACZITEMS.register("incomplete_rifle_cartridge", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETESHOTGUNSHELL = TACZITEMS.register("incomplete_shotgun_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETESNIPERCARTRIDGE = TACZITEMS.register("incomplete_sniper_cartridge", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INCOMPLETE9MMCASING = TACZITEMS.register("incomplete_9mm_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE45ACPCASING = TACZITEMS.register("incomplete_45acp_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE388CASING = TACZITEMS.register("incomplete_388_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE308CASING = TACZITEMS.register("incomplete_308_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE357MAGCASING = TACZITEMS.register("incomplete_357mag_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE50BMGCASING = TACZITEMS.register("incomplete_50bmg_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE12GCASING = TACZITEMS.register("incomplete_12g_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE50AECASING = TACZITEMS.register("incomplete_50ae_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE556X45CASING = TACZITEMS.register("incomplete_556x45_casing", () -> new Item(new Item.Properties()));
  
    public static final RegistryObject<Item> CARTFORM9MM = TACZITEMS.register("9mm_cartridge_form", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PISTOLCARTPUNCH = TACZITEMS.register("pistol_cartridge_punch", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        TACZITEMS.register(eventBus);
    }
}
