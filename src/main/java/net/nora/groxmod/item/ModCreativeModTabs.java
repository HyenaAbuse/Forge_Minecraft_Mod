package net.nora.groxmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nora.groxmod.GroxMod;
import net.nora.groxmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GroxMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GROX_TAB = CREATIVE_MODE_TABS.register("grox_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.CUP.get()))
                    .title(Component.translatable("creativetab.grox_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CUP.get());
                        pOutput.accept(ModItems.PILOT.get());
                        pOutput.accept(ModItems.DESPAIR.get());

                        pOutput.accept(Items.GLOW_ITEM_FRAME);

                        pOutput.accept(ModBlocks.FURRY_BLOCK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
