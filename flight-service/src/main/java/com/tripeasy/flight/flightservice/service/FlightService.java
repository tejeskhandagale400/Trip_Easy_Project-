package com.tripeasy.flight.flightservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tripeasy.flight.flightservice.entity.Flight;

@Service
public interface FlightService {

	/**
	 * This method takes source and destination cities 
	 * and returns list of all flights from source to destination .
	 * 
	 * @param source city 
	 * @param destination city 
	 * @return List
	 */
	List<Flight> getAllFlights(String source, String destination);

	/**
	 * This method takes flight Id and return flight object
	 * 
	 * @param flightId is the unique id of flight 
	 * @return flight object 
	 */
	Optional<Flight> getFlightById(Integer flightId);

	/**
	 * 
	 * @param flight
	 */
	void saveFlight(Flight flight);

	
	/**
	 * 
	 * @param flight
	 */
	void updateSeats(Flight flight);

}