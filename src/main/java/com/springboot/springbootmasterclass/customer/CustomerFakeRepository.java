package com.springboot.springbootmasterclass.customer;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component(value = "fake")
public class CustomerFakeRepository implements CustomerRepo{

	@Override
	public List<Customer> getCustomers() {
		return Arrays.asList(
			new Customer(1L,"Nelson Mwangala"),
			new Customer(2L,"Nillan Barawa")
			);
		}
	

}
