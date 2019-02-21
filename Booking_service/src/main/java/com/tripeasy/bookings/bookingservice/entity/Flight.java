package com.tripeasy.bookings.bookingservice.entity;

import java.time.LocalDateTime;
import java.util.List;

//import org.springframework.data.annotation.Id;

public class Flight {

	//@Id
	private Integer flightId;
	private String flightName;
	private String airline;
	private String source;
	private String destination;
	private LocalDateTime time;
	private List<Seat> seats;

	public Flight() {
		super();
	}

	public Flight(Integer flightId, String flightName, String airline, String source, String destination,
			LocalDateTime time, List<Seat> seats) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.time = time;
		this.seats = seats;
	}

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airline == null) ? 0 : airline.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((flightId == null) ? 0 : flightId.hashCode());
		result = prime * result + ((flightName == null) ? 0 : flightName.hashCode());
		result = prime * result + ((seats == null) ? 0 : seats.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (airline == null) {
			if (other.airline != null)
				return false;
		} else if (!airline.equals(other.airline))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightId == null) {
			if (other.flightId != null)
				return false;
		} else if (!flightId.equals(other.flightId))
			return false;
		if (flightName == null) {
			if (other.flightName != null)
				return false;
		} else if (!flightName.equals(other.flightName))
			return false;
		if (seats == null) {
			if (other.seats != null)
				return false;
		} else if (!seats.equals(other.seats))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", airline=" + airline + ", source="
				+ source + ", destination=" + destination + ", time=" + time + ", seats=" + seats + "]";
	}

}
