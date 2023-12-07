package uk.ac.rgu.cm2115.models;

import java.util.ArrayList;
import java.util.List;

import uk.ac.rgu.cm2115.abstractions.BankAccount;

public final class Customer {

    private String name;

    private String address;

    private List<BankAccount> accounts;

    private CustomerType type;

    public Customer() {
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;

    }

    public CustomerType getType() {
        return this.type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public List<BankAccount> getAccounts() {
        return this.accounts;
    }

    public boolean openAccount(BankAccount account) {
        return this.accounts.add(account);
    }

    @Override
    public String toString() {
        return "Customer Name: " + this.name + ", Address: " + this.address + ", Type: " + this.type;
    }

}
