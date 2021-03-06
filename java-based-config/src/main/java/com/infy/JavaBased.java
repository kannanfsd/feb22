package com.infy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.infy.bean.PropertyBean;
import com.infy.configuration.SpringPropertyConfig;

public class JavaBased {
	
	public static final Log LOGGER = LogFactory.getLog(JavaBased.class);

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringPropertyConfig.class);
		System.out.println("context is created.");
		PropertyBean propertyBean = context.getBean(PropertyBean.class);
		System.out.println("bean is identified.");
		LOGGER.info("Developer Email, "+propertyBean.getEmail()+" and Team Name is "+propertyBean.getTeam());
		
		System.out.println("Environment access..");		
		
		Environment environment = context.getEnvironment();
		LOGGER.info(environment.getProperty("email"));
		LOGGER.info(environment.getProperty("team"));	//directly call the value from messages.properties
		
	}

}
