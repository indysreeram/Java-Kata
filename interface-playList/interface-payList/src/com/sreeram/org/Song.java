package com.sreeram.org;

/**
 * Created by sreeram.srini on 4/5/18.
 */
public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.getTitle() + " : "+ this.getDuration();
    }
}
