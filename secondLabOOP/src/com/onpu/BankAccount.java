package com.onpu;

public class BankAccount {

    private String name;
    private double balance;
    private double transactionFee = 0.00;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {

        if ((this.balance - amount - this.transactionFee) < 0) {
            return;
        } else {
            this.balance -= amount + this.transactionFee;
        }
    }

    public String getName() {

        return name;
    }

    public double getBalance() {

        return balance;
    }

    public double getTransactionFee() {

        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {

        this.transactionFee = transactionFee;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void transfer(BankAccount receiver, double amount) {
        System.out.println("First pay" + this.balance);
        System.out.println("Second pay" + receiver.balance);
        if (amount < 0) {
            System.out.println("No money");
            return;
        } else if (this.balance < amount + this.transactionFee) {

            receiver.balance += amount - this.balance;
            this.balance = 0;
        } else if (this.balance < transactionFee) {
            return;
        } else {
            receiver.balance += amount;
            this.balance -= amount + transactionFee;
        }
        System.out.println("First pay" + this.balance);
        System.out.println("Second pay" + receiver.balance);
    }
}


