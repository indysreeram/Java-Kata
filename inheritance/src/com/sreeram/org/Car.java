package com.sreeram.org;

/**
 * Created by sreeram.srini on 2/25/18.
 */
public class Car extends Vechile {

    private int numwheels;
    private int doors;
    private int geers;
    private boolean isManaul;
    private int currentGear;

    public Car(String name, String size, int numwheels, int doors, int geers, boolean isManaul) {
        super(name, size, 0, 0);
        this.numwheels = numwheels;
        this.doors = doors;
        this.geers = geers;
        this.isManaul = isManaul;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear()");
    }

    public void changeVelocity(int speed,int direction){
        System.out.println("Car.changeVelocity(): Velocity "+ speed + " direction " + direction);
        move(speed,direction);

    }
}
