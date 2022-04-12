package com.nglabs.repository;

import com.nglabs.dto.CustomerLoginDTO;

public interface CustomerLoginRepository {
	public CustomerLoginDTO getCustomerLoginByLoginName(String loginName);
}
