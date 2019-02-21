package com.cg.tripeasy.profileservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.tripeasy.profileservice.entity.Profile;

@Service
public interface ProfileService {


	Profile addNewProfile(Profile profile);

	void loginDetails(ResponseEntity<Profile> profile);

	

	List<Profile> getAllProfiles();

	
	ResponseEntity<Profile> deleteProfile(Integer profileId);

	Optional<Profile> getProfileById(Integer profileId);

	Profile updateProfile(Profile profile);

	

	
	

	



	

	

	
	

	



	

	

	



	


	

	
	 
	

	

}
