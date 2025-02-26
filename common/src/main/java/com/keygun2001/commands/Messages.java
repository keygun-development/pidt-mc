package com.keygun2001.commands;

import java.util.Map;

public class Messages {
    private static final Map<String, String> MESSAGES = Map.of(
            "error.too_many_args", "§cError: Too many arguments! Maximum allowed: {max}.",
            "error.unknown_command", "§cUnknown command: {command}",
            "help.available_commands", "Available commands:",
            "help.command_usage", "Help for command: {command}",
            "error.general", "§cError: {message}",
            "error.too_few_args", "§cError: Too few arguments! Minimum required: {min}.",
            "error.invalid_command", "§cError: Invalid command!"
    );

    public static String get(String key, Object... placeholders) {
        String message = MESSAGES.getOrDefault(key, "§c[Missing message: " + key + "]");

        for (int i = 0; i < placeholders.length; i += 2) {
            String placeholder = placeholders[i].toString();
            String value = placeholders[i + 1].toString();
            message = message.replace("{" + placeholder + "}", value);
        }

        return message;
    }
}
