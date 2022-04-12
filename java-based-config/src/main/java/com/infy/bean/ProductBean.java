package com.infy.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductBean {
	@Value("${id}")
	private int productId;
	@Value("${name}")
	private String productName;
	@Value("${price}")
	private double productPrice;
	@Value("${quantity}")
	private long quantity;
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public long getQuantity() {
		return quantity;
	}
	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", quantity=" + quantity + "]";
	}		
}
