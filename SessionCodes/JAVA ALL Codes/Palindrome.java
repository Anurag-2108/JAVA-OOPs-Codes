import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.nextLine();
        if(isPalindrome(s)){
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("Not Palimdrome!");
        }
        
    }
    public static boolean isPalindrome(String s){
        int low=0;
        int high=s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        
    }
        return true;
    }
    
}