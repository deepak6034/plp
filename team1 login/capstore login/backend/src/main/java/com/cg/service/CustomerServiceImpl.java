package com.cg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Customer;
import com.cg.repo.ICustomerRepo;
@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private ICustomerRepo repo;
	public Optional<Customer> getCustomerById(int C_id) {
		return repo.findById(C_id);
		
}
}
