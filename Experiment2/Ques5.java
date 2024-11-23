package Experiment2;

import java.util.*;
class Mileage{
    int milesDriven[];
    int gallonsUsed[];
    float milesPerGallon;
    float eachAvg[];
    Mileage(int milesDriven[],int gallonsUsed[]){
        this.milesDriven = milesDriven;
        this.gallonsUsed = gallonsUsed;
        this.eachAvg = new float[this.gallonsUsed.length];
    }

    void totalAverage(){
        int total_miles = 0;
        int total_gallons = 0;
        for(int i = 0;i<this.milesDriven.length;i++){
            total_miles +=milesDriven[i];
        }
        for(int i = 0;i<this.gallonsUsed.length;i++){
            total_gallons += gallonsUsed[i];
        }

        this.milesPerGallon=(total_miles/total_gallons);
    }
    void eachAvergaeTotal(){
        for(int i = 0;i<this.eachAvg.length;i++){
            this.eachAvg[i] = (this.milesDriven[i]/this.gallonsUsed[i]);
        }
    }

    void displayAverage(){
        System.out.println("The average miles per gallon is " + this.milesPerGallon);
    }
    void displayEach(){
        System.out.print("[");
        for(int i =0;i<this.eachAvg.length;i++){
            System.out.print(this.eachAvg[i] + " ");
        }
        System.out.println("]");
    }
}
public class Ques5 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of trips: ");
        int n = sc.nextInt();
        int milesDriven[] = new int[n];
        int gallonsUsed[] =new int[n];
        System.out.println("Enter miles driven in each trip: ");
        for(int i = 0;i<milesDriven.length;i++){
            milesDriven[i] = sc.nextInt();
        }
        System.out.println("Enter gallons used for each trip: ");
        for(int i = 0;i<gallonsUsed.length;i++){
            gallonsUsed[i] = sc.nextInt();
        }
        Mileage vehicle = new Mileage(milesDriven,gallonsUsed);
        vehicle.totalAverage();
        vehicle.eachAvergaeTotal();
        vehicle.displayAverage();
        vehicle.displayEach();
    }
}