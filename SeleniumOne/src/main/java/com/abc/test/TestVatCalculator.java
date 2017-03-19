package com.abc.test;

import org.testng.annotations.Test;
import org.testng.Assert;
 
public class TestVatCalculator {
	
 
    @Test
    public void testGetVatOnAmount(){
    	
        VatCalculator calc = new VatCalculator();
        double expected = 21;
        Assert.assertEquals(calc.getVatOnAmount(100), expected);
        Assert.assertNotEquals(calc.getVatOnAmount(120), expected);
        System.out.println("Vat Amount=="+calc.getVatOnAmount(120));
    }
}