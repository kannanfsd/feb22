package com.nglabs;
public class Bill {
	private String paymentMode;
	
	public Bill(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	public boolean validatePaymentOption() {
		if (paymentMode.equals("Credit Card")
				|| paymentMode.equals("Debit Card")
				|| paymentMode.equals("PayPal")
				|| paymentMode.equals("Amazon Pay")
				|| paymentMode.equals("Google Pay")) {
			return true;
		}
		return false;
	}
	public void validatePaymentOptionExp() throws Exception {
		try {
			if (!(paymentMode.equals("Credit Card")
					|| paymentMode.equals("Debit Card")
					|| paymentMode.equals("PayPal")
					|| paymentMode.equals("Amazon Pay") || paymentMode
						.equals("Google Pay"))) {
				throw new Exception("Please provide valid payment option");
			}
		} catch (Exception e) {
			throw e;
		}
	}

}
