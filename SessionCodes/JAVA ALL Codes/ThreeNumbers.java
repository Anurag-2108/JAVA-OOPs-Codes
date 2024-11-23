import java.util.*;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int avg=(a+b+c)/3;
        int sum=(a+b+c);
        int product=(a*b*c);

       
         //check which is greatest
        if(a>b && a>c){
            System.out.println(a + " is greatest");
        }
        else if( b>a && b>c){
            System.out.println(b +" is greatest");
        }
        else{
            System.out.println(c +" is greatest");
        }

        //check which is smallest
        if(a<b && a<c){
            System.out.println(a +" is smallest");
        }
        else if(b<c && b<a){
            System.out.println(b +" is smallest");
        }
        else{
            System.out.println(c +" is smallest");
        }

        System.out.println("avg="+avg);
        System.out.println("sum="+sum);
        System.out.println("product="+product);


    }
}
