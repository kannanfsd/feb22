package com.infy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.infy.controller.CustomerLoginController;
import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

private static final Log LOGGER = LogFactory.getLog(DemoApplication.class);
	
	@Autowired
	CustomerLoginController customerLoginController;
	
	@Autowired
	Environment environment;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		try{
			CustomerLoginDTO customerLogin = new CustomerLoginDTO();
			customerLogin.setLoginName("harry");
			customerLogin.setPassword("harry1234");
			customerLoginController.authenticateCustomer(customerLogin);
			LOGGER.info(environment.getProperty("SUCCESS"));
		}catch(InfyBankException exception){
			LOGGER.error(environment.getProperty(exception.getMessage()));
		}
		
	}

}
