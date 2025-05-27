package net.marblednull.massmunitions;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;
import net.minecraftforge.common.crafting.conditions.ICondition;

public class oneToOneCondition implements ICondition {
    public static final ResourceLocation NAME = new ResourceLocation("massmunitions", "valid_cmm_recipe_selection_1-1");

    private final boolean shouldLoad;

    public oneToOneCondition(boolean shouldLoad) {
        this.shouldLoad = Config.ONE_TO_ONE.get();
    }

    @Override
    public ResourceLocation getID() {
        return NAME;
    }

    @Override
    public boolean test(IContext context) {
        return shouldLoad;
    }

    public static class Serializer implements IConditionSerializer<oneToOneCondition> {
        @Override
        public void write(JsonObject json, oneToOneCondition value) {
            json.addProperty("shouldLoad1-1", value.shouldLoad);
        }

        @Override
        public oneToOneCondition read(JsonObject json) {

            return new oneToOneCondition(Config.ONE_TO_ONE.get()); // potentially redundant call, will fix later if needed
        }

        @Override
        public ResourceLocation getID() {
            return NAME;
        }
    }
}