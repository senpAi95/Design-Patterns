package com.designpatterns.behavioral.command.state;

import com.designpatterns.behavioral.command.Command;
import com.designpatterns.behavioral.command.Light;
import com.designpatterns.behavioral.command.ToggleCommand;
import com.designpatterns.behavioral.command.Switch;

public class CommandPattern {

    public static void main(String[] args) {
        Light light = new Light();
        Switch lightSwitch = new Switch();

        // It holds the necessary information to execute.
        // Command onCommand = new OnCommand(light);

        // State of the object is stored below
        Command toggleCommand = new ToggleCommand(light);

        // lightSwitch.storeAndExecute(onCommand);

        // It executes.
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
    }

}
