package com.keygun2001;

import dev.architectury.platform.Platform;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PidtMC {
    public static final String MOD_ID = "pidtmc";
    public static final Logger LOGGER = LoggerFactory.getLogger("pidtmc");

    public static void init() {
        if (Platform.isFabric()) {
            LOGGER.info("PidtMC is running on Fabric!");
        } else if (Platform.isFabric()) {
            LOGGER.info("PidtMC is running on Forge!");
        }
    }
}
