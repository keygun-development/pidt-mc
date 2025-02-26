package com.keygun2001.commands;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandRegistry {
    private static final Map<String, IClientCommand> commands = new HashMap<>();

    public static void register(IClientCommand command) {
        commands.put(command.getName(), command);
    }

    public static IClientCommand get(String name) {
        return commands.get(name);
    }

    public static void execute(String input) {
        if (input.isEmpty()) {
            return;
        }

        String[] parts = input.split(" ", 2);
        IClientCommand command = commands.get(parts[0]);

        if (command != null) {
            String[] args = parts.length > 1
                    ? parts[1].split(" ")
                    : new String[0];
            command.execute(args);
        }
    }

    public static List<String> list() {
        return List.copyOf(commands.keySet());
    }
}
