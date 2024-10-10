package net.marblednull.massmunitions;

import com.mojang.logging.LogUtils;
import net.marblednull.massmunitions.init.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MassMunitions.MODID)
public class MassMunitions
{
    public static final String MODID = "massmunitions";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MassMunitions()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }
    
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }
    //help from and credit to Leducklet/Corrineduck
    public static void shootEvent(GunShootEvent event) {
        if (event.getLogicalSide().isServer()) {
           
            if (event.getGunItemStack().getTag().getString("GunId").equals("tacz:m4a1")) {
                event.getShooter().addItem(ItemEntity casing = new 
                    ItemEntity(event.getShooter().level(), 
                               event.getShooter().getX(), 
                               event.getShooter().getY(), 
                               event.getShooter().getZ(), new 
                               ItemStack(ModItems.CASING556X45));
                               casing.setNoPickUpDelay();
                    event.getShooter().level().addFreshEntity(casing););
            }
        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value =S Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
    //help from and credit to Leducklet/Corrineduck
    public Massmunitions() {
        IEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
    //register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this)
        MinecraftForge.EVENT_BUS.register(new EventTest()); //EventTest needs to be the name of the other class
    }
}
