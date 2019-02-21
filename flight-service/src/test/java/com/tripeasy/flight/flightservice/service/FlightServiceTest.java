package com.tripeasy.flight.flightservice.service;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tripeasy.flight.flightservice.entity.Flight;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightServiceTest {

	@Autowired
	FlightService service;

	@Test
	public void testIfFlightNotAvailableForSorceAndDestination() {
		List<Flight> flights = service.getAllFlights("Pune", "Banglore");
		assertEquals(true, flights.isEmpty());
	}

	@Test
	public void testIfFlightsAreAvailableFromSourceAndDestination() {
		List<Flight> flights = service.getAllFlights("Pune", "Goa");
		assertEquals(false, flights.isEmpty());
	}

	@Test
	public void testSingleFlightIfAvailable() {
		Optional<Flight> flight = service.getFlightById(1);
		Integer actualFlightId = flight.get().getFlightId();
		assertEquals(new Integer(1), actualFlightId); 
	}
	/*
	 * @Test public void testSingleFlightIfNotAvailable() { Optional<Flight> flight
	 * = service.getFlightById(5); assertEquals(false, flight.isPresent()); }
	 */
	
}
