package com.sreeram.org;

/**
 * Created by sreeram.srini on 2/25/18.
 */
public class Vechile {

    private String name;
    private String size;
    private int currentVelcoity;
    private int currentDirection;

    public Vechile(String name, String size, int currentVelcoity, int currentDirection) {
        this.name = name;
        this.size = size;
        this.currentVelcoity = currentVelcoity;
        this.currentDirection = currentDirection;
    }

    public void steer (int currentDirection){
        setCurrentDirection(getCurrentDirection()+currentDirection);
        System.out.println("Vechile.steer() : Steering at "+ getCurrentDirection() + " degrees.");
    }

    public void move(int currentVelcoity,int currentDirection){
        setCurrentDirection(currentDirection);
        setCurrentVelcoity(currentVelcoity);
        System.out.println("The Vehicle is moving at "+ getCurrentVelcoity()+" in the direction "+ getCurrentDirection());

    }

    public void stop() {
        setCurrentVelcoity(0);
        System.out.println("The vechile is stopped !!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelcoity() {
        return currentVelcoity;
    }

    public void setCurrentVelcoity(int currentVelcoity) {
        this.currentVelcoity = currentVelcoity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
