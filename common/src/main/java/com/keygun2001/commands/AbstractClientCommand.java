package com.keygun2001.commands;

public abstract class AbstractClientCommand implements IClientCommand {
    protected final String name;
    protected final String description;
    protected final String usage;

    public AbstractClientCommand(String name, String description, String usage) {
        this.name = name;
        this.description = description;
        this.usage = usage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getUsage() {
        return name.substring(0, 1).toUpperCase() + name.substring(1) + " - " + usage;
    }
}
