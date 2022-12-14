package com.springboot.springbootmasterclass.customer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springboot.springbootmasterclass.exception.NotFoundException;

@Service
public class CustomerService {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

	private final CustomerRepository  customerRepository;
	
	public CustomerService( CustomerRepository customerRepository) {
		
		this.customerRepository = customerRepository;
	}



	List<Customer> getCustomers() {
		LOGGER.info("Get customer was called");
		return customerRepository.findAll();
	}
	
	Customer getCustomer(Long id) {
		return customerRepository.findById(id).orElseThrow(() ->{
			NotFoundException notFoundException=	new NotFoundException("Customer with ID " +id +" not found");
			
			LOGGER.error("Error in getting customer {}",id, notFoundException.toString());
			return notFoundException;
		});
//		return getCustomers().stream().filter(customer -> customer.getId().equals(id)).findFirst()
//				.orElseThrow(() -> new NotFoundException("Customer with ID " +id +" not found"));
	}
}
