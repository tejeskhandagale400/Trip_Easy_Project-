package com.tripeasy.bookings.bookingservice.entity;

public class Seat {

	private String flightClass;
	private Integer row;
	private Character column;
	private boolean available;
	private Double price;

	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seat(String flightClass, Integer row, Character column, boolean available, Double price) {
		super();
		this.flightClass = flightClass;
		this.row = row;
		this.column = column;
		this.available = available;
		this.price = price;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Character getColumn() {
		return column;
	}

	public void setColumn(Character column) {
		this.column = column;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (available ? 1231 : 1237);
		result = prime * result + ((column == null) ? 0 : column.hashCode());
		result = prime * result + ((flightClass == null) ? 0 : flightClass.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((row == null) ? 0 : row.hashCode());
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
		Seat other = (Seat) obj;
		if (available != other.available)
			return false;
		if (column == null) {
			if (other.column != null)
				return false;
		} else if (!column.equals(other.column))
			return false;
		if (flightClass == null) {
			if (other.flightClass != null)
				return false;
		} else if (!flightClass.equals(other.flightClass))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (row == null) {
			if (other.row != null)
				return false;
		} else if (!row.equals(other.row))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seat [flightClass=" + flightClass + ", row=" + row + ", column=" + column + ", available=" + available
				+ ", price=" + price + "]";
	}

}
