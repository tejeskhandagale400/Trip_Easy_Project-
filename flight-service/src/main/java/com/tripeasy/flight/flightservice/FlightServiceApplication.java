package com.tripeasy.flight.flightservice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tripeasy.flight.flightservice.entity.Flight;
import com.tripeasy.flight.flightservice.entity.Seat;
import com.tripeasy.flight.flightservice.repository.FlightRepository;

@SpringBootApplication
public class FlightServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner populateData(FlightRepository repository) {
		Flight flight1 = new Flight();
		flight1.setFlightId(3);
		flight1.setFlightName("AI-852");
		flight1.setAirline("Airjet");
		flight1.setSource("Mumbai(MUM)");
		flight1.setDestination("Cochin(COCH)");
		flight1.setTime(LocalDateTime.now());

		List<Seat> seats = new ArrayList<Seat>();
		seats.add(new Seat("Economy", 1, 'A', true, 5000.00));
		seats.add(new Seat("Economy", 2, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 3, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 4, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 5, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 6, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 7, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 8, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 9, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 10, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 11, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 12, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 13, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 14, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 15, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 16, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 17, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 18, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 19, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 20, 'A', true, 3500.00));
		seats.add(new Seat("Economy", 1, 'B', true, 5000.00));
		seats.add(new Seat("Economy", 2, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 3, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 4, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 5, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 6, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 7, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 8, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 9, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 10, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 11, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 12, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 13, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 14, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 15, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 16, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 17, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 18, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 19, 'B', true, 3500.00));
		seats.add(new Seat("Economy", 20, 'B', true, 3500.00));

		seats.add(new Seat("Economy", 1, 'C', true, 5000.00));
		seats.add(new Seat("Economy", 2, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 3, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 4, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 5, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 6, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 7, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 8, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 9, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 10, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 11, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 12, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 13, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 14, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 15, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 16, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 17, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 18, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 19, 'C', true, 3500.00));
		seats.add(new Seat("Economy", 20, 'C', true, 3500.00));

		seats.add(new Seat("Economy", 1, 'D', true, 5000.00));
		seats.add(new Seat("Economy", 2, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 3, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 4, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 5, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 6, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 7, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 8, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 9, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 10, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 11, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 12, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 13, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 14, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 15, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 16, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 17, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 18, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 19, 'D', true, 3500.00));
		seats.add(new Seat("Economy", 20, 'D', true, 3500.00));

		seats.add(new Seat("Economy", 1, 'E', true, 5000.00));
		seats.add(new Seat("Economy", 2, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 3, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 4, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 5, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 6, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 7, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 8, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 9, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 10, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 11, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 12, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 13, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 14, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 15, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 16, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 17, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 18, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 19, 'E', true, 3500.00));
		seats.add(new Seat("Economy", 20, 'E', true, 3500.00));

		seats.add(new Seat("Economy", 1, 'F', true, 5000.00));
		seats.add(new Seat("Economy", 2, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 3, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 4, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 5, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 6, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 7, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 8, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 9, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 10, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 11, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 12, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 13, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 14, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 15, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 16, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 17, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 18, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 19, 'F', true, 3500.00));
		seats.add(new Seat("Economy", 20, 'F', true, 3500.00));

		seats.add(new Seat("Economy", 1, 'G', true, 5000.00));
		seats.add(new Seat("Economy", 2, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 3, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 4, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 5, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 6, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 7, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 8, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 9, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 10, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 11, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 12, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 13, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 14, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 15, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 16, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 17, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 18, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 19, 'G', true, 3500.00));
		seats.add(new Seat("Economy", 20, 'G', true, 3500.00));

		seats.add(new Seat("Economy", 1, 'H', true, 5000.00));
		seats.add(new Seat("Economy", 2, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 3, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 4, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 5, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 6, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 7, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 8, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 9, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 10, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 11, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 12, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 13, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 14, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 15, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 16, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 17, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 18, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 19, 'H', true, 3500.00));
		seats.add(new Seat("Economy", 20, 'H', true, 3500.00));

		seats.add(new Seat("Economy", 1, 'I', true, 5000.00));
		seats.add(new Seat("Economy", 2, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 3, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 4, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 5, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 6, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 7, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 8, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 9, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 10, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 11, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 12, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 13, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 14, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 15, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 16, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 17, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 18, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 19, 'I', true, 3500.00));
		seats.add(new Seat("Economy", 20, 'I', true, 3500.00));

		flight1.setSeats(seats);

		return (args) -> {
			repository.save(flight1);
			repository.save(new Flight(1, "AI1203", "SpaceJet", "Pune(PNE)", "Goa(GIA)", LocalDateTime.now(), seats));
			repository.save(new Flight(2, "AI1204", "IndiGo", "Goa(GIA)", "Pune(PNE)", LocalDateTime.now(), seats));
			repository.save(new Flight(4, "AI1205", "IndiGo", "Mumbai(MUM)", "Pune(PNE)", LocalDateTime.now(), seats));
			repository.save(new Flight(5, "AI1206", "IndiGo", "Mumbai(MUM)", "Pune(PNE)", LocalDateTime.now(), seats));
		};
	}
}
