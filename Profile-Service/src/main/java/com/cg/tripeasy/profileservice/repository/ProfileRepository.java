package com.cg.tripeasy.profileservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.tripeasy.profileservice.entity.Profile;

@Repository
public interface ProfileRepository extends MongoRepository<Profile, Integer>{
	Profile findByEmailId(String emailId);
}
