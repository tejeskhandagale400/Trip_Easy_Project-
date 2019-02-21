
package com.tripeasy.bookings.bookingservice.service;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tripeasy.booking.bookingservice.exception.InvalidInputException;
import com.tripeasy.bookings.bookingservice.entity.Address;
import com.tripeasy.bookings.bookingservice.entity.Booking;
import com.tripeasy.bookings.bookingservice.entity.Customer;
import com.tripeasy.bookings.bookingservice.entity.Profile;
import com.tripeasy.bookings.bookingservice.service.BookingService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingServiceTest {

	@Autowired
	BookingService service;

	@Test
	public void testForBookingListIfEmpty() {
		List<Booking> bookings = service.getAllBookings();
		assertEquals(false, bookings.isEmpty());
	}

	@Test
	public void testForGetBookingById() {
		Optional<Booking> booking = service.getBookingById(101);
		Integer bookingID = booking.get().getBookingID();
		Integer expectedBookingID = 101;
		assertEquals(expectedBookingID, bookingID);
	}

	@Test
	public void testForGetBookingByIDDoesNotExist() {
		Optional<Booking> booking = service.getBookingById(103);
		assertEquals(false, booking.isPresent());
	}

	@Test
	public void testForNewBooking() throws InvalidInputException {
		Booking booking = new Booking();
		booking.setBookingID(105);
		booking.setBookingType("Hotel");
		booking.setDateOfBooking(LocalDateTime.now());
		booking.setTotalCost(1500.00);
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1, "Ajay", "Patil", 25, "Male"));
		customers.add(new Customer(2, "Vijay", "Singh", 30, "Male"));
		customers.add(new Customer(3, "Sujay", "Raut", 27, "Male"));
		Address address = new Address("A.B.Road", 1236, "Uttar-Pradesh", 546321);
		Profile bookedBy = new Profile(1, "Photot1", "Archana Mahajan", "archu@xyz.com", "8974563210", "Female",
				LocalDate.of(1994, 4, 14), "Unmarried", address);
		booking.setBookedBy(bookedBy);
		booking.setCustomers(customers);
		//booking.setNumberOfCustomers(3);
		service.addBookings(booking);
	}
	
	@Test(expected = InvalidInputException.class)
	public void testAddBookingWithInvalidInput() throws InvalidInputException {
		Booking booking = new Booking();
		service.addBookings(booking);
	}
}
