
package net.marblednull.massmunitions.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.marblednull.massmunitions.fluid.WhiskedgunpowderFluid;
import net.marblednull.massmunitions.MassMunitions;

public class WhiskedgunpowderBlock {
    public static final DeferredRegister<Fluid> BLOCKS = DeferredRegister.create(ForgeRegistries.FLUIDS, MassMunitions.MODID);
    public static final RegistryObject<FlowingFluid> WHISKEDGUNPOWDER = BLOCKS.register("whiskedgunpowder", () -> new WhiskedgunpowderFluid.Source());
    public static final RegistryObject<FlowingFluid> FLOWING_WHISKEDGUNPOWDER = BLOCKS.register("flowing_whiskedgunpowder", () -> new WhiskedgunpowderFluid.Flowing());

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class FluidsClientSideHandler {
        @SubscribeEvent
        public static void clientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(WHISKEDGUNPOWDER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(FLOWING_WHISKEDGUNPOWDER.get(), RenderType.translucent());
        }
    }
}
