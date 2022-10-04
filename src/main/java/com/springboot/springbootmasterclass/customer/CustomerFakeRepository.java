package com.springboot.springbootmasterclass.customer;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public class CustomerFakeRepository implements CustomerRepo{

	@Override
	public List<Customer> getCustomers() {
		return Arrays.asList(
			new Customer(1L,"Nelson Mwangala","Password123"),
			new Customer(2L,"Nillan Barawa","123Password")
			);
		}
	

}
