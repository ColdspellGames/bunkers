package com.coldspell.bunkers.processors;

import com.coldspell.bunkers.BunkersMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModProcessors {
    public static final DeferredRegister<StructureProcessorType<?>> STRUCTURE_PROCESSOR = DeferredRegister.create(Registries.STRUCTURE_PROCESSOR, BunkersMod.MOD_ID);

    public static final RegistryObject<StructureProcessorType<WaterloggingFixProcessor>> WATERLOGGING_FIX_PROCESSOR = STRUCTURE_PROCESSOR.register("waterlogging_fix",
            ()-> (StructureProcessorType<WaterloggingFixProcessor>) () -> WaterloggingFixProcessor.CODEC);

    public static void register(IEventBus eventBus) {
        STRUCTURE_PROCESSOR.register(eventBus);
    }

}