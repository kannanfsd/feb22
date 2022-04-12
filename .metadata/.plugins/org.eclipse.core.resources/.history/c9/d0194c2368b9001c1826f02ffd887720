package com.infy.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class PropertyBean {
	@Value("${email}")			// set the value from messages.properties file
	private String email;
	@Value("${team}")
	private String team;	
	public PropertyBean() {		
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}	
}
