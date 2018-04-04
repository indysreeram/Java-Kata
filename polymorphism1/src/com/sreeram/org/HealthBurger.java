package com.sreeram.org;

/**
 * Created by sreeram.srini on 3/1/18.
 */
public class HealthBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthBurger( String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name,double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println("Added " + this.healthyExtra1Name + " for price $"+ this.healthyExtra1Price);
    }

    public void addHealthyAddition2(String name,double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if( this.healthyExtra1Name !=null){
            hamburgerPrice+=this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra "+ this.healthyExtra1Price);
        }
        if( this.healthyExtra2Name !=null){
            hamburgerPrice+=this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra "+ this.healthyExtra2Price);
        }
        return  hamburgerPrice;
    }
}
