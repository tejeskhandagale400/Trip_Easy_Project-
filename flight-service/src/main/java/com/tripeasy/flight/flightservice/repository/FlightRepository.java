package com.tripeasy.flight.flightservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tripeasy.flight.flightservice.entity.Flight;

/**
 * This interface provides methods for searching data from database
 * 
 * @author Shubham Raut
 */
@Repository
public interface FlightRepository extends MongoRepository<Flight, Integer>{

	/**
	 * Custom Query for searching flights between source and destination 
	 * @param source city 
	 * @param destination city
	 * @return list of all available flights from source city to destination city
	 */
	List<Flight> findBySourceAndDestination(String source, String destination);

}
