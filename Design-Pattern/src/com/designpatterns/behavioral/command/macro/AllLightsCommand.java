package com.designpatterns.behavioral.command.macro;

import com.designpatterns.behavioral.command.Command;
import com.designpatterns.behavioral.command.Light;

import java.util.List;

public class AllLightsCommand implements Command {
    private List<Light> lights;
    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.forEach(__ -> {
            if(__.isOn())
                __.toggle();
        });
    }
}
