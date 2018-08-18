package com.capg.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.capg.service.CustomerService;



@RestController
public class CustomerController {
	@Autowired
	CustomerService service;


	@RequestMapping("/savecustomers/{id}/{password}")
	public void saveCustomer(@PathVariable String id,@PathVariable String password){
	service.saveCustomer(id,password);	 
		 	 }

		 	 }

