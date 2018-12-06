package com.company;

public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public Account() {
        this("1000000", 0, "Customer", "mail@example.com", 123456789);
    }

    public Account(String accountNumber, double balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double funds) {
            this.balance += funds;
            System.out.println("Deposit completed successfully. Your balance is now: " + getBalance());
    }

    public void withdrawFunds(double funds) {
        if (this.balance - funds > 0) {
            this.balance -= funds;
            System.out.println("Withdraw completed successfully. Your balance is now: " + getBalance());
        } else {
            System.out.println("You don't have enough money!");
        }
    }
}
