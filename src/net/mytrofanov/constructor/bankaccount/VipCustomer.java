package net.mytrofanov.constructor.bankaccount;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Human", 5000.00, "default@mail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    void printVipCustomerInfo() {
        System.out.println("Vip customer is " + this.getName() + " with an email " + this.getEmailAddress() + " with a credit limit " + this.getCreditLimit());
    }
}
