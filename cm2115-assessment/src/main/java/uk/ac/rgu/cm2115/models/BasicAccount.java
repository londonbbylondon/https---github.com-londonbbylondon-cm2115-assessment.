package uk.ac.rgu.cm2115.models;

import uk.ac.rgu.cm2115.abstractions.BankAccount;
import uk.ac.rgu.cm2115.repository.CurrentAccount;

public class BasicAccount extends BankAccount implements CurrentAccount {

    public BasicAccount(String accountName) {
        super(accountName);
    }

    @Override
    public void processCardTransaction(Integer amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }

    }

}
