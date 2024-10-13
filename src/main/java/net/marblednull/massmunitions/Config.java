package net.marblednull.massmunitions;
//credit to Leducklet/Corrineduck for code inspiration here.
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.List;

public class Config {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> RIFLELIST;
    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> PISTOLLIST;
    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> HEAVYPISTOLLIST;
    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> SNIPERLIST;
    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> SHOTGUNLIST;

    static {
        BUILDER.push("riflelist");
       RIFLELIST = BUILDER.comment("Designate rifles to have them drop rifles casings upon use.").defineList("riflelist", List.of("tacz:sks_tactical", "tacz:ak47", "tacz:hk416d", "tacz:m4a1", "tacz:m16a1", "tacz:hk_g3", "tacz:m16a4", "tacz:mk14", "tacz:scar_h", "tacz:scar_l", "tacz:aug", "tacz:m249", "tacz:rpk"), entry -> true);
        BUILDER.pop();

        BUILDER.push("pistollist");
      PISTOLLIST = BUILDER.comment("Designate pistols and smgs to have them drop pistol casings upon use.").defineList("pistollist", List.of("tacz:glock_17", "tacz:cz_75", "tacz:p320", "tacz:uzi", "tacz:ump45", "tacz:hk_mp5a5", "tacz:vector45"), entry -> true);
        BUILDER.pop();

        BUILDER.push("heavypistollist");
        HEAVYPISTOLLIST = BUILDER.comment("Designate heavy pistols to have them drop pistol casings upon use. Redundant atm").defineList("heavypistollist", List.of("tacz:deagle", "tacz:deagle_golden"), entry -> true);
        BUILDER.pop();

        BUILDER.push("sniperlist");
        SNIPERLIST = BUILDER.comment("Designate snipers to have them drop sniper casings upon use.").defineList("sniperlist", List.of("tacz:ai_awp", "tacz:m95"), entry -> true);
        BUILDER.pop();

        BUILDER.push("shotgunlist");
        SHOTGUNLIST = BUILDER.comment("Designate shotguns to have them drop shot casings upon use.").defineList("shotgunlist", List.of("tacz:aa12", "tacz:db_short", "tacz:db_long"), entry -> true);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
