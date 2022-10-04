package com.springboot.springbootmasterclass.customer;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CustomerRepository implements CustomerRepo{

	@Override
	public List<Customer> getCustomers() {
	//TODO: CONNECT to real DB
		return Collections.emptyList();
	}

}
