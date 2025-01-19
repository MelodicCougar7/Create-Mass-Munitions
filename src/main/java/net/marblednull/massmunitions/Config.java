package net.marblednull.massmunitions;
//credit to Leducklet/Corrineduck for code inspiration here.
//import com.simibubi.create.infrastructure.config.CClient;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Config {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static ForgeConfigSpec.ConfigValue<List<String>> CASING_TO_GUNID = BUILDER.define("gunCasingMatch", List.of("tacz:glock_17|massmunitions:556x45_casing", "tacz:cz75|massmunitions:50bmg_casing"));

    public static final ForgeConfigSpec SPEC = BUILDER.build();

}