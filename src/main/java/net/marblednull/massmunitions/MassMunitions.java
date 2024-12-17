package net.marblednull.massmunitions;

import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.item.ItemDescription;
import com.simibubi.create.foundation.item.KineticStats;
import com.simibubi.create.foundation.item.TooltipHelper;
import com.simibubi.create.foundation.item.TooltipModifier;
import net.marblednull.massmunitions.init.*;
import net.marblednull.massmunitions.init.Fluid.ModFluidTypes;
import net.marblednull.massmunitions.init.Fluid.ModFluids;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
//unused import related to subtitle implemenation, which will be attempted at a far later date
import static com.simibubi.create.Create.REGISTRATE;

@Mod(MassMunitions.MODID)
public class MassMunitions
{
    public static final String MODID = "massmunitions";
    private static final Logger LOGGER = LogUtils.getLogger();
    //conditionality related mod presence checks
    public static final boolean TACZ_PRESENT = ModList.get().isLoaded("tacz");
    public static final boolean POINTBLANK_PRESENT = ModList.get().isLoaded("pointblank");
    public static final boolean SCGUNS_PRESENT = ModList.get().isLoaded("scguns");
    public static final boolean JEG_PRESENT = ModList.get().isLoaded("tacz");
    //public static final boolean GCAA_PRESENT = ModList.get().isLoaded("tacz");
    //bugs in GCAA and GCRR prevent implementation unforunately. Placeholder boolean logic will remain as a reminder.

    public MassMunitions()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        ModBlocks.register(modEventBus);
        // basic materials, always loaded
        CMMModItems.register(modEventBus);

        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        //conditionality built in, always loaded
        CMMModTab.register(modEventBus);

        if (TACZ_PRESENT) {
            TACZModItems.register(modEventBus);
            modEventBus.addListener(ModEvents::commonSetup);
            LOGGER.info("CMM: TACZ events registering.");
        }
        if (POINTBLANK_PRESENT) {
            VPBModItems.register(modEventBus);
            //not yet, need corrine's gunshootevent code for vpb
            //modEventBus.addListener(ModEvents::commonSetup);
            LOGGER.info("CMM: VPB events registering.");
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();



   }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)  {
        }

    }
}
