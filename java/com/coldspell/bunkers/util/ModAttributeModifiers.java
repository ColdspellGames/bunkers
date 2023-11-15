package com.coldspell.bunkers.util;

import com.coldspell.bunkers.BunkersMod;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModAttributeModifiers {

    public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, BunkersMod.MOD_ID);

    public static final RegistryObject<Attribute> EXPLOSION_RESISTANCE = ATTRIBUTES.register("explosion_resistance",
            ()-> new RangedAttribute("explosion_resistance", 0,0, 30).setSyncable(true));

    public static void register(IEventBus eventBus) {
        ATTRIBUTES.register(eventBus);
    }

}
