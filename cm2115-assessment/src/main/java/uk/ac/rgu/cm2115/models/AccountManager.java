package uk.ac.rgu.cm2115.models;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    List<Customer> customers;

    public AccountManager() {
        this.customers = new ArrayList<>();
    }

    public boolean addCustomer(Customer customer) {
        return this.customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return this.customers;
    }

}