package com.springboot.springbootmasterclass.customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
@Entity
@Table
public class Customer {
	@Id
	private  Long id;
	@NotBlank
	private  String name;
	@NotBlank
	@JsonProperty(access = Access.WRITE_ONLY)
	private  String password;
	
	@NotBlank
	@Email
	private String email;
	
	

	public Customer(Long id, String name, String password,String email) {

		this.id = id;
		this.name = name;
		this.password = password;
		this.email=email;
	}
	


	public Customer() {
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
	
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}

	

}
