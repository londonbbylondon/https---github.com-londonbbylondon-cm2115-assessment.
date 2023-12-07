package uk.ac.rgu.cm2115.abstractions;

public abstract class BankAccount {
    protected Integer accountNumber;
    protected Integer sortCode;
    protected Integer balance;
    final String accountName;

    public BankAccount(String accountName) {
        this.accountName = accountName;
    }

    public boolean deposit(Integer amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(Integer amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getSortCode() {
        return sortCode;
    }

    public void setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public String getAccountName() {
        return accountName;
    }

    @Override
    public String toString() {
        return "Account Name: " + this.accountName + ", Account Number: " + this.accountNumber + ", Sort Code: "
                + this.sortCode + ", Balance: " + this.balance;
    }
}
