package com.banking.profile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {

	@Id
	@Column(name = "account_number", nullable = false)
	Integer accountNumber;

	@Column(nullable = false, length = 45)
	String name;

	@Column(name = "phone_number", nullable = false, length = 10)
	String phoneNumber;

	@Column(nullable = false, length = 45)
	String address;

	@Column(nullable = false)
	Integer age;

	@Column(name = "email_id", nullable = false, length = 45)
	String emailId;

	@Column(nullable = false, length = 1)
	char gender;

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Profile() {

		super();
	}

	public Profile(Integer accountNumber, String name, String phoneNumber, String address, Integer age, String emailId,
			char gender) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.age = age;
		this.emailId = emailId;
		this.gender = gender;
	}

}
