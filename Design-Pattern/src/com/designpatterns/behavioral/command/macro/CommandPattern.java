package com.designpatterns.behavioral.command.macro;

import com.designpatterns.behavioral.command.Command;
import com.designpatterns.behavioral.command.Light;
import com.designpatterns.behavioral.command.Switch;
import com.designpatterns.behavioral.command.ToggleCommand;
import com.designpatterns.behavioral.command.state.OnCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * purpose of this is to shut off all of the lights at once.
 */
public class CommandPattern {
    public static void main(String[] args) {
        Light bedRoomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();



        // State of the object is stored below
         Command toggleCommand = new ToggleCommand(bedRoomLight);

         lightSwitch.storeAndExecute(toggleCommand);

        // It executes.
//        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedRoomLight);

        Command allLights = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLights);
    }
}
