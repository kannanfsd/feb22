package com.nglabs;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BillPaymentTest {
	
	@Rule
	public ExpectedException ee = ExpectedException.none(); // Creates an empty rule
	
	@Test
	public void validatePaymentOptionTestValid() {
		Bill bill = new Bill("PayPal");
		Assert.assertTrue(bill.validatePaymentOption());
	}
	
	@Test
	public void validatePaymentOptionExpTestInValid() throws Exception {
		ee.expect(Exception.class); // Expecting a type of exception
		// Expecting a text in the exception
		ee.expectMessage("Please provide valid payment option");
		// Creating a Bill with invalid payment option
		Bill bill = new Bill("Credit Cards");
		
		bill.validatePaymentOptionExp(); // Invoking the method to validate
	}
}
