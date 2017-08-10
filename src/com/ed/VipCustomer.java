package com.ed;

/**
 * Created by K317530 on 01/06/2017.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("default name","default email",50000.00);
        System.out.println("Default no params called");
    }

    public VipCustomer(String name, String emailAddress){
        this(name, emailAddress,10000.00);
        System.out.println("name and email called");
    }

    public VipCustomer(String name, String emailAddress, double creditLimit){
        this.name=name;
        this.emailAddress=emailAddress;
        this.creditLimit=creditLimit;
        System.out.println("everything called");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
