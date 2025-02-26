package com.keygun2001.commands;

public interface IClientCommand {
    /**
     * Executes the command with the given arguments.
     * @param args The arguments passed to the command.
     */
    void execute(String[] args);

    /**
     * Gets the usage of the command.
     * @return The usage of the command.
     */
    String getUsage();

    /**
     * Gets the command name.
     * @return The name of the command.
     */
    String getName();

    /**
     * Gets the command description.
     * @return The description of the command.
     */
    String getDescription();
}
