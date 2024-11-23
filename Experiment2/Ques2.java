package Experiment2;

import java.util.Scanner;

class Invoice{
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;


    //create a Constructor
    Invoice(String partNumber,String partDescription,int quantity,double pricePerItem)
    {
        this.partNumber=partNumber;
        this.partDescription=partDescription;
        this.quantity=quantity;
        if(pricePerItem<0)
        {
            this.pricePerItem=0.0;
        }
        else
        {
            this.pricePerItem=pricePerItem;
        }
    }

    //setter
    void setPartNumber(String partNumber)
    {
        this.partNumber=partNumber;
    }

    void setPartDescription(String partDescription)
    {
        this.partDescription=partDescription;
    }

    void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }

    void setPricePerItem(double pricePerItem)
    {
        this.pricePerItem=pricePerItem;
    }


    //getter
    String getPartNumber()
    {
        return this.partNumber;
    }

    String getPartDescription()
    {
        return this.partDescription;
    }

    int getQuantity()
    {
        return this.quantity;
    }

    double getPricePerItem()
    {
        return this.pricePerItem;
    }

    double getInvoiceAmount()
    {
        return this.pricePerItem*this.quantity;
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the part Number: ");
        String partNum=sc.nextLine();

        System.out.print("Enter the part Description: ");
        String partDes=sc.nextLine();

        System.out.print("Enter the quantity: ");
        int quantity=sc.nextInt();

        System.out.print("Enter the price per item: ");
        double perItem=sc.nextDouble();

        Invoice invoice=new Invoice(partNum,partDes,quantity,perItem);
        System.out.println();
        System.out.println("part Number: "+invoice.getPartNumber());


        System.out.println("part description : "+invoice.getPartDescription());

        System.out.println("quantity : "+invoice.getQuantity());

        System.out.println("Invoice : "+invoice.getPricePerItem());



    }
}