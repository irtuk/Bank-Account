package com.ed;

public class Main {

    public static void main(String[] args) {
//      Account myAccount = new Account(1,0.00,"ed","ed@ed.com","00447818411230");
//        myAccount.setAccountNumber(1);
//       myAccount.setCustomerName("Edward Moore");
//        myAccount.setBalance(0.0);
//        myAccount.setEmail("remoore@btinternet.com");
//        myAccount.setPhoneNumber("07818411230");
//        myAccount.deposit(1000.00);
//        myAccount.withdraw(500.00);
//        myAccount.deposit(250.00);
//        myAccount.withdraw(5000);

        VipCustomer myVipCustomer = new VipCustomer();

        System.out.println(myVipCustomer.getName());
        System.out.println(myVipCustomer.getCreditLimit());
        System.out.println(myVipCustomer.getEmailAddress());

        VipCustomer nextVipCustomer = new VipCustomer("Billy","billy@bob.com");
        System.out.println(nextVipCustomer.getName());
        System.out.println(nextVipCustomer.getCreditLimit());
        System.out.println(nextVipCustomer.getEmailAddress());

        VipCustomer lastVipCustomer = new VipCustomer("wankshaft","wank@shaft.com",100000.00);
        System.out.println(lastVipCustomer.getName());
        System.out.println(lastVipCustomer.getCreditLimit());
        System.out.println(lastVipCustomer.getEmailAddress());



    }
}
