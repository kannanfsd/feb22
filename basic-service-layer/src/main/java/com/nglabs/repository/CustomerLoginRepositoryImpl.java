package com.nglabs.repository;

import java.util.HashMap;
import java.util.Map;

import com.nglabs.dto.CustomerLoginDTO;

public class CustomerLoginRepositoryImpl implements CustomerLoginRepository {

	@Override
	public CustomerLoginDTO getCustomerLoginByLoginName(String loginName) {
		Map<String, String> customerCredentials = new HashMap<String, String>();
		customerCredentials.put("susan", "susan123");
		customerCredentials.put("edmund", "edmund123");
		customerCredentials.put("lucy", "lucy123");
		customerCredentials.put("peter", "peter123");
		CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
		customerLoginDTO.setLoginName(loginName);
		customerLoginDTO.setPassword(customerCredentials.get(loginName));
		return customerLoginDTO;
	}

}
