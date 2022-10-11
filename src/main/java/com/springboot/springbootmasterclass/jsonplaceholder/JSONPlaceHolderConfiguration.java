package com.springboot.springbootmasterclass.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSONPlaceHolderConfiguration {

	@Bean("jsonplaceHolder")
	CommandLineRunner commandLineRunner(JSONPlaceHolder jsonPlaceHolder) {
		return args->{
			System.out.println("=====https://jsonplaceholder.typicode.com/=====");
			System.out.println(jsonPlaceHolder.getPosts().size());
			System.out.println("");
			System.out.println("=====https://jsonplaceholder.typicode.com/=====");
			System.out.println(jsonPlaceHolder.getPost(1));
		};
	}
	
	
}
