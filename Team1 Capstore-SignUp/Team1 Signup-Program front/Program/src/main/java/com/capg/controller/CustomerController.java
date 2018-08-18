package com.capg.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.bean.Customer;
import com.capg.bean.Merchant;



@RestController
public class CustomerController {
	@RequestMapping("/customer")
	public Customer getProduct(@RequestParam String id,@RequestParam String password) {
		RestTemplate rt=new RestTemplate();
		Customer c=rt.getForObject("http://localhost:4441/savecustomers?id="+id+"&password="+password, Customer.class);
		return c;
}
	@RequestMapping("/merchant")
    public Merchant getMerchant(@RequestParam String id,@RequestParam String password) {
    RestTemplate rt1=new RestTemplate();
	Merchant m=rt1.getForObject("http://localhost:4441/savemerchant?id="+id+"&password="+password, Merchant.class);
	return m;

	}
}
