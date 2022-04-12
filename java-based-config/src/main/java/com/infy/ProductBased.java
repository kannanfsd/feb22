package com.infy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.bean.ProductBean;
import com.infy.bean.WelcomeBean;
import com.infy.configuration.ProductConfig;

public class ProductBased {
	public static final Log LOGGER = LogFactory.getLog(ProductBased.class);

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
		ProductBean productBean = context.getBean(ProductBean.class);
		//WelcomeBean welcomeBean = context.getBean(WelcomeBean.class);
		LOGGER.info("Product Details are, " + productBean.getProductId() + ", " + productBean.getProductName() + ", "
				+ productBean.getProductPrice() + ", " + productBean.getQuantity());
		//LOGGER.info("\nWelcome Details, "+welcomeBean.printWelcome());
		System.out.println("\n\n\n to call toString() ");
		LOGGER.info(productBean);
		
	}
}
