package com.cg.service;

import java.util.Optional;

import com.cg.beans.Customer;

public interface ICustomerService {

public Optional<Customer> getCustomerById(int C_id);


}
