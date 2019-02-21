package com.tripeasy.flight.flightservice.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripeasy.flight.flightservice.entity.Flight;
import com.tripeasy.flight.flightservice.entity.Seat;
import com.tripeasy.flight.flightservice.repository.FlightRepository;

/**
 * This class provides service implementation of flight
 * 
 * @author Shubham Raut
 *
 */
@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepository repository; 

	@Override
	public List<Flight> getAllFlights(String source, String destination) {
		return repository.findBySourceAndDestination(source,destination);
	}

	@Override
	public Optional<Flight> getFlightById(Integer flightId) {
		return repository.findById(flightId);
	}

	@Override
	public void saveFlight(Flight flight) {
		repository.save(flight);		
	}

	@Override
	public void updateSeats(Flight flight) {
		repository.save(flight);
	}	
	
}
