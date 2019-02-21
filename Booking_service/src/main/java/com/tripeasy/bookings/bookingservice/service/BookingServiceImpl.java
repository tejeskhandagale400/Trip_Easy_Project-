package com.tripeasy.bookings.bookingservice.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tripeasy.booking.bookingservice.exception.InvalidInputException;
import com.tripeasy.bookings.bookingservice.entity.Booking;
import com.tripeasy.bookings.bookingservice.repository.BookingServiceRepository;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingServiceRepository repository;

	@Override
	public List<Booking> getAllBookings() {
		return repository.findAll();
	}

	@Override
	public Booking addBookings(Booking booking) throws InvalidInputException {
		try {
			return repository.save(booking);
		} catch (Exception e) {
			throw new InvalidInputException("Invalid Input");
		}
	}

	/*
	 * @Override public void addNewHotel(Hotel hotel) throws InvalidInputException {
	 * try { hotelRepository.save(hotel); } catch (Exception e) { throw new
	 * InvalidInputException("Invalid  input Data "); }
	 * 
	 * }
	 */
	@Override
	public Optional<Booking> getBookingById(Integer bookingID) {
		return repository.findById(bookingID);
	}

	@Override
	public void deleteBooking(Integer bookingID) {
		repository.deleteById(bookingID);
	}

	@Override
	public void saveBooking(Booking booking1) {
		repository.save(booking1);
	}

	@Override
	public List<Booking> getBookingListOfHotelById(Integer hotelId) {
		return repository.findAllByHotelHotelId(hotelId);
	}

	@Override
	public List<Booking> getBookingListOfProfileById(Integer profileId) {
		// TODO Auto-generated method stub
		return repository.findAllByBookedByProfileId(profileId);
	}
}
