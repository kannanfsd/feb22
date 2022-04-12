package com.nglabs;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.nglabs.controller.CustomerLoginController;
import com.nglabs.dto.CustomerLoginDTO;

/**
 * Hello world!
 *
 */
public class App {
	private static final Log LOGGER = LogFactory.getLog(App.class);
    public static void main( String[] args ) throws Exception
    {
    	PropertiesConfiguration config = new Configurations().properties("configuration.properties");
		try {
			CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
			customerLoginDTO.setLoginName("lucy");
			customerLoginDTO.setPassword("lucy123");
			
			CustomerLoginController customerLoginController = new CustomerLoginController();
			String message = customerLoginController.authenticate(customerLoginDTO);
			System.out.println(message);
			System.out.println(config.getProperty(message));
			LOGGER.info(config.getProperty(message));
		} catch (Exception exception) {
			System.err.println(exception.getMessage());
			System.err.println(config.getProperty(exception.getMessage()));
			LOGGER.info(config.getProperty(exception.getMessage()));
		}
    }
}
