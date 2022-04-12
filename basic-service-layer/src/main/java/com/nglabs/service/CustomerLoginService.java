package com.nglabs.service;

import com.nglabs.dto.CustomerLoginDTO;
import com.nglabs.exception.NglabsLoginException;

public interface CustomerLoginService {
	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO)throws NglabsLoginException;
}
