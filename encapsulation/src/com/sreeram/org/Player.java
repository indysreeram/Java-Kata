package com.sreeram.org;

/**
 * Created by sreeram.srini on 2/26/18.
 */
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void looseHealth(int damage) {
        this.health = this.health -damage;
        if (this.health <=0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}

