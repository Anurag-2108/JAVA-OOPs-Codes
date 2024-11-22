package Experiment1;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a five digit number: ");
        String input=sc.nextLine();

        if(input.length()!=5 || !input.matches("\\d{5}")){
            System.out.println("Please enter a valid five-digit number.");
            return;
        }

        for(int i=0;i<input.length();i++){
            System.out.println(input.charAt(i));
            if(i<input.length()-1){
                System.out.println("   ");
            }
        }

        System.out.println();

        sc.close();
    }
}