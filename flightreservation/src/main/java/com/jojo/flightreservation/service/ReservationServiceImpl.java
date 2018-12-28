package com.jojo.flightreservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jojo.flightreservation.dto.ReservationRequst;
import com.jojo.flightreservation.entity.Flight;
import com.jojo.flightreservation.entity.Passenger;
import com.jojo.flightreservation.entity.Reservation;
import com.jojo.flightreservation.repository.FlightRepository;
import com.jojo.flightreservation.repository.PassengerRepository;
import com.jojo.flightreservation.repository.ReservationRepository;
@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	FlightRepository flightRepository;
	@Autowired
	PassengerRepository passengerRepository;
	@Autowired
	ReservationRepository reservationRepository;
	
	@Override
	public Reservation bookFAlight(ReservationRequst requst) {
		//Make Payment
		
		Long flightId = requst.getFlightId();
		Flight flight = flightRepository.findById(flightId).get();
		 Passenger passenger = new Passenger();
		 passenger.setFirstName(requst.getPassengerfirstName());
		 passenger.setLastName(requst.getPassengerlastName());
		 passenger.setPhone(requst.getPassengerPhone());
		 passenger.setEmail(requst.getPassengerEmail());
		 Passenger savedPassenger = passengerRepository.save(passenger);
		 
		 Reservation reservation = new Reservation(); 
		 reservation.setFlightId(flight);
		 reservation.setPassengerId(savedPassenger);
		 reservation.setCheckedIn(false);
		 
		 Reservation savedReservation = reservationRepository.save(reservation);
		 
		return savedReservation;
	}

}
