package com.springboot.springbootmasterclass.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class Customer {
	private final Long id;
	private final String name;
	@JsonProperty(access = Access.WRITE_ONLY)
	private final String password;

	public Customer(Long id, String name, String password) {

		this.id = id;
		this.name = name;
		this.password = password;
	}

	@JsonProperty("customer_id")
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@JsonIgnore
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

}
