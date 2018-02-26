package com.sreeram.org;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("This is a classes demo");

        Car porsche = new Car();
        porsche.setModel("Careera");
        porsche.setColor("Blue");
        porsche.setDoors(2);
        porsche.setEngine("v8");
        porsche.setWheels(4);

        Car holand  = new Car();
        holand.setModel("Holand");

        System.out.println(porsche);
        System.out.println(holand);
        Boolean returnFlag = null;

        Account bankAccount = new Account();
        bankAccount.setBalance((double) 1000);
        bankAccount.setAccountNumber(1234);
        bankAccount.setCustomerName("Sreeram");
        bankAccount.setEmail("indysreeram@gmail.com");
        bankAccount.setPhoneNumber("3022900597");
        displayMe(true,bankAccount);
        displayMe(bankAccount.withdraw(500), bankAccount) ;
        displayMe(bankAccount.withdraw(1000), bankAccount) ;

    }

    public static void displayMe(Boolean displayFlag , Account bankAccount) {
        if (displayFlag) {
            System.out.println("After widthdraw " + bankAccount);
        } else
        {
            System.out.println("Insufficient Funds in your account, Current Balance is " +bankAccount.getBalance());
        }
    }
}
