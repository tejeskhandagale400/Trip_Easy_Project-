package com.tripeasy.bookings.bookingservice.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.tripeasy.booking.bookingservice.exception.InvalidInputException;
import com.tripeasy.bookings.bookingservice.entity.Booking;
import com.tripeasy.bookings.bookingservice.service.BookingService;

@RestController

@RequestMapping("/bookings")
public class BookingServiceResource {

	@Autowired
	private BookingService bookingService;

	@PostMapping
	public ResponseEntity<Booking> addBookings(@RequestBody Booking booking) throws InvalidInputException {
		// Booking booking1 = bookingService.addBookings(booking);
		// return new ResponseEntity<Booking>(booking1, HttpStatus.CREATED);
		if (booking.getBookingID() == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		bookingService.addBookings(booking);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PostMapping("/type")
	public ResponseEntity<Booking> bookHotel(@RequestParam String bookingType, @RequestBody Booking booking)
			throws InvalidInputException {
		System.out.println("in hotel booking");
		Booking b = null;
		if (bookingType.equals("hotel")) {
			b = bookingService.addBookings(booking);
		}
		if (bookingType.equals("flight")) {
			b = bookingService.addBookings(booking);
		}
		return new ResponseEntity<>(b, HttpStatus.CREATED);
	}

	/*
	 * @PostMapping public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel)
	 * throws InvalidInputException { if (hotel.getHotelId() == null) { return new
	 * ResponseEntity<>(HttpStatus.BAD_REQUEST);
	 * 
	 * } hotelService.addNewHotel(hotel); return new
	 * ResponseEntity<>(HttpStatus.CREATED); }
	 */
	@GetMapping
	public ResponseEntity<List<Booking>> getListOfAllBookings() {
		List<Booking> bookings = bookingService.getAllBookings();
		if (bookings == null) {
			return new ResponseEntity<>(bookings, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(bookings, HttpStatus.OK);
	}

	@GetMapping("/{bookingID}")
	public ResponseEntity<Booking> getBookingById(@PathVariable Integer bookingID) {
		Optional<Booking> booking = bookingService.getBookingById(bookingID);
		// System.out.println("in resource "+booking);
		if (!booking.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(booking.get(), HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<List<Booking>> getBookingListOfHotelById(@RequestParam Integer hotelId) {
		List<Booking> booking = bookingService.getBookingListOfHotelById(hotelId);
		System.out.println("in resource " + booking);

		return new ResponseEntity<>(booking, HttpStatus.OK);
	}

	@GetMapping("/profile")
	public ResponseEntity<List<Booking>> getBookingListOfProfileById(@RequestParam Integer profileId) {
		List<Booking> booking = bookingService.getBookingListOfProfileById(profileId);
		// TODO SYSO
		System.out.println("in resource " + booking);

		return new ResponseEntity<>(booking, HttpStatus.OK);
	}

	@PutMapping
	public void updateBooking(@RequestBody Booking booking) {
		// Booking booking1 = bookingService.getBookingById(bookingID).get();
		// booking1.setDetails(booking); booking1.setBookingID(bookingID);
		// booking1.setBookingType(bookingType);
		// booking.setBookedBy(booking);
		bookingService.saveBooking(booking);
	}

	@DeleteMapping("/{bookingID}")
	public void deleteBooking(@PathVariable Integer bookingID) {
		bookingService.deleteBooking(bookingID);
	}
}