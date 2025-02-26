package com.keygun2001.fabric.client;

import com.keygun2001.fabric.providers.CommandServiceProvider;
import com.keygun2001.fabric.providers.EventServiceProvider;
import net.fabricmc.api.ClientModInitializer;

public final class PidtMcClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        CommandServiceProvider cmdServiceProvider = new CommandServiceProvider();
        EventServiceProvider eventServiceProvider = new EventServiceProvider();

        // Register service providers
        cmdServiceProvider.register();
        eventServiceProvider.register();

        // Boot service providers
        // cmdServiceProvider.boot();
        // eventServiceProvider.boot();
    }
}
