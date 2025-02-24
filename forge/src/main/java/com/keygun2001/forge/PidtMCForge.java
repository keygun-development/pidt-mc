package com.keygun2001.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.keygun2001.PidtMC;

@Mod(PidtMC.MOD_ID)
public final class PidtMCForge {
    public PidtMCForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(PidtMC.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        PidtMC.init();
    }
}
