package com.springboot.springbootmasterclass.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class CustomerServiceTest {
	@Autowired
	private CustomerRepository customerResRepository;
	private CustomerService underTest;

	@BeforeEach
	void setUp() {
		underTest = new CustomerService(customerResRepository);
	}

	@AfterEach
	void tearDown() {
		customerResRepository.deleteAll();
	}

	@Test
	void getCustomers() {
		//Given
		Customer jamilla = new Customer(1L, "Jamilla", "hello", "jamilla@gmail.com");
		Customer ali = new Customer(2L, "Jamilla", "hello", "jamilla@gmail.com");

		customerResRepository.saveAll(Arrays.asList(jamilla, ali));
//When
		List<Customer> customer = underTest.getCustomers();
		
		//then
		assertEquals(2, customer.size());

	}

	@Test
	void getCustomer() {
		//Given
		Customer jamilla = new Customer(1L, "Jamilla", "hello", "jamilla@gmail.com");
		
		
		customerResRepository.save(jamilla);
		//When
		Customer actualCustomer = underTest.getCustomer(1L);
		
		//Then
		assertEquals(1L, actualCustomer.getId());
		assertEquals("Jamilla", actualCustomer.getName());
		assertEquals("hello", actualCustomer.getPassword());
		assertEquals("jamilla@gmail.com", actualCustomer.getEmail());
	}
}
