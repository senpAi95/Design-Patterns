package com.designpatterns.behavioral.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilitySample {
    private static final Logger logger = Logger.getLogger(ChainOfResponsibilitySample.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.FINER);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINER);

        logger.addHandler(handler);

        logger.finest("Finest level of logging");
        logger.finer("Finer level, but not as fine as finest");
        logger.fine("Fine, but not as fine as finer or finest");
    }
}
