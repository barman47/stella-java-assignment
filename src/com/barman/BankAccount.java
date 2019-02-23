package com.barman;

public class BankAccount {
    private double BALANCE;
    private String ID;

    public BankAccount() {
        this.BALANCE = 0;
    }

    public BankAccount(double BALANCE, String ID) {
        this.BALANCE = BALANCE;
        this.ID = ID;
    }

    public void retrieve(double amount) {
        if (this.BALANCE >= amount && amount > 0) {
            this.BALANCE -= amount;
            System.out.printf("%.2f withdrawn from %s's account. Balance is %.2f.\n", amount, this.getID(), this.getBalance());
        } else {
            System.out.printf("Your balance %f is not enough for this withdrawal.\n", this.BALANCE);
            return;
        }
    }

    public void transfer (double amount, BankAccount destinationAccount) {
        if (this.getBalance() >= amount) {
            this.retrieve(amount);
            destinationAccount.deposit(amount);
            System.out.printf("%s successfully transferred %.2f to %s.\nBalance is %.2f.\n", this.getID(), amount, destinationAccount.getID(), this.getBalance());
        } else {
            System.out.printf("Insufficient funds. Transfer not effected!\n");
        }
    }

    public void display () {
        System.out.printf("The Balance for %s is %.2f \n", this.getID(), this.getBalance());
    }

    public void deposit (double amount) {
        this.BALANCE = getBalance() + amount;
        System.out.printf("%.2f deposited to %s's account. Balance is %.2f.\n", amount, this.getID(), this.getBalance());
    }

    public void setBalance(double BALANCE) {
        this.BALANCE = BALANCE;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return BALANCE;
    }

    public String getID() {
        return ID;
    }

}
