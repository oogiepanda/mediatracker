package com.mycompany.app;

public class TV extends MediaType {
    private int episodeLength;

    public TV() {
    }

    public TV(String title, int year) {
        super(title, year);
    }

    public TV(String title, int year, int episodeLength) {
        super(title, year);
        this.episodeLength = episodeLength;
    }

    public int getEpisodeLength() {
        return episodeLength;
    }

    public void setEpisodeLength(int episodeLength) {
        this.episodeLength = episodeLength;
    }
}
