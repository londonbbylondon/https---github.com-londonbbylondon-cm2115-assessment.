package uk.ac.rgu.cm2115.repository;

public interface SavingsAccount {

    void applyInterest();

    Integer getInterestRate();

    void setInterestRate(Integer rate);

}
