package com.infy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.infy.bean.HelloBean;

@Configuration
@PropertySource("classpath:messages.properties")
public class SpringConfig {
	@Bean
	public HelloBean getHelloBean() {
		return new HelloBean();
	}
}
