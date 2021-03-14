package com.designpatterns.behavioral.command;

import com.designpatterns.behavioral.command.Command;

// invoker
public class Switch {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
