package com.sreeram.org;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
/*
    String myString = "Sreerameesreeram";
	String compString ="ee";

	for (int i =0;i<myString.length();i++){
	    int position =myString.indexOf(compString,i);
       if( position!= -1) {
           System.out.println("The position is " + (position+1));
           i=position+1;
        }

    }


    String s1 ="abcd";
    String s2 = "cdab";

        System.out.println("The rotation is " + s1+s1 + " = " + (s1+s1).contains(s2));

    String mobile ="3022900597";
        System.out.println("Mobile Number " + isValidMobileNumber(mobile));



        ArrayList<String> myList = new ArrayList<>();
        myList.add("Sreeram");
        myList.add("Nivethitha");
        myList.add("Rohan");
        myList.add("Pranav");
        System.out.println("The family list is " + myList);
        Collections.reverse(myList);
        System.out.println("The family list is " + myList);


        calculateScore(100);
        calculateScore("Sreeram");
        calculateScore("Sreeram",100);


        String testString ="Sreeram";
        System.out.println(
                "The char at position 5 -> " + testString.charAt(5)
        );
*/

        String mystring1 = "{{}} ()";
        char pattern1 = '(';
        char pattern2 = ')';

        int numPairs = calculatePairs(mystring1, pattern1, pattern2);

        System.out.println("The number of pairs is  " + numPairs);

        for (int i =2;i<=8;i++){
            System.out.println("The interest amount is " + calculateInterest(10000,i));
        }


    }

    private static double calculateInterest(double amount , double interest) {

        return ((amount) *(interest/100));
    }

    private static int calculatePairs(String mystring1, char pattern1, char pattern2) {


        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        for (int i = 0; i < mystring1.length(); i++) {
            if (mystring1.charAt(i) == pattern1)
                myStack1.push(pattern1);
            else if (mystring1.charAt(i) == pattern2)
                myStack2.push(pattern2);
        }
        return myStack1.size() < myStack2.size() ? myStack1.size():myStack2.size();

    }


    public static Boolean isValidMobileNumber(String mobile) {
        try {
            Double.parseDouble(mobile);
        } catch (NumberFormatException ex) {

            return false;
        }
        if (mobile.length() == 10) {
            return true;
        } else {
            return false;
        }
    }


    public static int calculateScore(int score) {
        System.out.println("The score is " + score * 100);
        return (score * 100);
    }

    public static void calculateScore(String name) {
        System.out.println("The player Name is " + name);

    }

    public static void calculateScore(String name, int score) {
        System.out.println("The player Name is " + name + " and score is " + score * 100);

    }
}
