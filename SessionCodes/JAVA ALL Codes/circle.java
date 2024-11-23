import java.util.*;

public class circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        int radius=sc.nextInt();

        //diameter of circle
        System.out.println("dia of circle="+(2*radius));

        //perimeter of circle
        System.out.println("perimeter="+(2*Math.PI*radius));

        //area of circle
        System.out.println("area of circle="+(Math.PI*radius*radius));
    }
    
}
