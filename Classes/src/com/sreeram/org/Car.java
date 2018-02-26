package com.sreeram.org;

/**
 * Created by sreeram.srini on 2/4/18.
 */
public class Car {

    private String model;
    private String engine;
    private String color;
    private int doors;
    private int wheels;

    public Car() {
    }

    public Car(String model, String engine, String color, int doors, int wheels) {
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.doors = doors;
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        String validModel = model.toLowerCase();

        if (validModel.equals("porsche") || validModel.equals("holand"))
        {this.model = model;}
        else {
             this.model = "unknown";
        }

    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", wheels=" + wheels +
                '}';
    }
}
