import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is greater than b "+(a+">"+b));
        }
        else if (a<b) {
            System.out.println("a is lesser than b "+(a+"<"+b));
            
        }
        else{
           System.out.println("a is equal to b "+(a+"="+b));
        }
    }
}
