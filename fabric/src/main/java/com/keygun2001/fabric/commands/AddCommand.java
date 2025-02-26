package com.keygun2001.fabric.commands;

import com.keygun2001.commands.AbstractClientCommand;

public class AddCommand extends AbstractClientCommand {
    public AddCommand() {
        super(
                "add",
                "add players to a known players list (they wil not be tracked)",
                "*pidt add <playername>"
        );
    }

    @Override
    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: add <a> <b>");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a + b);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
