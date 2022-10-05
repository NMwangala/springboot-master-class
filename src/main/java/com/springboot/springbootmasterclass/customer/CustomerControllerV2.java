package com.springboot.springbootmasterclass.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2/customer")

public class CustomerControllerV2 {

	private final CustomerService customerService;

	@Autowired
	public CustomerControllerV2(CustomerService customerService) {

		this.customerService = customerService;
	}

	@GetMapping(value = "all")
	List<Customer> getCustomers() {
		return customerService.getCustomer();
	}

	@GetMapping(path="{customerId}")
	Customer getCustomer(@PathVariable("customerId") Long id) {
		return customerService.getCustomer().stream().filter(customer -> customer.getId().equals(id)).findFirst()
				.orElseThrow(() -> new IllegalStateException("Customer not found"));
	}

	@PostMapping
	void createNewCustomer(@RequestBody Customer customer) {

		System.out.println("Post request ----");
		System.out.println(customer);

	}

	@PutMapping
	void updateCustomer(@RequestBody Customer customer) {

		System.out.println("Update request ----");
		System.out.println(customer);

	}

	@DeleteMapping(path = "{customerId}")
	void removeCustomer(@PathVariable("csutomerId") Long id) {
		System.out.println("Deleting customer with id " + id);
	}

}
