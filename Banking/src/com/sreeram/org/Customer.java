package com.sreeram.org;

import java.util.ArrayList;

/**
 * Created by sreeram.srini on 3/27/18.
 */
public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer (String name , double intialAmount) {
        this.name =name;
        this.transactions = new ArrayList<Double>();
        addTransaction(intialAmount);
    }
    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
}
