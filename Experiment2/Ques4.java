package Experiment2;

import java.util.Scanner;

class Date
{
    int day;
    int month;
    int year;

    Date(int month,int year,int day)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    //setter
    void setDay(int day)
    {
        this.day=day;
    }

    void setMonth(int month)
    {
        this.month=month;
    }

    void setYear(int year)
    {
        this.year=year;
    }

    //getters
    int getDay()
    {
        return this.day;
    }

    int getMonth()
    {
        return this.month;
    }

    int getYear()
    {
        return this.year;
    }

    void displayDate()
    {
        System.out.println("Date is: "+this.getMonth()+"/"+this.getYear()+"/"+this.getDay());
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your month: ");
        int month=sc.nextInt();

        System.out.print("Enter your year: ");
        int year=sc.nextInt();

        System.out.print("Enter your day: ");
        int day=sc.nextInt();

        Date date=new Date(month,year,day);
        date.displayDate();


    }
}