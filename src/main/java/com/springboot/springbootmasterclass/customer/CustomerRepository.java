package com.springboot.springbootmasterclass.customer;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

//	@Override
//	public List<Customer> getCustomers() {
//	//TODO: CONNECT to real DB
//		return Collections.singletonList(new Customer(1L, "To do a real database","todo","email@gmail.com"));
//	}

}
