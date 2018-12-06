package com.company;

public class VIPCustomer {
    private String name;
    private long credit;
    private String email;

    public String getName() {
        return name;
    }

    public long getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }

    public VIPCustomer(String name, long credit, String email) {
        this.name = name;
        this.credit = credit;
        this.email = email;
    }

    public VIPCustomer(String name, String email) {
        this(name,0,email);
    }

    public VIPCustomer() {
        this("VIP",100,"vip@example.com");
    }
}
