package Experiment2;
import java.util.*;
class customer {
    private int customerId;
    private int hoursParked;
    private double parkingCharge;

    public customer(int customerId, int hoursParked) {
        this.customerId = customerId;
        this.hoursParked = hoursParked;
    }

    public double calculateCharge(int hoursParked) {
        double charge = 2.00;
        if (hoursParked > 3) {
            charge += (hoursParked - 3) * 0.50;
        }
        return Math.min(charge, 10.00);
    }

    public boolean isCreditLimitExceeded() {
        return this.parkingCharge > 10.00; // Example logic
    }
}

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer ID: ");
        int customerId = sc.nextInt();
        System.out.println("Enter hours parked: ");
        int hoursParked = sc.nextInt();

        customer customer = new customer(customerId, hoursParked);
        double charge = customer.calculateCharge(hoursParked);

        System.out.printf("Customer ID: %d, Charge: $%.2f\n", customerId, charge);

        if (customer.isCreditLimitExceeded()) {
            System.out.println("Credit limit exceeded!");
        } else {
            System.out.println("Credit limit not exceeded.");
        }

        sc.close();
    }
}