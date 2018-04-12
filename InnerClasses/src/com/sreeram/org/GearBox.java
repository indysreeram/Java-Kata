package com.sreeram.org;

import java.util.ArrayList;

/**
 * Created by sreeram.srini on 4/10/18.
 */
public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear (0,0.0);
        this.gears.add(neutral);
        for (int i=0;i<maxGears;i++){
            addGear(i,i * 5.3);
        }

    }

    public void operateClutch(boolean in){
        this.clutchIsIn=in;
    }

    public void addGear(int number,double ratio){
        if((number>0) && (number<this.maxGears)){
            this.gears.add(new Gear(number,ratio));
        }
    }
    public void changeGear(int newGear){
        if ((newGear >0) && (newGear< this.gears.size()) && this.clutchIsIn ) {
            this.currentGear=newGear;
            System.out.println("New Gear selected is "+this.currentGear);
        } else {
            System.out.println("Grind!");
            this.currentGear=0;
        }
    }
    public double wheelsSpeed(int revs) {
        if(clutchIsIn){
            System.out.println("scream!!!!");
        } else {
            return revs * gears.get(currentGear).getRatio();
        }
        return 0;
    }
    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}
