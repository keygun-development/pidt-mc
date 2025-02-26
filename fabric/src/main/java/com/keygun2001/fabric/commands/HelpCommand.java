package com.keygun2001.fabric.commands;

import com.keygun2001.commands.AbstractClientCommand;
import com.keygun2001.commands.CommandRegistry;
import com.keygun2001.commands.Messages;
import com.keygun2001.fabric.commands.arguments.ArgumentConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;

public class HelpCommand extends AbstractClientCommand {
    public HelpCommand() {
        super("help",
                "Lists all available commands",
                "*pidt help | *pidt help <command> (for a specific command)"
        );
    }

    @Override
    public void execute(String[] args) {
        Minecraft client = Minecraft.getInstance();
        LocalPlayer player = client.player;
        if (player != null) {
            ArgumentConsumer argConsumer = new ArgumentConsumer(args);

            try {
                argConsumer.requireMax(1);
            } catch (IllegalArgumentException e) {
                player
                        .sendSystemMessage(Component
                                .literal(Messages
                                        .get("error.too_many_args",
                                                "max",
                                                "1"
                                        )
                                )
                        );
                return;
            }

            if (argConsumer.hasArgs()) {
                String commandName = argConsumer.getFirst();

                if (CommandRegistry.get(commandName) != null) {
                    player
                            .sendSystemMessage(Component
                                    .literal(Messages
                                            .get("help.command_usage",
                                                    "command",
                                                    commandName
                                            )
                                    )
                                    .setStyle(Style
                                            .EMPTY
                                            .withColor(TextColor
                                                    .fromRgb(0x00FFFF)
                                            )
                                    )
                            );

                    player
                            .sendSystemMessage(Component
                                    .literal(CommandRegistry
                                            .get(commandName)
                                            .getUsage()
                                    )
                                    .setStyle(Style
                                            .EMPTY
                                            .withColor(TextColor
                                                    .fromRgb(0x00FFFF)
                                            )
                                    )
                            );
                } else {
                    player
                            .sendSystemMessage(Component
                                    .literal(Messages
                                            .get("error.unknown_command",
                                                    "command",
                                                    commandName)
                                    )
                            );
                }
            } else {
                player
                        .sendSystemMessage(Component
                                .literal(Messages
                                        .get("help.available_commands")
                                )
                        );

                for (String command : CommandRegistry.list()) {
                    String usage = CommandRegistry
                            .get(command)
                            .getUsage();

                    player
                            .sendSystemMessage(Component
                                    .literal(usage)
                                    .setStyle(Style
                                            .EMPTY
                                            .withColor(TextColor
                                                    .fromRgb(0x00FFFF)
                                            )
                                    )
                            );
                }
            }
        }
    }
}
