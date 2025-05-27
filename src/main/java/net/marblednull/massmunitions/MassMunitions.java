package net.marblednull.massmunitions;

import com.mojang.logging.LogUtils;

import net.marblednull.massmunitions.init.*;
import net.marblednull.massmunitions.init.Fluid.ModFluidTypes;
import net.marblednull.massmunitions.init.Fluid.ModFluids;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.CraftingHelper;
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
//import static com.simibubi.create.Create.REGISTRATE;

@Mod(MassMunitions.MODID)
public class MassMunitions {
    public static final String MODID = "massmunitions";
    private static final Logger LOGGER = LogUtils.getLogger();
    //conditionality related mod presence checks
    public static final boolean TACZ_PRESENT = ModList.get().isLoaded("tacz");
    public static final boolean POINTBLANK_PRESENT = ModList.get().isLoaded("pointblank");
    public static final boolean SCGUNS_PRESENT = ModList.get().isLoaded("scguns");
    public static final boolean JEG_PRESENT = ModList.get().isLoaded("jeg"); // not confirmed to be correct
    //public static final boolean GCAA_PRESENT = ModList.get().isLoaded("gcaa"); // not confirmed to be correct
    //bugs in GCAA and GCRR prevent implementation, unfortunately. Placeholder boolean logic will remain as a reminder.

    public MassMunitions() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        ModBlocks.register(modEventBus);
        // basic materials, always loaded
        CMMModItems.register(modEventBus);

        // always register the recipe separating logic
        CraftingHelper.register(new oneToOneCondition.Serializer());

        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        //conditionality built in, always loaded
        CMMModTab.register(modEventBus);

        // REWORK SUCH THAT THESE ONLY AFFECT THE BOOLEAN DETERMINATION OF A VALID RECIPE CONFIG
        if (TACZ_PRESENT) {
            TACZModItems.register(modEventBus);

            LOGGER.info("CMM: TACZ events registering.");
        }
        if (POINTBLANK_PRESENT) {
            VPBModItems.register(modEventBus);
            //not yet, need corrine's gunshootevent code for vpb
            //modEventBus.addListener(ModEvents::commonSetup);
            LOGGER.info("CMM: VPB events registering.");
        }

        // determine if an invalid set of recipes has been triggered
        int RecipeStyleCounter = 0; // default is zero, should only ever be one.
        Boolean[] configs = {Config.ONE_TO_ONE.get(), Config.ONE_POINT_ONE.get(), Config.ONE_POINT_ONE_ONE.get(), Config.ONE_TO_FUN.get()};

        if (!Config.RECIPE_OVERRIDE.get()) {
            for (int i = 0; i < configs.length; i++ ) {
                if (configs[i] = Boolean.TRUE) {
                    RecipeStyleCounter += 1;
                }
            }
            if (RecipeStyleCounter > 1) {
                throw new RuntimeException("You have selected more than 1 recipe style. Pick ONE or enable the override to ignore this.");
            }
            if (RecipeStyleCounter < 1) {
                throw new RuntimeException("You have not selected a recipe style. Pick ONE or enable the override to ignore this.");
            }
        }

        // determine which conditions to enable




    } // main class ends on this bracket

    private void commonSetup(final FMLCommonSetupEvent event) {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }


    }

}