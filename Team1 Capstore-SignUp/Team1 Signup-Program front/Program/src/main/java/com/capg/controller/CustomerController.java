package com.capg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.bean.Customer;


@RestController
public class CustomerController {
	@RequestMapping("/customer")
	public Customer getProduct(@RequestParam("id") String id,@RequestParam("password") String password) {
		RestTemplate rt=new RestTemplate();
		Customer c=rt.getForObject("http://localhost:4448/savecustomers?id="+id+"&password="+password, Customer.class);
		return c;
}
}