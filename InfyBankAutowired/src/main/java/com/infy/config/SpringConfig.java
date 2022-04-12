package com.infy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.infy.service com.infy.repository com.infy.controller")
@PropertySource("classpath:messages.properties")
public class SpringConfig {

}
