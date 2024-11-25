package net.marblednull.massmunitions.init;

import net.marblednull.massmunitions.MassMunitions;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.marblednull.massmunitions.fluid.types.WhiskedgunpowderFluidType;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MassMunitions.MODID);
    public static final RegistryObject<FluidType> WHISKEDGUNPOWDER_TYPE = REGISTRY.register("whiskedgunpowder", () -> new WhiskedgunpowderFluidType());
}
