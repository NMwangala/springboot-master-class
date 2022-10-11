package com.springboot.springbootmasterclass.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springboot.springbootmasterclass.exception.NotFoundException;

@Service
public class CustomerService {

	private final CustomerRepository  customerRepository;
	
	public CustomerService( CustomerRepository customerRepository) {
		
		this.customerRepository = customerRepository;
	}



	List<Customer> getCustomers() {
		return customerRepository.findAll();
	}
	
	Customer getCustomer(Long id) {
		return customerRepository.findById(id).orElseThrow(() -> new NotFoundException("Customer with ID " +id +" not found"));
//		return getCustomers().stream().filter(customer -> customer.getId().equals(id)).findFirst()
//				.orElseThrow(() -> new NotFoundException("Customer with ID " +id +" not found"));
	}
}
