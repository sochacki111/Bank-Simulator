package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VIPCustomer vipCustomer = new VIPCustomer("klient","blah@vlah.cvk");
        System.out.println(vipCustomer.getCredit());
        System.out.println(vipCustomer.getEmail());
        System.out.println(vipCustomer.getName());
    }
}
