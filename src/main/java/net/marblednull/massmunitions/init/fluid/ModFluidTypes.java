package net.marblednull.massmunitions.init.fluid;

import net.marblednull.massmunitions.MassMunitions;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {
    public static final ResourceLocation WHISKED_GUNPOWDER_FLOW_RL = new ResourceLocation("block/whisked_gunpowder_flow");
    public static final ResourceLocation WHISKED_GUNPOWDER_RL = new ResourceLocation("block/whisked_gunpowder");
    public static final ResourceLocation WHISKED_GUNPOWDER_OVERLAY_RL = new ResourceLocation("block/whisked_gunpowder_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MassMunitions.MODID);

    public static final RegistryObject<FluidType> WHISKED_GUNPOWDER = register("whisked_gunpowder",
            FluidType.Properties.create().density(9999).viscosity(9999).sound(SoundAction.get("bucket_empty"),
                    SoundEvents.SAND_PLACE).sound(SoundAction.get("bucket_fill"),
                    SoundEvents.SAND_PLACE).canDrown(true).canSwim(true).supportsBoating(false));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WHISKED_GUNPOWDER_RL, WHISKED_GUNPOWDER_FLOW_RL, WHISKED_GUNPOWDER_OVERLAY_RL,
                0xFF404040, new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
