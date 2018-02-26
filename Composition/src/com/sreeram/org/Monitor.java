package com.sreeram.org;

/**
 * Created by sreeram.srini on 2/25/18.
 */
public class Monitor {

    private String name;
    private String manufacturer;
    private int size;
    private Resolution resolution;

    public Monitor(String name, String manufacturer, int size, Resolution resolution) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x,int y, String color){
        System.out.println("Drawing pixel "+ x +" , "+ y + " in color " + color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
