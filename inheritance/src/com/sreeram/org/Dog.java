package com.sreeram.org;

/**
 * Created by sreeram.srini on 2/24/18.
 */
public class Dog extends Animal {

    private int eyes;
    private int tail;
    private int teeth;
    private  int legs;
    private String coat;

    public Dog(String name,int size, int weight,int eyes,int tail,int teeth,int legs,String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.legs = legs;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Chew Chew Chew !!!");
    }

    @Override
    public void eat() {
        chew();
    }

    public void walk(int speed) {
        System.out.println("Dog is walking");
        super.move(speed);
    }

    public void run(int speed) {
        System.out.println("Dog is running");
        move(speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() is called");
    }
}
