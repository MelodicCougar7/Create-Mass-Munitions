package net.marblednull.massmunitions.init.Fluid;

import com.simibubi.create.AllFluids;
import net.marblednull.massmunitions.MassMunitions;
import net.marblednull.massmunitions.init.ModBlocks;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids extends AllFluids {

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, MassMunitions.MODID);

    public static final RegistryObject<FlowingFluid> WHISKED_GUNPOWDER_SOURCE = FLUIDS.register("whisked_gunpowder_source",
            () -> new ForgeFlowingFluid.Source(ModFluids.WHISKED_GUNPOWDER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> WHISKED_GUNPOWDER_FLOWING = FLUIDS.register("whisked_gunpowder_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.WHISKED_GUNPOWDER_PROPERTIES));


    public static final ForgeFlowingFluid.Properties WHISKED_GUNPOWDER_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.WHISKED_GUNPOWDER_FLUID, WHISKED_GUNPOWDER_SOURCE, WHISKED_GUNPOWDER_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.WHISKED_GUNPOWDER_BLOCK);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
