package com.coldspell.bunkers;

import com.coldspell.bunkers.blocks.ModBlocks;
import com.coldspell.bunkers.items.ModItems;
import com.coldspell.bunkers.processors.ModProcessors;
import com.coldspell.bunkers.util.BunkersCreativeTab;
import com.coldspell.bunkers.util.ConfigHandler;
import com.coldspell.bunkers.util.ModAttributeModifiers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("bunkers")
public class BunkersMod
{
    public static final String MOD_ID = "bunkers";
    public static final Logger LOG = LogManager.getLogger(MOD_ID);

    public BunkersMod() {
        IEventBus modEventBus= FMLJavaModLoadingContext.get().getModEventBus();

        ModAttributeModifiers.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModProcessors.register(modEventBus);

        BunkersCreativeTab.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHandler.spec);
    }
}