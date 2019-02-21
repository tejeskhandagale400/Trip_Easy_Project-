/*package com.cg.tripeasy.profileservice.controller;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.tripeasy.profileservice.entity.Address;
import com.cg.tripeasy.profileservice.entity.Profile;
import com.cg.tripeasy.profileservice.resource.ProfileResource;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ProfileControllerTest {*/

	/*
	 * Profile profile = new Profile("pavan.jpg", "haik", "haiksai@gmail.com", "4",
	 * "male", LocalDate.of(1997, 06, 19), "married", new Address("airoli", 7, "MP",
	 * 2115));
	 */
	/*
	 * Profile profile = new Profile();
	 * 
	 * @Autowired private TestRestTemplate testRestTemplate;
	 * 
	 * @Test public void testForController() throws Exception {
	 * ResponseEntity<ProfileResource> responseEntity =
	 * testRestTemplate.getForEntity("/profiles", ProfileResource.class);
	 * System.out.println(responseEntity.getBody()); assertEquals((HttpStatus.OK),
	 * responseEntity.getStatusCode()); }
	 * 
	 * @Test public void testForGetAllProfiles() throws Exception {
	 * ResponseEntity<String> responseEntity =
	 * testRestTemplate.getForEntity("/profiles", String.class);
	 * assertEquals(HttpStatus.OK, responseEntity.getStatusCode()); }
	 * 
	 * @Test public void testForNewProfile() throws Exception {
	 * ResponseEntity<Profile> responseEntity =
	 * testRestTemplate.postForEntity("/profiles", profile, Profile.class);
	 * assertEquals(HttpStatus.OK, responseEntity.getStatusCode()); }
	 */
	/*
	 * @Test public void testForgetProfile() throws Exception {
	 * ResponseEntity<Profile> responseEntity =
	 * testRestTemplate.getForEntity("/profiles/101", Profile.class);
	 * assertEquals(HttpStatus.OK, responseEntity.getStatusCode()); }
	 */
	/*
	 * @Test public void deleteProfile() throws Exception {
	 * testRestTemplate.delete("/profiles/101"); System.out.println("deleted");
	 * ResponseEntity<Profile> responseEntity =
	 * testRestTemplate.getForEntity("/profiles/101", Profile.class);
	 * System.out.println(responseEntity.getStatusCode());
	 * assertEquals(HttpStatus.OK, responseEntity.getStatusCode()); }
	 * 
	 * @Test public void updateProfile() throws Exception { Profile profile = new
	 * Profile("1.jpg", "p", "haiki@gmail.com", "094", "male", LocalDate.of(1997,
	 * 06, 19), "married", new Address("airoli", 7, "MP",
	 * 2115),"shabbi","shabbzan"); testRestTemplate.put("/profiles/103", profile);
	 * 
	 * ResponseEntity<Profile> responseEntity =
	 * testRestTemplate.getForEntity("/profiles/103", Profile.class);
	 * 
	 * System.out.println(profile.getContactNumber()); System.out.println("erewt");
	 * System.out.println(responseEntity.getBody().getContactNumber());
	 * 
	 * assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	 * 
	 * assertEquals("p", profile.getFullName()); }
	 */
/* } */