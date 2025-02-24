package com.keygun2001.fabric;

import net.fabricmc.api.ModInitializer;

import com.keygun2001.PidtMC;

public final class PidtMCFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        PidtMC.init();
    }
}
