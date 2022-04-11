package com.transaction.model;
import java.util.Scanner;
public class transaction {
    long sum=0;
    int flag =0;
    int size;
    Scanner sc = new Scanner(System.in);
    public void transactionCounter(){
        //Array size retrieved
        System.out.println("Enter the size of transaction array");
        size=sc.nextInt();
        int targetCheck;// value to be checked linarly in the array (amount)
        int[] inputTransaction = new int[size];
        //Retriving the transaction into an array
        System.out.println("Enter the values of array");
        for(int i=0;i<size;i++)
        {
            inputTransaction[i]=sc.nextInt();

        }
        //Taking the value to targetSize or the amount 
        System.out.println("Enter the total no of targets that needs to be achieved");
        int targetSize = sc.nextInt();
        // for every amount the while loop checks in the array if the transaction has occured
        while(targetSize!=0){
            System.out.println("Enter the value of target");
             targetCheck=sc.nextInt();
        sum = 0;
        //checking the target achieved or not
        for(int i=0;i<size;i++){
            sum = sum + inputTransaction[i];
            if(sum>=targetCheck){//check if the amount is achieved
                System.out.println("Target achieved after "+(i+1)+" transactions");
                flag = 1;
                break;
              }
                else
                flag = 0;                      
           }  
            if(flag!=1){
            System.out.println("Given target is not achieved.");     
            }     
            targetSize--;
        }
    }
}
