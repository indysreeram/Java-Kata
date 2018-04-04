package com.sreeram.org;

import java.util.ArrayList;

/**
 * Created by sreeram.srini on 3/6/18.
 */
public class GroceryList {
        private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
            getGroceryList().add(item);
                    }

    public void printGroceryList(){
        System.out.println("You have " + getGroceryList().size()+ " items in your grocery list");
        for(int i=0;i<getGroceryList().size();i++){
            System.out.println((i+1)+ " . "+getGroceryList().get(i));
        }
    }

    public void modifyGroceryItem(int position,String newItem) {
        getGroceryList().set(position,newItem);
        System.out.println("Grocery Item "+ (position+1)+ " has been modified");
    }

    public void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
//        boolean exists = getGroceryList().contains(searchItem);
        int position = getGroceryList().indexOf(searchItem);
        if (position >=0) {
            return getGroceryList().get(position);
        }
        return null;

    }


}
