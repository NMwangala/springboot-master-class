package com.springboot.springbootmasterclass.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Check exception
//Runtime EXCEPTION


public class NotFoundException extends RuntimeException{

	public NotFoundException(String message) {
		super(message);
	}

}
