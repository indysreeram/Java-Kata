package com.sreeram.org;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner= new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice=0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice =scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    makeAGroceryList();
                case 7:
                    quit = true;
                    break;

            }

        }



    }

    public static void makeAGroceryList() {
        ArrayList<String> newGroceryList = new ArrayList<>(groceryList.getGroceryList());

        String [] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);


    }

    public static void searchForItem() {
        System.out.println("Enter the item to be searched");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem)!= null) {
            System.out.println("The "+searchItem+" item was found in the list ");
        }
    }

    public static  void modifyItem(){

        System.out.println("Enter the item to be modified to list");
        String newItem = scanner.nextLine();
        int position = findItem(newItem);
        if(position >=0) {
            System.out.println("Enter the replacement item");
            String replacement = scanner.nextLine();
            modifyItem(position,replacement);
        }

    }
    private static void modifyItem(int position ,String item) {

        groceryList.modifyGroceryItem(position,item);
    }

    public static int findItem(String itemName) {
        return groceryList.getGroceryList().indexOf(itemName);
    }

    public static void removeItem() {
        System.out.println("Enter the item number to remove from the list");
        int itemNumber =scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNumber);
        System.out.println("Item removed from the grocery List" );
    }


    public static void addItem() {
        System.out.println("Enter the item to be added to list");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void printInstruction() {

        System.out.println("The Instructions are as below PRESS");
        System.out.println("\t 0 -> To Print the Choice options");
        System.out.println("\t 1 -> To Print the grocery list");
        System.out.println("\t 2 -> To Add an item in the list");
        System.out.println("\t 3 -> To modify an item in the list");
        System.out.println("\t 4 -> To remove an item in the list");
        System.out.println("\t 5 -> To search an item in the list");
        System.out.println("\t 6 -> To quit");

    }
}
