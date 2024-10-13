package net.marblednull.massmunitions.init;

import net.marblednull.massmunitions.MassMunitions;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MassMunitions.MODID);

    public static final RegistryObject<CreativeModeTab> MCORE = TABS.register("massmunitions",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.massmunitions"))
                    .icon(() -> new ItemStack(ModItems.EMPTYHEAVYPISTOLCARTRIDGE.get()))
                    .displayItems((displayParameters, pOutput) -> {

                        pOutput.accept(ModItems.CASING9MM.get());
                        pOutput.accept(ModItems.CASING12G.get());
                        pOutput.accept(ModItems.CASING45ACP.get());
                        pOutput.accept(ModItems.CASING308.get());
                        pOutput.accept(ModItems.CASING50AE.get());
                        pOutput.accept(ModItems.CASING338.get());
                        pOutput.accept(ModItems.CASING357MAG.get());
                        pOutput.accept(ModItems.CASING556X45.get());
                        pOutput.accept(ModItems.HEAVYPISTOLBULLET.get());
                        pOutput.accept(ModItems.PISTOLBULLET.get());
                        pOutput.accept(ModItems.RIFLEBULLET.get());
                        pOutput.accept(ModItems.SHOT.get());
                        pOutput.accept(ModItems.SNIPERBULLET.get());
                        pOutput.accept(ModItems.INCOMPLETEHEAVYPISTOLCARTRIDGE.get());
                        pOutput.accept(ModItems.EMPTYHEAVYPISTOLCARTRIDGE.get());
                        pOutput.accept(ModItems.EMPTYPISTOLCARTRIDGE.get());
                        pOutput.accept(ModItems.EMPTYRIFLECARTRIDGE.get());
                        pOutput.accept(ModItems.EMPTYSHOTGUNSHELL.get());
                        pOutput.accept(ModItems.EMPTYSNIPERCARTRIDGE.get());
                        pOutput.accept(ModItems.INCOMPLETEHEAVYPISTOLCARTRIDGE.get());
                        pOutput.accept(ModItems.INCOMPLETEPISTOLCARTRIDGE.get());
                        pOutput.accept(ModItems.INCOMPLETERIFLECARTRIDGE.get());
                        pOutput.accept(ModItems.INCOMPLETESHOTGUNSHELL.get());
                        pOutput.accept(ModItems.INCOMPLETESNIPERCARTRIDGE.get());
                        pOutput.accept(ModItems.PRIMER.get());
                        pOutput.accept(ModItems.WHISKED_GUNPOWER_BUCKET.get());

                    })
                    .build()
    );
    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
