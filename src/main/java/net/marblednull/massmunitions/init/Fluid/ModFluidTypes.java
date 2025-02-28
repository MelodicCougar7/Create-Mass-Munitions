package net.marblednull.massmunitions.init.Fluid;
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
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation(MassMunitions.MODID, "misc/in_soap_water");
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MassMunitions.MODID);
    public static final RegistryObject<FluidType> WHISKED_GUNPOWDER_FLUID = register("whisked_gunpowder_fluid",
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5));
    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL,
                0xA1E038D0, new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));
    }
    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
