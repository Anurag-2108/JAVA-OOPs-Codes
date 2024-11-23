package Experiment2;

import java.util.Scanner;

class Customer {
    int accountNumber;
    double balanceAtBeginning;
    double totalCharges;
    double totalCredit;
    double creditLimit;
    double netBalance;

    Customer(int accountNumber, double balanceAtBeginning, double totalCharges, double totalCredit, double creditLimit) {
        this.accountNumber = accountNumber;
        this.balanceAtBeginning = balanceAtBeginning;
        this.totalCharges = totalCharges;
        this.totalCredit = totalCredit;
        this.creditLimit = creditLimit;
    }

    void calculateNetBalance() {
        this.netBalance = this.balanceAtBeginning - this.totalCharges + this.totalCredit;
    }

    double getNetBalance() {
        return this.netBalance;
    }

    boolean isCreditLimitExceeded() {
        return this.netBalance < -this.creditLimit;
    }
}

class CreditLimitCalculator {
    void processCustomer(Customer customer) {
        if (customer.isCreditLimitExceeded()) {
            System.out.println("ALERT! CREDIT LIMIT IS EXCEEDED!");
        } else {
            System.out.println("CREDIT LIMIT IS NOT EXCEEDED!");
        }
    }
}

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.println("Enter balance at beginning: ");
        double balanceAtBeginning = sc.nextDouble();

        System.out.println("Enter total charges: ");
        double totalCharges = sc.nextDouble();

        System.out.println("Enter total credit: ");
        double totalCredit = sc.nextDouble();

        System.out.println("Enter credit limit: ");
        double creditLimit = sc.nextDouble();

        // Create a Customer object
        Customer customer = new Customer(accountNumber, balanceAtBeginning, totalCharges, totalCredit, creditLimit);

        // Calculate the net balance
        customer.calculateNetBalance();

        // Process the customer using CreditLimitCalculator
        CreditLimitCalculator calculator = new CreditLimitCalculator();
        calculator.processCustomer(customer);


    }
}