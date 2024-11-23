import java.util.Scanner;

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        if(age<0){
            // try {
            //     throw new AgeNegativeException("Age negative not possible pls enter valid age:");
            // } catch (AgeNegativeException ex) {
            //     ex.printStackTrace();
            // }-
                throw new AgeNegativeException("Age negative not possible pls enter valid age:");
            
        }
        else{
            System.out.println("User Age is"+age);
        }
    }
    
}
