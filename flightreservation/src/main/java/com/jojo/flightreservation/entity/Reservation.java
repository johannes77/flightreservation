package com.jojo.flightreservation.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity {

	private boolean checkedIn;
	private long numberOfBags;
	private Timestamp created;
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public long getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(long numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public Passenger getPassengerId() {
		return passenger;
	}

	public void setPassengerId(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlightId() {
		return flight;
	}

	public void setFlightId(Flight flight) {
		this.flight = flight;
	}

	public java.sql.Timestamp getCreated() {
		return created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}

}
