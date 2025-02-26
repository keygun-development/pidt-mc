package com.keygun2001.fabric.providers;

import com.keygun2001.commands.CommandRegistry;
import com.keygun2001.fabric.commands.AddCommand;
import com.keygun2001.fabric.commands.HelpCommand;
import com.keygun2001.providers.ServiceProvider;

public class CommandServiceProvider extends ServiceProvider {
    @Override
    public void register() {
        // Add more commands here
        CommandRegistry.register(new HelpCommand());
        CommandRegistry.register(new AddCommand());
    }

    @Override
    public void boot() {
        // TODO: Implement boot() method.
    }
}
