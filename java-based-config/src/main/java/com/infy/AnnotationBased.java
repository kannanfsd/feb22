package com.infy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.infy.bean.HelloBean;
import com.infy.bean.WelcomeBean;
import com.infy.configuration.SpringConfig;
import com.infy.configuration.SpringConfigure;

/**
 * Hello world!
 *
 */
public class AnnotationBased 
{
	public static final Log LOGGER = LogFactory.getLog(AnnotationBased.class);
    public static void main( String[] args )
    {
//    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//    	HelloBean hello = context.getBean(HelloBean.class);
//    	Environment env = context.getEnvironment();
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigure.class);        
        WelcomeBean welcomeBean = context.getBean(WelcomeBean.class);
        LOGGER.info(welcomeBean.printWelcome());
    	//LOGGER.info(hello.helloWorld());
    	//LOGGER.info(hello.getEmail());
    	//LOGGER.info(hello.getTeam());
    	//LOGGER.info("Email: "+env.getProperty("email"));
    	//LOGGER.info("Team: "+env.getProperty("team"));
    }
}
