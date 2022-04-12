package com.nglabs.service;

import com.nglabs.dto.CustomerLoginDTO;
import com.nglabs.exception.NglabsLoginException;
import com.nglabs.repository.CustomerLoginRepository;
import com.nglabs.repository.CustomerLoginRepositoryImpl;

public class CustomerLoginServiceImpl implements CustomerLoginService {
	private CustomerLoginRepository customerLoginRepository;
		
	public CustomerLoginServiceImpl(CustomerLoginRepository customerLoginRepository) {
		this.customerLoginRepository = customerLoginRepository;
	}

	@Override
	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws NglabsLoginException {
		// TODO Auto-generated method stub
		String toReturn = null;
		//customerLoginRepository = new CustomerLoginRepositoryImpl();
		CustomerLoginDTO customerLoginFromRepository = customerLoginRepository.getCustomerLoginByLoginName(customerLoginDTO.getLoginName());
		if(customerLoginDTO.getPassword().equals(customerLoginFromRepository.getPassword())) {
			toReturn = "SUCCESS";
		} else {
			throw new NglabsLoginException("Service.WRONG_CREDENTIALS");
		}
		return toReturn;
	}

}
