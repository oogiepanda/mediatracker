package com.oogie;

public class Movie extends MediaType{
    private String producer;

    public Movie() {
    }

    public Movie(String title, int year) {
        super(title, year);
    }

    public Movie (String title, int year, String producer) {
        super(title, year);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
