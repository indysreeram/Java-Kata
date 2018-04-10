package com.sreeram.org;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sreeram.srini on 4/9/18.
 */
public class Player implements ISavable{

    private String name;
    private int hitPoints;
    private int Strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.Strength = strength;
        this.weapon ="Sword";
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
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public List<String> write() {
        List<String> values =new ArrayList<>();
        values.add(0,this.getName());
        values.add(1,""+this.getHitPoints());
        values.add(2,""+this.getStrength());
        values.add(3,this.getWeapon());
        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        if(savedValues!=null && savedValues.size()>0) {
            this.setName(savedValues.get(0));
            this.setHitPoints(Integer.parseInt(savedValues.get(1)));
            this.setStrength(Integer.parseInt(savedValues.get(2)));
            this.setWeapon(savedValues.get(3));

        }

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", Strength=" + Strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
