package uk.ac.rgu.cm2115.models;

import java.util.List;

import uk.ac.rgu.cm2115.abstractions.BankAccount;
import uk.ac.rgu.cm2115.repository.CurrentAccount;
import uk.ac.rgu.cm2115.repository.SavingsAccount;

public class RewardAccount extends BankAccount implements CurrentAccount, SavingsAccount {
    public RewardAccount(String accountName) {
        super(accountName);
    }

    List<String> rewards;

    private Integer interest;

    public void addReward(String reward) {
        this.rewards.add(reward);
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

    @Override
    public void processCardTransaction(Integer amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processCardTransaction'");
    }

}
