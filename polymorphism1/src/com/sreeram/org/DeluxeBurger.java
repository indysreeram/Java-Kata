package com.sreeram.org;

/**
 * Created by sreeram.srini on 3/1/18.
 */
public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Chicken and Egg", 14.54, "White");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drink",1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add more !!!");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add more !!!");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add more !!!");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add more !!!");
    }
}
