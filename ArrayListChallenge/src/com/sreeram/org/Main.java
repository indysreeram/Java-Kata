package com.sreeram.org;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static  MobilePhone myMobilePhone = new MobilePhone("3022900597");

    public static void main(String[] args) {

        System.out.println("This is program to demonstrate Array List and Encapsulation");
        Boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\n Enter the action (6 - to print the list of available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Shutting Down !!!\n");
                    quit=true;
                    break;
                case 1:
                    myMobilePhone.printContacts();
                    break;
                case 2 :
                    addNewContact();
                    break;
                case 3 :
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    querycontact();
                    break;
                case 6 :
                    printActions();
                    break;
            }
        }

    }

    private static void updateContact() {
        System.out.println("Enter the name for the contact for update");
        String name = scanner.nextLine();
        Contact existingContact = myMobilePhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found !!!");
            return;
        }
        else {
            System.out.println("Enter the name ");
             name = scanner.nextLine();
            System.out.println("Enter the phone ");
            String phone = scanner.nextLine();
            Contact updatableContact = Contact.createContact(name,phone);
            if(myMobilePhone.updateContact(existingContact,updatableContact)){
                System.out.println("Successfully updated");
            }
            else {
                System.out.println("Could not update the contact");
            }


        }

    }


    private static void removeContact() {
        System.out.println("Enter the name for the contact for update");
        String name = scanner.nextLine();
        Contact existingContact = myMobilePhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found !!!");
            return;
        }
        if(myMobilePhone.removeContact(existingContact)) {
            System.out.println("Contact removed successfully");
        } else {
            System.out.println("Contact cannot be removed");
        }

    }

    private static void querycontact() {
        System.out.println("Enter the name for the contact for update");
        String name = scanner.nextLine();
        Contact existingContact = myMobilePhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found !!!");
            return;
        }
        System.out.println("Contact Name = "+ existingContact.getName() + " Phone Number = "+existingContact.getPhoneNumber());

    }




    private static void addNewContact() {
        System.out.println("Enter the name for the contact");
        String name = scanner.nextLine();
        System.out.println("Enter the phone for the contact");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);
        System.out.println("Iam here");
        if(myMobilePhone.addContact(newContact)){
            System.out.println("Added a new Contact, name =" + name +" phone = "+phone);
        } else {
            System.out.println("Cannot add a new contact as it already exist for "+ name);
        }

    }


    private static void startPhone() {
     System.out.println("Starting the phone !!!!");
 }

 private static void printActions() {
     System.out.println("\n Available Options in the Phone \n");
     System.out.println("0 - to shutdown\n"+
                        "1 - to print contacts\n"+
                        "2 - to add a  new contacts \n" +
                        "3 - to update existing contacts \n " +
                        "4 - to remove a contact \n" +
                        "5 - to query if an existing contact is present \n" +
                        "6 - to print the list of available options \n");
     System.out.println("Choose your actions ");

 }

}
