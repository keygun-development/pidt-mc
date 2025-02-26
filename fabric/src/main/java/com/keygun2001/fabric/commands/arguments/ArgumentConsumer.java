package com.keygun2001.fabric.commands.arguments;

import com.keygun2001.commands.Messages;

public class ArgumentConsumer {
    private final String[] args;

    public ArgumentConsumer(String[] args) {
        this.args = args;
    }

    public void requireMax(int count) {
        if (args.length > count) {
            throw new IllegalArgumentException(Messages
                    .get("error.too_many_args",
                            "max",
                            count
                    )
            );
        }
    }

    public void requireMin(int count) {
        if (args.length < count) {
            throw new IllegalArgumentException(Messages
                    .get("error.too_few_args",
                            "min",
                            count
                    )
            );
        }
    }

    public boolean hasArgs() {
        return args.length > 0;
    }

    public String getFirst() {
        return hasArgs() ? args[0] : null;
    }

    public String[] getAll() {
        return args;
    }
}
