package com.transaction.main;
import com.transaction.model.denominator;
import com.transaction.model.transaction;

public class controllerClass {
    public static void main(String[] args)throws Exception {
        transaction obj = new transaction();
        denominator note = new denominator();
        obj.transactionCounter();
        note.denominatorCounter();
        
    }
}
