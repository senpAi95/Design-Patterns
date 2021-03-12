package com.designpatterns.structural.bridge;

import java.util.List;

/**
 * Printer is independent of formatter. We can change how we format without affecting printer functionality.
 */
public abstract class Printer {

    public String print(Formatter formatter) { // This is composition
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract List<Detail> getDetails();

    protected abstract String getHeader();

}
