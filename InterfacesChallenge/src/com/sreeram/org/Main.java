package com.sreeram.org;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player sreeram = new Player("Sreeram",10,15);
        System.out.println(sreeram);
        saveObject(sreeram);

        sreeram.setWeapon("Light Saver");
        System.out.println(sreeram);
        sreeram.setStrength(20);
        sreeram.setHitPoints(25);
        System.out.println(sreeram);
        saveObject(sreeram);
        loadObject(sreeram);
        System.out.println(sreeram);

        ISavable warewolf = new Monster("Warewolf",20,40);
        System.out.println(((Monster)warewolf).getStrength());
        System.out.println(warewolf);
        saveObject(warewolf);

    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        boolean quit =false;
        int index=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose \n"+
                            "1 -> to enter a string\n"+
                            "0 -> to quit");

        while(!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("Enter a String ");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;

            }
        }

        return values;
    }

    public static void saveObject(ISavable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving "+ objectToSave.write().get(i)+ " to storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
