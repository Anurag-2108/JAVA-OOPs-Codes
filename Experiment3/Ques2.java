package Experiment3;

import java.util.Scanner;

abstract class Figure
{
    double r;
    double a;
    double v;

    public abstract void dispArea();
    public abstract void dispVolume();

}

class Cone extends Figure{
    double h;
    double r;
    double l;

    Cone(double h,double r,double l)
    {
        super();
        this.h=h;
        this.r=r;
        this.l=l;
    }

    public void dispArea(){
        System.out.println(Math.PI*this.r*(this.r+this.l));
    }

    public void dispVolume(){
        System.out.println(Math.PI*this.r*this.r*this.h*(0.33));
    }
}



public class Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r=sc.nextDouble();
        System.out.println("Enter height: ");
        double h=sc.nextDouble();
        System.out.println("Enter slant height: ");
        double l=sc.nextDouble();
        Cone cone=new Cone(h,r,l);

        cone.dispArea();
        cone.dispVolume();

    }
}