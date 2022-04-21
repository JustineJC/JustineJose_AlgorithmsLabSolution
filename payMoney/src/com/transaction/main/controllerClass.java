package com.transaction.main;
import com.transaction.model.denominator;
import com.transaction.model.transaction;

public class controllerClass {
    public static void main(String[] args)throws Exception {
        //This class has both payMoney and Currency denomination case in one class.
        
        //obj is an object created for calculating the daily target achieved during daily transactions.
        transaction obj = new transaction();
        
        //object note is created for calculating the count of available denominators in a currency.
        denominator note = new denominator();
        
        //calculate the daily transcation target given
        obj.transactionCounter();
        
        //calculate the count of denominations in a given currency.
        note.denominatorCounter();
        
    }
}
