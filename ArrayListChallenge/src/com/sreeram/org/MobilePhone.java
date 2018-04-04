package com.sreeram.org;

import java.util.ArrayList;

/**
 * Created by sreeram.srini on 3/11/18.
 */
public class MobilePhone {
    private String  myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public Boolean addContact(Contact contact){

        if (findContact(contact.getName())>=0){
            System.out.println("Contact is already present!!!");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public Boolean updateContact(Contact oldContact , Contact newContact){

        int postion = findContact(oldContact);
        if (postion <0){
            System.out.println(oldContact.getName() + " was not found in the contacts");
            return false;
        } else {
            if (findContact(newContact.getName()) !=-1) {
                System.out.println("The contact " +newContact.getName()+ " already exists");
                System.out.println("The update was not successfull!!!");
                return false;
            }
        }

        this.myContacts.set(postion,newContact);
        System.out.println(oldContact.getName()+" was replaced with "+newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {

        int postion = findContact(contact);
        if (postion <0){
            System.out.println(contact.getName() + " was not found in the contacts");
            return false;
        }
        this.myContacts.remove(postion);
        System.out.println("The contact "+contact.getName() + " was removed");
        return true;

    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){

        for (int i=0;i<this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }

        }
        return -1;
    }


    public String queryContact(Contact contact){

        if(findContact(contact) >=0) {
            return contact.getName();
        }
        return null;

    }
    public Contact queryContact(String name){

         int position = findContact(name);
         if (position >=0) {
             return myContacts.get(position);
         }
        return null;

    }

    public void printContacts() {
        System.out.println("Printing Contacts \n");
        for(int i =0 ; i < myContacts.size();i++) {
            System.out.println((i+1)+ " "+myContacts.get(i).getName() +
                                "-> " + myContacts.get(i).getPhoneNumber());
        }
    }



}
