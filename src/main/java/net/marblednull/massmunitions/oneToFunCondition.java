package net.marblednull.massmunitions;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class oneToFunCondition implements ICondition {
    public static final ResourceLocation NAME = new ResourceLocation("massmunitions", "valid_cmm_recipe_selection_1-fun");

    private final boolean shouldLoad;

    public oneToFunCondition(boolean shouldLoad) {
        this.shouldLoad = Config.ONE_TO_FUN.get();
    }

    @Override
    public ResourceLocation getID() {
        return NAME;
    }

    @Override
    public boolean test(IContext context) {
        return shouldLoad;
    }

    public static class Serializer implements IConditionSerializer<oneToFunCondition> {
        @Override
        public void write(JsonObject json, oneToFunCondition value) {
            json.addProperty("shouldLoad1-fun", value.shouldLoad);
        }

        @Override
        public oneToFunCondition read(JsonObject json) {

            return new oneToFunCondition(Config.ONE_TO_FUN.get()); // potentially redundant call, will fix later if needed
        }

        @Override
        public ResourceLocation getID() {
            return NAME;
        }
    }
}