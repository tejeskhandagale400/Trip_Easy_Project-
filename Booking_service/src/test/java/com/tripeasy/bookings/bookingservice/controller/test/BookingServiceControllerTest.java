package com.tripeasy.bookings.bookingservice.controller.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.tripeasy.bookings.bookingservice.entity.Address;
import com.tripeasy.bookings.bookingservice.entity.Booking;
import com.tripeasy.bookings.bookingservice.entity.Customer;
import com.tripeasy.bookings.bookingservice.entity.Profile;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class BookingServiceControllerTest {

	@Autowired
	private TestRestTemplate template;

	@Test
	public void testForWrongAPI() throws Exception {
		ResponseEntity<Booking> responseEntity = template.getForEntity("/abc", Booking.class);
		System.out.println(responseEntity.getStatusCodeValue());
		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
	}

	@Test
	public void testForCorrectAPI() throws Exception {
		ResponseEntity<List> responseEntity = template.getForEntity("/bookings", List.class);
		System.out.println(responseEntity.getStatusCodeValue());
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

	@Test
	public void testForGetAllBookings() throws Exception {
		ResponseEntity<String> responseEntity = template.getForEntity("/bookings", String.class);
		System.out.println(responseEntity.getStatusCodeValue());
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

	@Test
	public void testForGetBookingByID() throws Exception {
		ResponseEntity<String> responseEntity = template.getForEntity("/bookings/102", String.class);
		System.out.println(responseEntity.getStatusCodeValue());
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

	@Test
	public void testForGetBookingByIDDoesNotExist() throws Exception {
		ResponseEntity<String> responseEntity = template.getForEntity("/bookings/103", String.class);
		System.out.println("wrong id " + responseEntity.getStatusCodeValue());
		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
	}

	@Test
	public void addBooking() {
		Booking booking = new Booking();
		booking.setBookingID(104);
		booking.setBookingType("OnlineBookingThroughTripEasy");
		booking.setDateOfBooking(LocalDateTime.now());
		booking.setTotalCost(5000.00);
		booking.setBookingDetails("FlightBooking");
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1, "Poonam", "Paraskar",21,"Female"));
		customers.add(new Customer(2, "Kanak", "Soni", 22, "Female"));
		customers.add(new Customer(3, "Laksh", "Handa", 25, "Male"));
		Address address = new Address("F.C.Road", 4125, "Maharashtra", 412405);
		Profile bookedBy = new Profile(101, null, "Poonam Paraskar", "poonam@abc.com", "8124563445", "Female",
				LocalDate.of(1997, 8, 17), "Unmarried", address);
		booking.setBookedBy(bookedBy);
		booking.setCustomers(customers);
		//booking.setNumberOfCustomers(3);
		ResponseEntity<String> responseEntity = template.postForEntity("/bookings", booking, String.class);
		assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
	}

	@Test
	public void updateBooking() {
		Booking booking = new Booking();
		booking.setBookingID(101);
		booking.setBookingType("Onlines");
		booking.setTotalCost(4500.00);
		booking.setBookingDetails("HotelBooking");
		booking.setDateOfBooking(LocalDateTime.of(2019, 02, 14, 10, 16));
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1, "Bhanu", "Bandi", 21, "Male"));
		booking.setCustomers(customers);
		template.put("/bookings", booking);
	}

}