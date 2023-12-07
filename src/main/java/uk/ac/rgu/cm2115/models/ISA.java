package uk.ac.rgu.cm2115.models;

import uk.ac.rgu.cm2115.abstractions.BankAccount;
import uk.ac.rgu.cm2115.repository.SavingsAccount;

public class ISA extends BankAccount implements SavingsAccount {
    Integer remainingAllowance;

    private Integer interest;

    public ISA(String accountName) {
        super(accountName);
    }

    @Override
    public void applyInterest() {
        this.balance += this.balance * this.getInterestRate() / 100;
    }

    @Override
    public Integer getInterestRate() {
        return this.interest;
    }

    @Override
    public void setInterestRate(Integer rate) {
        this.interest = rate;
    }

}
