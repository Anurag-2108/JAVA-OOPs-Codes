package Experiment2;

import java.util.Scanner;

class Driving{
    int milesPerDay;
    int costPerGallon;
    int avgFees;
    int tollsPerDay;

    Driving(int milesPerDay,int costPerGallon,int avgFees,int tollsPerDay){
        this.milesPerDay=milesPerDay;
        this.costPerGallon=costPerGallon;
        this.avgFees=avgFees;
        this.tollsPerDay=tollsPerDay;
    }

    int drivingCostPerDay(){
        return tollsPerDay+milesPerDay+costPerGallon+avgFees;
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total miles driven per day: ");
        int milesPerDay=sc.nextInt();
        System.out.print("Enter the cost per gallon of gasoline: ");
        int costPerGallon=sc.nextInt();
        System.out.print("Avg fees per day: ");
        int avgFees=sc.nextInt();
        System.out.print("Enter the tolls per day:");
        int tollsPerDay=sc.nextInt();

        Driving drive=new Driving(milesPerDay,costPerGallon,avgFees,tollsPerDay);
        System.out.println("The total cost of per day driving to work: "+drive.drivingCostPerDay());


    }

}