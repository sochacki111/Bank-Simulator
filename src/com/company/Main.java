package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account account = new Account();
        System.out.println(account.getBalance());
        account.depositFunds(2);
    }
}
