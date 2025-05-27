package net.marblednull.massmunitions;
//credit to Leducklet/Corrineduck for code inspiration here.
//import com.simibubi.create.infrastructure.config.CClient;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.List;

public class Config {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> ONE_TO_ONE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ONE_POINT_ONE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ONE_POINT_ONE_ONE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ONE_TO_FUN;
    public static final ForgeConfigSpec.ConfigValue<Boolean> RECIPE_OVERRIDE;

    static {
        BUILDER.push("one_to_one");
        ONE_TO_ONE = BUILDER
            .comment("Recipe style will be fairly 1-1, with some generalizations for gameplay.")
            .comment("Only base materials, no brass. Simulates bullets. When rounding must be done, it is rounded down.")
            .define("one_to_one", true); // Default true. Let's be honest, CMM's claim to fame is balanced production. This is simplest and best for that.

        BUILDER.pop();

        BUILDER.push("one_point_one");
        ONE_POINT_ONE = BUILDER
            .comment("Recipe style will be 1.0-1.0, with some minor generalizations for gameplay.")
            .comment("Uses brass for casings and simulates bullets. When rounding must be done, it is rounded down.")
            .comment("Involves minor chances for failure for averaged balance.")
            .define("one_point_one", false); // Default false

        BUILDER.pop();

        BUILDER.push("one_point_one_one");
        ONE_POINT_ONE_ONE = BUILDER
                .comment("Recipe style will be 1.00-1.00. Absolute adherence to base recipes at the cost of realism.")
                .comment("Only base materials, no brass. Rounding unnecessary.")
                .comment("I personally don't recommend this one, but it is the one that will allow your players to automate ammo with the recipes that the dev of your gun mod intended.")
                .define("one_point_one_one", false); // Default false

        BUILDER.pop();

        BUILDER.push("one_to_fun");
        ONE_TO_FUN = BUILDER
                .comment("Recipe style will be 0.1 - 0.1. Substantial deviance from base mods.")
                .comment("Uses brass for casings and simulates bullets. Attempts to be as fun and as close to real life processes as possible in a vanilla friendly way.")
                .define("one_to_fun", false); // Default false

        BUILDER.pop();

        BUILDER.push("recipe_override");
        RECIPE_OVERRIDE = BUILDER
                .comment("Overrides the game closing event triggered if the true number of above configs is not 1. Please, keep this disabled. I do not guarantee anything will work with it off.")
                .define("recipe_override", false); // Default false. Please, keep it that way

        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}