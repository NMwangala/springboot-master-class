package com.springboot.springbootmasterclass.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springboot.springbootmasterclass.exception.NotFoundException;

@Service
public class CustomerService {

	private final CustomerRepo  customerRepo;
	
	public CustomerService( CustomerRepo customerRepo) {
		
		this.customerRepo = customerRepo;
	}



	List<Customer> getCustomers() {
		return customerRepo.getCustomers();
	}
	
	Customer getCustomer(Long id) {
		return getCustomers().stream().filter(customer -> customer.getId().equals(id)).findFirst()
				.orElseThrow(() -> new NotFoundException("Customer with ID " +id +" not found"));
	}
}
