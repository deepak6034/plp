package com.capg.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.bean.Customer;

@RestController
public class CustomerControllerFrontend {
	@RequestMapping("/Customers")
	public Customer getCustomer(@RequestParam String C_id) {
		RestTemplate rt= new RestTemplate();
		Customer c= rt.getForObject("http://localhost:9880/getCustomers?C_id="+C_id, Customer.class);
		return c;
	}
}
