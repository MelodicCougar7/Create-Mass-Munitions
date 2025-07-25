package net.marblednull.massmunitions;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class onePointZeroCondition implements ICondition {
    public static final ResourceLocation NAME = new ResourceLocation("massmunitions", "valid_cmm_recipe_selection_1.0-1.0");

    private final boolean shouldLoad;

    public onePointZeroCondition(boolean shouldLoad) {
        this.shouldLoad = Config.ONE_POINT_ONE.get();
    }

    @Override
    public ResourceLocation getID() {
        return NAME;
    }

    @Override
    public boolean test(IContext context) {
        return shouldLoad;
    }

    public static class Serializer implements IConditionSerializer<onePointZeroCondition> {
        @Override
        public void write(JsonObject json, onePointZeroCondition value) {
            json.addProperty("shouldLoad1.1", value.shouldLoad);
        }

        @Override
        public onePointZeroCondition read(JsonObject json) {

            return new onePointZeroCondition(Config.ONE_POINT_ONE.get()); // potentially redundant call, will fix later if needed
        }

        @Override
        public ResourceLocation getID() {
            return NAME;
        }
    }
}