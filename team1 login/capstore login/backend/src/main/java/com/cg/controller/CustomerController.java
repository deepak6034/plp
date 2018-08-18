package com.cg.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.cg.beans.Customer;
import com.cg.service.ICustomerService;


@RestController
public class CustomerController {
	@Autowired
	ICustomerService service;
	@RequestMapping("/getCustomers/{C_id}")
	public Optional<Customer>getCustomerById(@PathVariable String C_id) {
		return service.getCustomerById(Integer.parseInt(C_id));
	}
}
