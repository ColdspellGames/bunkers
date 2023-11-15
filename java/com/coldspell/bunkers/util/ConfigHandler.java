package com.coldspell.bunkers.util;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;

public class ConfigHandler {
    public static final Builder BUILDER = new Builder();
    public static final ConfigHandler$Settings SETTINGS;
    public static final ForgeConfigSpec spec;
    public ConfigHandler() {
    }

    static {
        SETTINGS = new ConfigHandler$Settings(BUILDER);
        spec = BUILDER.build();
    }
}
