package com.example.MyFirstSpringProject;
import java.time.format.DateTimeFormatter;

public class ATM {

    int transactionNumber;
    DateTimeFormatter dateAndTime;
    double balance;
    double withdrawAmount;
    double depositAmount;
    char receipt;

    //Withdrawl
    public void withdrawl(int transactionNumber, DateTimeFormatter dateAndTime, double balance, double withdrawAmount, char receipt) {
        this.transactionNumber = transactionNumber;
        this.dateAndTime = dateAndTime;
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
        this.receipt = receipt;
    }

    //Deposit
    public void ATM(int transactionNumber, DateTimeFormatter dateAndTime, double depositAmount, char receipt) {
        this.transactionNumber = transactionNumber;
        this.dateAndTime = dateAndTime;
        this.depositAmount = depositAmount;
        this.receipt = receipt;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public DateTimeFormatter getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(DateTimeFormatter dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeductionAmount() {
        return withdrawAmount;
    }

    public void setDeductionAmount(double deductionAmount) {
        this.withdrawAmount = deductionAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public char getReceipt() {
        return receipt;
    }

    public void setReceipt(char receipt) {
        this.receipt = receipt;
    }
}
