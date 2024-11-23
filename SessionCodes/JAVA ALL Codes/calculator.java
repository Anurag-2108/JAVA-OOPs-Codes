import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        char ch=sc.next().charAt(0);
        switch (ch) {
            case '+':
            System.out.println("sum="+(a+b));
            break;

            case '-':
            System.out.println("subtraction="+(a-b));
            break;
            
            case '*':
            System.out.println("product="+(a*b));
            break;

            case '/':
            System.out.println("quotient="+(a/b));
            break;
            default: System.out.println("Valid Input!");
                break;
        }

    }
    
}
