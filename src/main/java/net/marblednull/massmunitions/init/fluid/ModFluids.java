package net.marblednull.massmunitions.init.fluid;

import net.marblednull.massmunitions.MassMunitions;
import net.marblednull.massmunitions.init.ModBlocks;
import net.marblednull.massmunitions.init.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, MassMunitions.MODID);

    public static final RegistryObject<FlowingFluid> WHISKED_GUNPOWDER_STILL = FLUIDS.register("whisked_gunpowder_still",
            () -> new ForgeFlowingFluid.Source(ModFluids.WHISKED_GUNPOWDER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> WHISKED_GUNPOWDER_FLOWING = FLUIDS.register("whisked_gunpowder_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.WHISKED_GUNPOWDER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties WHISKED_GUNPOWDER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.WHISKED_GUNPOWDER, WHISKED_GUNPOWDER_STILL, WHISKED_GUNPOWDER_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.WHISKED_GUNPOWDER_BLOCK)
            .bucket(ModItems.WHISKED_GUNPOWER_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
