package com.myspring.boot.myspringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "banking_customers", schema = "banking_data")
public class Customer {

	private long id;
	private String name;
	private String phone;
	private String email;

	public Customer() {

	}

	public Customer(String pName, String pPhone, String pEmail) {
		this.name = pName;
		this.phone = pPhone;
		this.email = pEmail;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "phone", nullable = false)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Customer customer = (Customer) o;
		return id == customer.id &&
				Objects.equals(name, customer.name) &&
				Objects.equals(phone, customer.phone) &&
				Objects.equals(email, customer.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, phone, email);
	}
}
