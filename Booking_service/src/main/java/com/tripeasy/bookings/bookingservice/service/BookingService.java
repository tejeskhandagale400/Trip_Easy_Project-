package com.tripeasy.bookings.bookingservice.service;

import java.util.List;
import java.util.Optional;
import com.tripeasy.booking.bookingservice.exception.InvalidInputException;
import com.tripeasy.bookings.bookingservice.entity.Booking;

public interface BookingService {

	List<Booking> getAllBookings();

	Booking addBookings(Booking booking) throws InvalidInputException;
	// List<Booking> getListOfAllBookings();

	Optional<Booking> getBookingById(Integer bookingID);

	// void updateBooking(Booking booking1);

	void deleteBooking(Integer bookingID);

	void saveBooking(Booking booking1);

	List<Booking> getBookingListOfHotelById(Integer hotelId);

	List<Booking> getBookingListOfProfileById(Integer profileId);

}