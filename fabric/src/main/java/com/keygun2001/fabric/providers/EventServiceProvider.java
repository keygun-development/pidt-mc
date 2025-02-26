package com.keygun2001.fabric.providers;

import com.keygun2001.fabric.eventlisteners.ChatEventListener;
import com.keygun2001.providers.ServiceProvider;

public class EventServiceProvider extends ServiceProvider {
    @Override
    public void register() {
        // Add more event listeners here
        ChatEventListener.register();
    }

    @Override
    public void boot() {
        // TODO: Implement boot() method.
    }
}
