package com.banking.profile.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.banking.profile.dto.ProfileDTO;
import com.banking.profile.service.ProfileService;

@RestController
public class ProfileController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProfileService profileService;

	@GetMapping(value = "/profiles/{accountNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProfileDTO getProfile(@PathVariable Integer accountNumber) {

		logger.info("Get profile request, inside Controller. AccNumber : ", accountNumber);

		ProfileDTO profileDTO = profileService.getProfile(accountNumber);
		return profileDTO;

	}

	@PutMapping(value = "/profiles", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProfileDTO updateProfile(@Valid @RequestBody ProfileDTO profileDTO) {

		logger.info("Update profile request, inside Controller. RequestBody : ", profileDTO);

		profileService.updateProfile(profileDTO);
		return profileDTO;
	}

	/*
	 * @PutMapping(value="/profiles/{accountNumber}", consumes =
	 * MediaType.APPLICATION_JSON_VALUE) public void updateProfile(@PathVariable
	 * Integer accountNumber,@RequestBody ProfileDTO profileDTOR) {
	 * 
	 * ProfileDTO profileDTO=profileService.getProfile(accountNumber);
	 * 
	 * profileDTO.setAddress(profileDTOR.getAddress());
	 * profileDTO.setAge(profileDTOR.getAge());
	 * profileDTO.setEmailId(profileDTOR.getEmailId());
	 * profileDTO.setGender(profileDTOR.getGender());
	 * profileDTO.setName(profileDTOR.getName());
	 * profileDTO.setPhoneNumber(profileDTOR.getPhoneNumber());
	 * 
	 * profileService.updateProfile(profileDTO);
	 * 
	 * }
	 */

}
