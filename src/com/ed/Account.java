package com.ed;

/**
 * Created by K317530 on 31/05/2017.
 */
public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(int accountNumber){
        this.number = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("new balance is " + this.balance);
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getAccountNumber(){
        return this.number;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void deposit(double amount) {
        double currentBalance;
        double newBalance;
        currentBalance = getBalance();
        if (amount > 0.0) {
            setBalance(currentBalance + amount);
        } else {
            System.out.println("You cannot deposit negative amounts!");
        }
    }
    public void withdraw(double amount){
        double currentBalance;
        double newBalance;
        currentBalance = getBalance();
        if((currentBalance - amount) < 0.0){
            System.out.println("Insufficient Funds");
        }
        else {
            setBalance(currentBalance - amount);
        }


    }
    public Account(){
        System.out.println("empty constructor called");

    }

    public Account (int number, double balance, String customerName, String email, String phoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


}
