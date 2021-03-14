package com.designpatterns.behavioral.command;

import com.designpatterns.behavioral.command.Command;
import com.designpatterns.behavioral.command.Light;

public class ToggleCommand implements Command {
    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
