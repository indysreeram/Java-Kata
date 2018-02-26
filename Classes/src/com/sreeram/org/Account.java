package com.sreeram.org;

/**
 * Created by sreeram.srini on 2/9/18.
 */
public class Account {
    private Integer accountNumber;
    private Double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {

        this(111, (double) 0,"Default Customer","default@default.com","000-000-0000" );

        System.out.println("Default constructor called!!!!");
    }

    public Account(Integer accountNumber, Double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Parameterized Customer Called !!!");
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Boolean deposit(Integer depositAmount){
        if (depositAmount >0){
            setBalance(getBalance()+depositAmount);
            System.out.println("The new balance is " + getBalance());
            return true;
        } else {
            System.out.println("Please provide a valid deposit amount");
            return false;
        }
            }


    public boolean withdraw(Integer withdrawAmount) {
        if (withdrawAmount > getBalance()) {
            System.out.println("Insufficent Funds to widthdraw");
            return false;
        }
        else {
            setBalance(getBalance()-withdrawAmount);
            System.out.println("The new balance is " + getBalance());
            return true;
        }
    }
}
