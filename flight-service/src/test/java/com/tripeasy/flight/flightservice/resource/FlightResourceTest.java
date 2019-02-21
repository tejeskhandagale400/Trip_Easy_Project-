package com.tripeasy.flight.flightservice.resource;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.tripeasy.flight.flightservice.entity.Flight;
import com.tripeasy.flight.flightservice.entity.Seat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class FlightResourceTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void testGetAllFlightForValidSourceAndDestination() {
		ResponseEntity<List> responseEntity = testRestTemplate.getForEntity("/flight?source=Pune&destination=Goa",List.class);		
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

	@Test
	public void testGetAllFlightForInvalidSourceAndDestination() {
		ResponseEntity<List> responseEntity = testRestTemplate.getForEntity("/flight?source=Punee&destination=Goaa",List.class);		
		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
	}
	
	@Test
	public void testGetAllFlight() {
		ResponseEntity<List> responseEntity = testRestTemplate.getForEntity("/flight?source=Punee&destination=Goaa",List.class);		
		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
	}


	@Test
	public void addFlight() {
		Flight flight=new Flight();
		flight.setFlightId(3);
		flight.setFlightName("AI-852");
		flight.setAirline("Airjet");
		flight.setSource("Pune");
		flight.setDestination("Mumbai");
		flight.setTime(LocalDateTime.now());
		
		List<Seat> seats=new ArrayList<Seat>();
		seats.add(new Seat("Economy", 1, 'C', true, 5000.00));
		seats.add(new Seat("Economy", 2, 'B', true, 2500.00));
		seats.add(new Seat("Economy", 2, 'A', true, 3500.00));
		flight.setSeats(seats);
		
		ResponseEntity<String> responseEntity =testRestTemplate.postForEntity("/flight", flight,String.class);
		assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
		
	}
	
	@Test
	public void updateFlight() {
		Flight flight=new Flight();
		flight.setFlightId(3);
		flight.setFlightName("AI-852 Updated");
		flight.setAirline("Airjet");
		flight.setSource("Pune");
		flight.setDestination("Mumbai");
		flight.setTime(LocalDateTime.now());
		
		List<Seat> seats=new ArrayList<Seat>();
		seats.add(new Seat("Economy", 1, 'C', true, 5000.00));
		seats.add(new Seat("Economy", 2, 'B', true, 2500.00));
		seats.add(new Seat("Economy", 2, 'A', true, 3500.00));
		flight.setSeats(seats);
		
		testRestTemplate.put("/flight", flight);
		
	}
	
}
