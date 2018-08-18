package com.capg.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.bean.Customer;


@Repository
public interface CustomerRepo extends CrudRepository<Customer, String>  {

	

}
