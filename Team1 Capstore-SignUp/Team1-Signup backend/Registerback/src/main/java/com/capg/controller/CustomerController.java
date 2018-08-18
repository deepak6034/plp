package com.capg.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.capg.service.CustomerService;
import com.capg.service.MerchantService;



@RestController
public class CustomerController {
	@Autowired
	CustomerService service;
	@Autowired
	MerchantService service1;

	@RequestMapping(value="/savecustomers{id}{password}")
	public void saveCustomer(@RequestParam String id,@RequestParam String password){
	service.saveCustomer(id,password);	 
		 	 }
	
	@RequestMapping(value="/savemerchant{id}{password}")
	public void saveMerchant(@RequestParam String id,@RequestParam String password){
	service1.saveMerchant(id,password);	 
		 	 }

		 	 }


	
