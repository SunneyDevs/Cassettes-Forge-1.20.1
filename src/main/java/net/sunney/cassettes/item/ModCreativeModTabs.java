package net.sunney.cassettes.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sunney.cassettes.Cassettes;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cassettes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CASSETTE_TAB = CREATIVE_MODE_TABS.register("cassette",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.BLANK_CASSETTE.get()))
                    .title(Component.translatable("creativetab.cassette_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.BLANK_CASSETTE.get());
                        pOutput.accept(Moditems.CASSETTE.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
