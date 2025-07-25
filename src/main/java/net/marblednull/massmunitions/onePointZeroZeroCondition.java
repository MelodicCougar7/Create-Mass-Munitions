package net.marblednull.massmunitions;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class onePointZeroZeroCondition implements ICondition {
    public static final ResourceLocation NAME = new ResourceLocation("massmunitions", "valid_cmm_recipe_selection_1.00-1.00");

    private final boolean shouldLoad;

    public onePointZeroZeroCondition(boolean shouldLoad) {
        this.shouldLoad = Config.ONE_POINT_ONE_ONE.get();
    }


    @Override
    public ResourceLocation getID() {
        return NAME;
    }

    @Override
    public boolean test(IContext context) {
        return shouldLoad;
    }

    public static class Serializer implements IConditionSerializer<onePointZeroZeroCondition> {
        @Override
        public void write(JsonObject json, onePointZeroZeroCondition value) {
            json.addProperty("shouldLoad1.1", value.shouldLoad);
        }

        @Override
        public onePointZeroZeroCondition read(JsonObject json) {

            return new onePointZeroZeroCondition(Config.ONE_POINT_ONE_ONE.get()); // potentially redundant call, will fix later if needed
        }

        @Override
        public ResourceLocation getID() {
            return NAME;
        }
    }
}