package com.designpatterns.structural.bridge;

public class Movie {
    private String classification;
    private String runtime;
    private String title;
    private String year;

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }
}
