package com.nglabs.controller;

import com.nglabs.dto.CustomerLoginDTO;
import com.nglabs.exception.NglabsLoginException;
import com.nglabs.repository.CustomerLoginRepositoryImpl;
import com.nglabs.service.CustomerLoginService;
import com.nglabs.service.CustomerLoginServiceImpl;

public class CustomerLoginController {
	private CustomerLoginService customerLoginService;
	public String authenticate(CustomerLoginDTO customerLoginDTO)throws NglabsLoginException {
		customerLoginService = new CustomerLoginServiceImpl(new CustomerLoginRepositoryImpl());
		return customerLoginService.authenticateCustomer(customerLoginDTO);
	}
}
