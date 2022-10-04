package com.springboot.springbootmasterclass.customer;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



public class CustomerRepository implements CustomerRepo{

	@Override
	public List<Customer> getCustomers() {
	//TODO: CONNECT to real DB
		return Collections.singletonList(new Customer(1L, "To do a real database"));
	}

}
