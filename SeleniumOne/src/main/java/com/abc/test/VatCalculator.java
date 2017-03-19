package com.abc.test;

public class VatCalculator {
     
    /*
     * Returns 21% VAT on given amount
     */
    public double getVatOnAmount(double amount){
    	System.out.println("In Get vat on amount method");
        return amount * 0.21;
    }
 
}
