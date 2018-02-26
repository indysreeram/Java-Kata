package com.sreeram.org;

/**
 * Created by sreeram.srini on 2/26/18.
 */
public class EnhancedPlayer {

    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health >0  && health <=100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <=0) {
            System.out.println("Player knocked out");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int hitPoint) {
        this.health = hitPoint;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
