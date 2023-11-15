package com.coldspell.bunkers.util;

import com.coldspell.bunkers.BunkersMod;
import com.coldspell.bunkers.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = BunkersMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BunkersCreativeTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BunkersMod.MOD_ID);

    public static final List<Supplier<? extends ItemLike>> EXAMPLE_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> GOTCHA_TAB = TABS.register("bunkers_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("tab.bunkers.title"))
                    .icon(ModItems.STYLIZED_PLATED_BUNKITE_ITEM.get()::getDefaultInstance)
                    .displayItems((display, output) -> {
                        EXAMPLE_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build());

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        EXAMPLE_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {

    }

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
