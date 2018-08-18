package com.cg.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.beans.Customer;
@Repository
public interface ICustomerRepo  extends CrudRepository<Customer,Integer> {

}
