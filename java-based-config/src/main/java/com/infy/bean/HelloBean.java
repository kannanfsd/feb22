package com.infy.bean;

import org.springframework.beans.factory.annotation.Value;

public class HelloBean {
	@Value("${email}")
	private String email;
	@Value("${team}")
	private String team;
	public String helloWorld() {
		return "Welcome to HelloBean class."+email+", Team "+team;
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	
}
