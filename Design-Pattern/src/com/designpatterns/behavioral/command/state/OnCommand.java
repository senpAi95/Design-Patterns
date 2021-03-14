package com.designpatterns.behavioral.command.state;

import com.designpatterns.behavioral.command.Command;
import com.designpatterns.behavioral.command.Light;

// concrete command
public class OnCommand implements Command {
    private Light light;
    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
