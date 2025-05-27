package net.marblednull.massmunitions;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class onePointOneOneCondition implements ICondition {
    public static final ResourceLocation NAME = new ResourceLocation("massmunitions", "valid_cmm_recipe_selection_1.00-1.00");

    private final boolean shouldLoad;

    public onePointOneOneCondition(boolean shouldLoad) {
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

    public static class Serializer implements IConditionSerializer<onePointOneOneCondition> {
        @Override
        public void write(JsonObject json, onePointOneOneCondition value) {
            json.addProperty("shouldLoad1.1", value.shouldLoad);
        }

        @Override
        public onePointOneOneCondition read(JsonObject json) {

            return new onePointOneOneCondition(Config.ONE_POINT_ONE_ONE.get()); // potentially redundant call, will fix later if needed
        }

        @Override
        public ResourceLocation getID() {
            return NAME;
        }
    }
}