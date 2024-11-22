package Experiment1;

import java.util.Scanner;

interface MathOperations{
    int sum();
    double avg();
    int product();
    int largest();
    int smallest();
}

abstract class Calculator implements MathOperations{
    protected int n1,n2,n3;

    public Calculator(int n1,int n2,int n3){
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
    }
}

class Calculation extends Calculator{
    public Calculation(int n1,int n2,int n3){
        super(n1,n2,n3);
    }

    public int sum(){
        return n1+n2+n3;
    }

    public double avg(){
        return sum()/3.0;
    }

    public int product(){
        return n1*n2*n3;
    }

    public int largest(){
        return Math.max(n1,Math.max(n2,n3));
    }

    public int smallest(){
        return Math.min(n1,Math.min(n2,n3));
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three integer: ");
        System.out.print("First Number : ");
        int n1= sc.nextInt();
        System.out.print("Second Number : ");
        int n2= sc.nextInt();
        System.out.print("Third Number : ");
        int n3= sc.nextInt();

        Calculation c=new Calculation(n1,n2,n3);

        System.out.println("\nResults: ");
        System.out.println("Sum : "+c.sum());
        System.out.println("Average : "+c.avg());
        System.out.println("Product : "+c.product());
        System.out.println("Largest : "+c.largest());
        System.out.println("Smallest : "+c.smallest());


        sc.close();


    }
}