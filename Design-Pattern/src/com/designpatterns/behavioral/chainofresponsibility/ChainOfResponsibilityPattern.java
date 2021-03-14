package com.designpatterns.behavioral.chainofresponsibility;

import java.nio.file.DirectoryIteratorException;

public class ChainOfResponsibilityPattern {

    public static void main(String[] args) {
        Director shiva = new Director();
        VP teja = new VP();
        CEO Mummadi = new CEO();

        shiva.setSuccessor(teja);
        teja.setSuccessor(Mummadi);

        Request request = new Request(RequestType.CONFERENCE, 500);
        shiva.handlerRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        shiva.handlerRequest(request);

        // above can also be
        // teja.handlerRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        shiva.handlerRequest(request);
    }
}
