package com.cg.tripeasy.profileservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.tripeasy.profileservice.entity.Profile;
import com.cg.tripeasy.profileservice.repository.ProfileRepository;;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepository repo;

	@Override
	public List<Profile> getAllProfiles() {

		return repo.findAll();
	}


	@Override
	public Profile addNewProfile(Profile profile) {
		// TODO Auto-generated method stub
		return repo.save(profile);
	}



	/*
	 * @Override public void loginDetails(Optional<Profile> profile) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

	@Override
	public ResponseEntity<Profile> deleteProfile(Integer profileId) {
		repo.deleteById(profileId);       
		return new ResponseEntity<Profile>(HttpStatus.OK);
	}


	


	@Override
	public void loginDetails(ResponseEntity<Profile> profile) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Optional<Profile> getProfileById(Integer profileId) {
		System.out.println(profileId);
		Optional<Profile> profile = repo.findById(profileId);
		System.out.println(profile);
		return profile;
	}


	@Override
	public Profile updateProfile(Profile profile) {
		profile.setFullName(profile.getFullName());
	        profile.setDateOfBirth(profile.getDateOfBirth());
	        profile.setMaritialStatus(profile.getMaritialStatus());
	        profile.setUserName(profile.getUserName());
	        profile.setAddress(profile.getAddress());
	        profile.setContactNumber(profile.getContactNumber());
	        profile.setEmailId(profile.getEmailId());
	        profile.setGender(profile.getGender());
		return repo.save(profile);
	}
	
}
