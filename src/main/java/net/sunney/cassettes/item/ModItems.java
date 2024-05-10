package net.sunney.cassettes.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sunney.cassettes.Cassettes;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Cassettes.MOD_ID);

    public static final RegistryObject<Item> CASSETTE = ITEMS.register("cassette",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLANK_CASSETTE = ITEMS.register("blank_cassette",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
