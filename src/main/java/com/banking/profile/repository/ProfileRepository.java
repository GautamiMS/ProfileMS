package com.banking.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.profile.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {

	// public Profile findById(Integer accountNumber);

}
