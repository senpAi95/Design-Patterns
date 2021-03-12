package com.designpatterns.structural.bridge;

/**
 * A class to demonstrate the BridgePattern.
 * MoviePrinter has no knowledge of Print Formatter. Even if Formatter changes, its not affected.
 * I can even create new HTML Formatter for same MoviePrinter.
 */
public class BridgePattern {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setRuntime("2:13");
        movie.setTitle("Shiva");
        movie.setYear("2021");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        System.out.println(moviePrinter.print(printFormatter));

        Formatter htmlFormatter = new HtmlFormatter();
        System.out.println(moviePrinter.print(htmlFormatter));


    }
}
