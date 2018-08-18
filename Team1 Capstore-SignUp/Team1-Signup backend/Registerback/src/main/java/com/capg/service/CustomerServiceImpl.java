package com.capg.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.bean.Customer;

import com.capg.repo.CustomerRepo;




@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
    CustomerRepo repo;

	@Override
	public void saveCustomer(String id, String password) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c.setId(id);
		c.setPassword(password);
		repo.save(c);
	}
	




	
}


