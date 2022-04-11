package com.transaction.model;
import java.util.Scanner;

public class denominator {
    int denominatorCount;
    int denominatorArray[];
    int counter[];
    int amount;
    Scanner sc = new Scanner(System.in);

    //finding the denomiator count
    public  void denominatorCounter() {
        //input the number of denominators in the currency
        System.out.println("Enter the size of currency denominations :");
        denominatorCount = sc.nextInt();
        denominatorArray = new int[denominatorCount];
         
        //the currency denominatore are inputed
        System.out.println("Enter the currency denominations value :");
        for(int i =0;i<denominatorCount;i++){
            denominatorArray[i]= sc.nextInt();
        } 
        //sorting the denominator array
        mergeSort merge = new mergeSort();
        merge.divideSort(denominatorArray, 0, denominatorCount-1);

       
        //input the amount  available to check the count of denominator available
        System.out.println("Enter the amount you want to pay :");
        amount = sc.nextInt();

        //Calculate the count of denomiator available for the given Amount
        counter= new int[denominatorArray.length];
        try {
            for(int i=denominatorArray.length-1,j=0;i>=0;i--,j++){
                if(amount>=denominatorArray[i]){
                counter[j] = amount / denominatorArray[i];
                amount = amount - (counter[j] * denominatorArray[i]);
            }
        }
        
            if(amount>0)
            System.out.println("Exact amount cannot be provided");
            else{
                System.out.println("Your payment approach in order to give min no of notes will be :");
                for(int i=denominatorArray.length-1,j=0;i>=0;i--,j++){
                    if(counter[j]!=0)
                   System.out.println(denominatorArray[i]+" : "+counter[j]);
                }
            }
        }
            
         catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println(e+" note of denominatore is Zero");
        }
    }
    

    
}
