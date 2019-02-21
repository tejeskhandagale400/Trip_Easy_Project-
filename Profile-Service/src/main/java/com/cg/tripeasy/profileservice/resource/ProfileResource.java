package com.cg.tripeasy.profileservice.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tripeasy.profileservice.entity.Profile;
import com.cg.tripeasy.profileservice.service.ProfileService;

@RestController
@RequestMapping("/profiles")
public class ProfileResource {

	@Autowired
	public ProfileService service;


	@GetMapping
	ResponseEntity<List<Profile>> getAllProfiles() {
		List<Profile> profileList = service.getAllProfiles();
		return new ResponseEntity<>(profileList, HttpStatus.OK);
	}

	@PostMapping
	ResponseEntity<Profile> addNewProfiles(@RequestBody Profile profile) {
		System.out.println(profile);
		service.addNewProfile(profile);
		return new ResponseEntity<Profile>(profile,HttpStatus.OK);
	}

	@DeleteMapping("/{profileId}")
	ResponseEntity<Integer> deleteProfile(@PathVariable Integer profileId) {
		Optional<Profile> profile = service.getProfileById(profileId);
		if (profile!=null) {
			service.deleteProfile(profileId);
			return new ResponseEntity<Integer>(HttpStatus.OK);
		}
		return new ResponseEntity<Integer>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/{profileId}")
	 public Profile getByProfile(@PathVariable Integer profileId) {
	    Optional<Profile> profiles=service.getProfileById(profileId);
	    System.out.println(profiles);
		return profiles.get();
	}
	
	@PutMapping("/{profileId}")
	public ResponseEntity<Profile> updateProfile(@RequestBody Profile profile) {
		System.out.println(profile);
		service.updateProfile(profile);
		return new ResponseEntity<Profile>(profile, HttpStatus.OK);
	}
	 
//// 
////    @PutMapping("/{profileId}")
////    public ResponseEntity<Profile> updateProfileById(@PathVariable Integer profileId) {
////        Optional<Profile> profiles = service.getProfileById(profileId);
////     Profile  profile = profiles.get();
////     System.out.println(profile);
////     
////       // Profile =service.updateProfile(profile);
////    	//service.updateProfile(profile);
////        //System.out.println(update);
//        
//        return new ResponseEntity<Profile>(profile,HttpStatus.OK);
//    }
}