package com.banking.profile.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.profile.dto.ProfileDTO;
import com.banking.profile.entity.Profile;
import com.banking.profile.repository.ProfileRepository;

@Service
public class ProfileService {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProfileRepository profileRep;

	public ProfileDTO getProfile(Integer accountNumber) {

		logger.info("Get profile request, inside Service. AccNumber : ", accountNumber);

		Profile profile = profileRep.findById(accountNumber).get();
		ProfileDTO profileDTO = ProfileDTO.valueOf(profile);

		return profileDTO;

	}

	public void updateProfile(ProfileDTO profileDTO) {

		logger.info("Update profile request, inside Service. RequestBody : ", profileDTO);

		Profile profile = profileDTO.createEntity();
		profileRep.save(profile);
	}

	/*
	 * public Profile findById(Integer accountNumber); { logger.info("in Service");
	 * 
	 * Map<String, String> customerCredentials = new HashMap<String, String>();
	 * customerCredentials.put("tom", "tom123"); customerCredentials.put("harry",
	 * "harry123"); Profile profile = profileRep.findById(accountNumber).get();
	 * profile.setLoginName(loginName);
	 * profile.setPassword(customerCredentials.get(loginName)); return profile; }
	 */
}
