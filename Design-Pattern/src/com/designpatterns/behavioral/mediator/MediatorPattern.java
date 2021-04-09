package com.designpatterns.behavioral.mediator;

import kotlin.OverloadResolutionByLambdaReturnType;

public class MediatorPattern {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light();
        Light kitchenLight = new Light();

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllCommand = new TurnOnAllLightsCommand(mediator);

        turnOnAllCommand.execute();
    }
}
