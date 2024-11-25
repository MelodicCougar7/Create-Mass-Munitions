package net.marblednull.massmunitions.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.marblednull.massmunitions.init.ModItems;
import net.marblednull.massmunitions.init.ModFluidTypes;
import net.marblednull.massmunitions.init.ModBlocks;
import net.marblednull.massmunitions.init.ModFluids;

public abstract class WhiskedgunpowderFluid extends ForgeFlowingFluid {
    public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ModFluidTypes.WHISKEDGUNPOWDER_TYPE.get(), () -> ModFluids.WHISKEDGUNPOWDER.get(),
            () -> ModFluids.FLOWING_WHISKEDGUNPOWDER.get()).explosionResistance(100f).bucket(() -> ModItems.WHISKED_GUNPOWDER_BUCKET.get()).block(() -> (LiquidBlock) ModBlocks.WHISKEDGUNPOWDER.get());

    private WhiskedgunpowderFluid() {
        super(PROPERTIES);
    }

    public static class Source extends WhiskedgunpowderFluid {
        public int getAmount(FluidState state) {
            return 8;
        }

        public boolean isSource(FluidState state) {
            return true;
        }
    }

    public static class Flowing extends WhiskedgunpowderFluid {
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        public boolean isSource(FluidState state) {
            return false;
        }
    }
}