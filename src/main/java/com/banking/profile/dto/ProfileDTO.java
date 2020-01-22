package com.banking.profile.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.banking.profile.entity.Profile;

public class ProfileDTO {

	@NotNull(message = "Account number can't be null")
	Integer accountNumber;

	@NotNull(message = "Name can't be null")
	String name;

	@NotEmpty(message = "Phone number can't be null")
	String phoneNumber;

	@NotNull(message = "Address can't be null")
	String address;

	@NotNull(message = "Age can't be null")
	Integer age;

	@NotEmpty(message = "Email ID can't be null")
	@Email(message = "Email ID is not valid")
	String emailId;

	@NotNull(message = "Gender can't be null")
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

	public static ProfileDTO valueOf(Profile profile) {
		ProfileDTO profileDTO = new ProfileDTO();

		profileDTO.setAccountNumber(profile.getAccountNumber());
		profileDTO.setAddress(profile.getAddress());
		profileDTO.setAge(profile.getAge());
		profileDTO.setEmailId(profile.getEmailId());
		profileDTO.setGender(profile.getGender());
		profileDTO.setName(profile.getName());
		profileDTO.setPhoneNumber(profile.getPhoneNumber());

		return profileDTO;
	}

	public Profile createEntity() {
		Profile profile = new Profile();
		profile.setAccountNumber(this.getAccountNumber());
		profile.setAddress(this.getAddress());
		profile.setAge(this.getAge());
		profile.setEmailId(this.getEmailId());
		profile.setGender(this.getGender());
		profile.setName(this.getName());
		profile.setPhoneNumber(this.getPhoneNumber());

		return profile;
	}

	public ProfileDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfileDTO(@NotNull(message = "Account number can't be null") Integer accountNumber,

			@NotNull(message = "Name can't be null") String name,

			@NotEmpty(message = "Phone number can't be null") String phoneNumber,

			@NotNull(message = "Address can't be null") String address,

			@NotNull(message = "Age can't be null") Integer age,

			@NotEmpty(message = "Email ID can't be null") @Email(message = "Email ID is not valid") String emailId,

			@NotNull(message = "Gender can't be null") char gender) {
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
