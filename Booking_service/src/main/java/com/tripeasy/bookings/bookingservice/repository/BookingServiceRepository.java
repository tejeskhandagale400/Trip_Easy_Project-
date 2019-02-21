package com.tripeasy.bookings.bookingservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.tripeasy.bookings.bookingservice.entity.Booking;
/**
 * 
 * @author Poonam Paraskar
 *
 */
@Repository
public interface BookingServiceRepository extends MongoRepository<Booking, Integer> {

	List<Booking> findAllByHotelHotelId(Integer hotelId);

	//Optional<Booking> findOneBookingByProfileId(Integer profileId);
	
	//List<Booking> findAllByProfileProfileId(Integer profileId);
	List<Booking> findAllByBookedByProfileId(Integer profileId);

}
