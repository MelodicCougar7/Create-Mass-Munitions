package net.marblednull.massmunitions;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;
import net.minecraftforge.common.crafting.conditions.ICondition;

public class CustomCondition implements ICondition {
    public static final ResourceLocation NAME = new ResourceLocation("mass_munitions", "valid_cmm_recipe_selection");

    private final boolean shouldLoad;

    public CustomCondition(boolean shouldLoad) {
        this.shouldLoad = shouldLoad;
    }

    @Override
    public ResourceLocation getID() {
        return NAME;
    }

    @Override
    public boolean test(IContext context) {
        return shouldLoad;
    }

    // 👇 INNER static class, inside CustomCondition.java
    public static class Serializer implements IConditionSerializer<CustomCondition> {
        @Override
        public void write(JsonObject json, CustomCondition value) {
            json.addProperty("shouldLoad", value.shouldLoad);
        }

        @Override
        public CustomCondition read(JsonObject json) {
            boolean shouldLoad = json.get("shouldLoad").getAsBoolean();
            return new CustomCondition(shouldLoad);
        }

        @Override
        public ResourceLocation getID() {
            return NAME;
        }
    }
}