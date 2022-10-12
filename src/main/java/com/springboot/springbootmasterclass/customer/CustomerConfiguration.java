package com.springboot.springbootmasterclass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class CustomerConfiguration {

	@Value("${app.useFakeCustomerRepo:false}")
	private Boolean useFakeCustomerRepo;
	
	@Value("${info.company.name}")
	private String companyName;
	
	@Autowired
	private Environment environment;
	@Bean
	CommandLineRunner commandLineRunner() {
		return args ->{
			System.out.println("CommandLine runner, Hurray");
			System.out.println(environment.getProperty("info.company.name"));
		};
	}
	
	@Bean
	CustomerRepo customerRepo() {
		System.out.println("UsefakeRepository " + useFakeCustomerRepo);
		return new CustomerFakeRepository();
		//return useFakeCustomerRepo?new CustomerFakeRepository():new CustomerRepository();
	}
}
