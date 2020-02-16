package net.mytrofanov.constructor.bankaccount;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("00000", 1.00, "Default name", "default@email.com", "(000)-00-00-00");
        System.out.println("Empty constructor");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("11111", 2.00, customerName, email, phoneNumber);
    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("The successful deposit of " + depositAmount + " The new balance is " + this.balance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if (this.balance >= withdrawAmount) {
            this.balance -= withdrawAmount;
            System.out.println("The successful withdrawal of " + withdrawAmount + " The remaining balance is " + this.balance);
        } else {
            System.out.println("Insufficient funds, only " + this.balance + " available");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
