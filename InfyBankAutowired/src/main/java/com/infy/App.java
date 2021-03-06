package com.infy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.infy.config.SpringConfig;
import com.infy.controller.CustomerLoginController;
import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;

public class App {
	public static final Log LOGGER = LogFactory.getLog(App.class); 
    public static void main( String[] args ) {
    	Environment environment=null;
		ApplicationContext applicationContext =null;
		try{
			applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
			environment=applicationContext.getEnvironment();
			CustomerLoginController customerLoginController = applicationContext
					.getBean(CustomerLoginController.class);
			CustomerLoginDTO customerLogin = new CustomerLoginDTO();
			customerLogin.setLoginName("harry");
			customerLogin.setPassword("harry123");
			String res = customerLoginController.authenticateCustomer(customerLogin);
			LOGGER.info(environment.getProperty("SUCCESS"));
			System.out.println("Info: "+environment.getProperty(res));			
		}catch(InfyBankException exception){
			LOGGER.error(environment.getProperty(exception.getMessage()));
		}
    }
}
