package com.sreeram.org;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sreeram.srini on 4/10/18.
 */
public class Monster implements ISavable{

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0,getName());
        values.add(1,""+getHitPoints());
        values.add(2,""+getStrength());
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues !=null && savedValues.size()>0) {
            setName(savedValues.get(0));
            setHitPoints(Integer.parseInt(savedValues.get(1)));
            setStrength(Integer.parseInt(savedValues.get(2)));
        }

    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
