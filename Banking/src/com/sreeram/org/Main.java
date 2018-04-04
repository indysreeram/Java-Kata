package com.sreeram.org;

public class Main {

    public static void main(String[] args) {

       Bank bank = new Bank("National Australia Bank");
      if(bank.addBranch("Adelaide")) {
          System.out.println("Adelaide branch created");
      };
       bank.addCustomer("Adelaide","Sreeram",100.91);
       bank.addCustomer("Adelaide","Rohan",100.91);
       bank.addCustomer("Adelaide","Pranav",100.91);

       bank.addBranch("Sydney");
       bank.addCustomer("Sydney","Nivethtiha",100.91);

       bank.addCustomerTransactions("Adelaide","Sreeram",50.99);
       bank.addCustomerTransactions("Adelaide","Rohan",100.99);
       bank.addCustomerTransactions("Adelaide","Pranav",150.99);
       bank.listCustomers("Adelaide",true);
       bank.listCustomers("Sydney",true);

       if(!bank.addCustomerTransactions("Melbourne","Sathish",5.52)){
           System.out.println("Errror Melbourne branch doesnot exists");
       }

       if(!bank.addBranch("Sydney")){
           System.out.println("The branch sydney already exists");
       }
    }
}
