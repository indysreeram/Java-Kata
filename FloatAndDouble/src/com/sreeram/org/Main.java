package com.sreeram.org;

public class Main {

    public static final double PI = 3.147_452_20d;

    public static void main(String[] args) {
        // write your code here
        System.out.println("This is Float and Double");
        float floatValue = (float) 5.4;
        double pounds = 257d;
        double kilograms = pounds * 0.45359237d;
        System.out.println("The kilograms is " + kilograms + " for " + pounds + " pounds");
        double PI = 3.14;
        System.out.println(PI);

        Boolean isApproved = false;
        if (isApproved) {
            System.out.println("The Application was approved");
        } else {
            System.out.println("The Application is pending!!");
        }
        System.out.println("Enter the name ");

        Boolean isCar = true;

        if (isCar ? true : false) {
            System.out.println("This is car");
        }

        if (true) {

        }



    }
}
