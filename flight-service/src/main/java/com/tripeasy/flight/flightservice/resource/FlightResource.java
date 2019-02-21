package com.tripeasy.flight.flightservice.resource;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tripeasy.flight.flightservice.entity.Flight;
import com.tripeasy.flight.flightservice.entity.Seat;
import com.tripeasy.flight.flightservice.service.FlightService;

/**
 * This class provides the different API for adding new flight, 
 * Update Flight and list of flights from one city to another city 
 *  
 * 
 * @author Shubham Raut
 *
 */
@RestController
@RequestMapping("/flight")
public class FlightResource {

	@Autowired //@Autowired annotation is used for spring bean autowiring. 
	private FlightService service; // Here FlightService bean is autowired  

	/**
	 * This method finds all the flights going from source city to destination city 
	 * 
	 * @param source must not be null
	 * @param destination must not be null
	 * @return response entity with data and HTTP Status code 
	 */
	@GetMapping
	public ResponseEntity<List<Flight>> getAllFlights(@RequestParam String source, @RequestParam String destination) {
		List<Flight> flights = this.service.getAllFlights(source, destination); // This will fetch list of flight and store in list
		if (flights.isEmpty())
			return new ResponseEntity<List<Flight>>(HttpStatus.NOT_FOUND); //if List<Flight> is empty then returning HttpStatus.NOT_FOUND  
		return new ResponseEntity<List<Flight>>(flights, HttpStatus.OK); //if List<Flight> is not empty then returning HttpStatus.OK

	}

	/**
	 * This method takes flight id, if flight not found it 
	 * returns HTTP Status NOT_FOUND ,
	 * if flight found then returns flight object with HTTP Status OK 
	 *     
	 * 
	 * @param flightId
	 * @return flight details with HTTP Status code 
	 */
	@GetMapping("/{flightId}")
	public ResponseEntity<Flight> getFlightById(@PathVariable Integer flightId)
	{
		Optional<Flight> flight=this.service.getFlightById(flightId);
		if(!flight.isPresent()) {
			return new ResponseEntity<Flight>(HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<Flight>(flight.get(),HttpStatus.OK);
	}
	
	/**
	 * This method adds new flight 
	 * 
	 * @param flight must not be null
	 */
	@PostMapping
	public ResponseEntity<String> addFlight(@RequestBody Flight flight) {
		this.service.saveFlight(flight);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	/**
	 * This method updates the flight
	 * 
	 * @param flight must not be null
	 */
	@PutMapping
	public void updateFlight(@RequestBody Flight flight) {
		service.saveFlight(flight);
	}
	
	/**
	 * This methods updates the status of seats booked  
	 * 
	 * @param flight
	 */
	@PutMapping("/book")
	public void updateBookedSeat(@RequestBody Flight flight) {
		this.service.updateSeats(flight);
		
	}
	
}
