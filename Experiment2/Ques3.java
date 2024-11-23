package Experiment2;


import java.sql.SQLOutput;
import java.util.Scanner;

class Employee{
    String name;
    String lastName;
    double monthlySalary;
    double yearlySalary;

    Employee(String name,String lastName,int monthlySalary)
    {
        this.name=name;
        this.lastName=lastName;
        if(monthlySalary>0) {
            this.monthlySalary = monthlySalary;
        }
    }

    //Setters
    void setName(String name)
    {
        this.name=name;
    }

    void setLastName(String lastName)
    {
        this.lastName=lastName;
    }

    void setMonthlySalary(double salary)
    {
        if(salary>0)
        {
            this.monthlySalary=monthlySalary;
        }
    }

    //getters
    double getMonthlySalary()
    {
        return this.monthlySalary;
    }

    String getLastName()
    {
        return this.lastName;
    }

    String getName()
    {
        return this.name;
    }

    //methods
    void calculateYearlySalary()
    {
        this.yearlySalary=this.monthlySalary*12;
    }

    void displayYearlySalary()
    {
        System.out.println("The yearly salary of "+ this.name+" "+this.lastName+" is:"+this.yearlySalary);
    }
    void hike(double percent)
    {
        this.yearlySalary=(this.yearlySalary)*(percent/100)+(this.yearlySalary);
    }
};



public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Employee e1=new Employee("Ravi","Panchal",500000);
        Employee e2=new Employee("Vishal","Singh",520000);

        e1.calculateYearlySalary();
        e2.calculateYearlySalary();

        e1.displayYearlySalary();
        e2.displayYearlySalary();

        System.out.println("Enter the percentage hike: ");
        double hike=sc.nextDouble();
        e1.hike(hike);
        e2.hike(hike);
        e1.displayYearlySalary();
        e2.displayYearlySalary();
    }
}