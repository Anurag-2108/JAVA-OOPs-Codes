package Experiment3;
import java.util.Scanner;

class X{
    int i;
    int j;
    X(int i,int j)
    {
        this.i=i;
        this.j=j;
    }

    public int finalSum(){
        return this.i+this.j;
    }
}

class Y extends X{
    Y(int i,int j)
    {
        super(i,j);
    }
    public int computeProduct(){
        return this.i*this.j;
    }
}

class Z extends Y{
    Z(int i,int j)
    {
        super(i,j);
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter i: ");
        int i=sc.nextInt();
        System.out.println("Enter j: ");
        int j=sc.nextInt();
        Z z=new Z(i,j);

        System.out.println("Product: "+z.computeProduct());
        System.out.println("Sum: "+z.finalSum());



    }
}