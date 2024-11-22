package Experiment1;

import java.util.Scanner;

class Circle{
    int r;
    Circle(int r){
        this.r=r;
    }

    int getDiameter(){
        return 2*r;
    }

    double getCircumference(){
        return 2*Math.PI*r;
    }

    double getArea(){
        return Math.PI*r*r;
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = sc.nextInt();

        Circle c = new Circle(r);
        System.out.println("Enter choice: \n 1->Diameter\n 2->circumference\n 3->Area");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Diameter: " + c.getDiameter());
                break;

            case 2:
                System.out.println("Circumference: " + c.getCircumference());
                break;

            case 3:
                System.out.println("Area: " + c.getArea());
                break;


            default:
                break;
        }
    }
}