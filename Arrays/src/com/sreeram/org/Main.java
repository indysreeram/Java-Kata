package com.sreeram.org;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



	    int [] intArray = getIntegers(5);
        printMe(intArray);
        intArray=sortMe(intArray);
        System.out.println();
        printMe(intArray);
        System.out.println("The avergae is "+  getAverage(intArray));

    }

    private static int[] sortMe(int[] intArray) {
    /*    int[] sortedArray = new int[intArray.length];

        for(int i=0;i<intArray.length;i++) {
            sortedArray[i]=intArray[i];
        }*/

        int[] sortedArray = Arrays.copyOf(intArray,intArray.length);
        Arrays.sort(sortedArray,0,sortedArray.length);
        System.out.println("In built sort");
        printMe(sortedArray);
        for(int i=0;i<sortedArray.length-1;i++)
        {
            if(sortedArray[i] >sortedArray[i+1]){
                int temp =sortedArray[i];
                sortedArray[i]=sortedArray[i+1];
                sortedArray[i+1]=temp;
            }
        }
        printMe(sortedArray);
        return sortedArray;

    }

    private static Double getAverage(int[] intArray) {

        int sum =0;
        for(int i=0;i<intArray.length;i++){
            sum+=intArray[i];
                    }
                    return ((double) sum/(double) intArray.length);
    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number+ " integer values. \r");
        int[] intArray = new int[number];

        for(int i=0;i<intArray.length;i++){
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    private static void printMe(int[] intArray) {
        System.out.println("The array is ");
        System.out.print("[ ");
        for (int i = 0; i < intArray.length; i++) {
            if ((i != intArray.length - 1)) {
                System.out.print(intArray[i] + " , ");
            } else {
                System.out.print(intArray[i]);
            }
                    }
        System.out.print(" ]");
    }
}
