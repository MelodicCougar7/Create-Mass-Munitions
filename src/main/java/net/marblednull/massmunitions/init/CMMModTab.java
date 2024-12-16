package net.marblednull.massmunitions.init;

import net.marblednull.massmunitions.MassMunitions;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
// conditionality dev
import static net.marblednull.massmunitions.MassMunitions.TACZ_PRESENT;

public class CMMModTab {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MassMunitions.MODID);

    public static final RegistryObject<CreativeModeTab> CMM = TABS.register("massmunitions",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.massmunitions"))
                    .icon(() -> new ItemStack(CMMModItems.C260INGOT.get()))
                    .displayItems((displayParameters, pOutput) -> {

                        // ALWAYS LOADED
                        // resources and materials
                        pOutput.accept(CMMModItems.C260INGOT.get());
                        pOutput.accept(CMMModItems.C260NUGGET.get());
                        pOutput.accept(CMMModItems.C260SHEET.get());
                        pOutput.accept(CMMModItems.C260COIL.get());
                        pOutput.accept(CMMModItems.C260PLATE.get());
                        pOutput.accept(CMMModItems.PRIMER.get());
                        pOutput.accept(CMMModItems.PRIMER_CAP.get());
                        //TACZ ONLY
                        if (TACZ_PRESENT) {
                            // casings by ammo
                            pOutput.accept(TACZModItems.CASING9MM.get());
                            pOutput.accept(TACZModItems.CASING12G.get());
                            pOutput.accept(TACZModItems.CASING45ACP.get());
                            pOutput.accept(TACZModItems.CASING308.get());
                            pOutput.accept(TACZModItems.CASING50AE.get());
                            pOutput.accept(TACZModItems.CASING338.get());
                            pOutput.accept(TACZModItems.CASING357MAG.get());
                            pOutput.accept(TACZModItems.CASING556X45.get());
                            pOutput.accept(TACZModItems.CASING50BMG.get());
                            // bullets by category
                            pOutput.accept(TACZModItems.HEAVYPISTOLBULLET.get());
                            pOutput.accept(TACZModItems.PISTOLBULLET.get());
                            pOutput.accept(TACZModItems.RIFLEBULLET.get());
                            //pOutput.accept(ModItems.SHOT.get());
                            pOutput.accept(TACZModItems.SNIPERBULLET.get());
                            // bullets by ammo
                            pOutput.accept(TACZModItems.BULLET_9MM.get());
                            pOutput.accept(TACZModItems.BULLET_45ACP.get());
                            pOutput.accept(TACZModItems.SHOT.get());
                            pOutput.accept(TACZModItems.BULLET_50BMG.get());
                            // transitional cartridges
                            pOutput.accept(TACZModItems.INCOMPLETEHEAVYPISTOLCARTRIDGE.get());
                            pOutput.accept(TACZModItems.INCOMPLETEHEAVYPISTOLCARTRIDGE.get());
                            pOutput.accept(TACZModItems.INCOMPLETEPISTOLCARTRIDGE.get());
                            pOutput.accept(TACZModItems.INCOMPLETERIFLECARTRIDGE.get());
                            pOutput.accept(TACZModItems.INCOMPLETESHOTGUNSHELL.get());
                            pOutput.accept(TACZModItems.INCOMPLETESNIPERCARTRIDGE.get());
                            // empty casings
                            pOutput.accept(TACZModItems.EMPTYHEAVYPISTOLCARTRIDGE.get());
                            pOutput.accept(TACZModItems.EMPTYPISTOLCARTRIDGE.get());
                            pOutput.accept(TACZModItems.EMPTYRIFLECARTRIDGE.get());
                            pOutput.accept(TACZModItems.EMPTYSHOTGUNSHELL.get());
                            pOutput.accept(TACZModItems.EMPTYSNIPERCARTRIDGE.get());
                            // transitional casings
                            pOutput.accept(TACZModItems.INCOMPLETE9MMCASING.get());
                            pOutput.accept(TACZModItems.INCOMPLETE45ACPCASING.get());
                            pOutput.accept(TACZModItems.INCOMPLETE388CASING.get());
                            pOutput.accept(TACZModItems.INCOMPLETE308CASING.get());
                            pOutput.accept(TACZModItems.INCOMPLETE357MAGCASING.get());
                            pOutput.accept(TACZModItems.INCOMPLETE50BMGCASING.get());
                            pOutput.accept(TACZModItems.INCOMPLETE12GCASING.get());
                            pOutput.accept(TACZModItems.INCOMPLETE50AECASING.get());
                            pOutput.accept(TACZModItems.INCOMPLETE556X45CASING.get());
                            // cartridge forms by ammo
                            pOutput.accept(TACZModItems.CARTFORM9MM.get());
                            //casing punches by category
                            pOutput.accept(TACZModItems.PISTOLCARTPUNCH.get());
                        }



                    })
                    .build()
    );
    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}