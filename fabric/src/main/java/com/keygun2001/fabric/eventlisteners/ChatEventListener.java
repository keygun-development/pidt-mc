package com.keygun2001.fabric.eventlisteners;

import com.keygun2001.commands.CommandRegistry;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents;

public class ChatEventListener {
    public static void register() {
        ClientSendMessageEvents.ALLOW_CHAT.register((message) -> {
            if (message.startsWith("*pidt")) {
                String commandString = message.length() > 6 ? message.substring(6).trim() : "";

                if (commandString.isEmpty()) {
                    return false;
                }

                CommandRegistry.execute(commandString);
                return false;
            }
            return true;
        });
    }
}
