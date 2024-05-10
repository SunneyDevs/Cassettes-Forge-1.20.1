package net.sunney.cassettes.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sunney.cassettes.Cassettes;
import net.sunney.cassettes.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cassettes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CASSETTE_TAB = CREATIVE_MODE_TABS.register("cassette",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLANK_CASSETTE.get()))
                    .title(Component.translatable("creativetab.cassette_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BLANK_CASSETTE.get());
                        pOutput.accept(ModItems.CASSETTE.get());

                        pOutput.accept(ModBlocks.NOSTALGIA_BLOCK.get());
                        pOutput.accept(ModBlocks.PLASTIC_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
