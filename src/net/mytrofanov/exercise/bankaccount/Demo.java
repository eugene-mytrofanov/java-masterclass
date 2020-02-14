package net.mytrofanov.exercise.bankaccount;

public class Demo {
    public static void main(String[] args) {
//        BankAccount johnBankAccount = new BankAccount("12345", 0.00, "John Week", "john.week@gmail.com", "(099) 123-45-67");
        BankAccount johnBankAccount = new BankAccount();
        System.out.println("The name of bank account is " + johnBankAccount.getCustomerName());
        johnBankAccount.withdrawFunds(200.00);
        johnBankAccount.depositFunds(500.00);
        johnBankAccount.withdrawFunds(300.00);
        johnBankAccount.withdrawFunds(200.00);

        BankAccount timAccount = new BankAccount("Tim Roth", "tim.roth@gmail.com", "+1 111 234-45-78");
    }
}
