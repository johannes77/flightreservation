package com.jojo.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jojo.flightreservation.dto.ReservationUpdateRequest;
import com.jojo.flightreservation.entity.Reservation;
import com.jojo.flightreservation.repository.ReservationRepository;

@RestController
public class ReservationRESTController {
	@Autowired
	ReservationRepository reservationRepository;

	@RequestMapping("/reserevation/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		return reservationRepository.findById(id).get();
	}
	@RequestMapping("/updateReservation")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest requst){
		Reservation reservation = reservationRepository.findById(requst.getId()).get();
		reservation.setNumberOfBags(requst.getNumberOfBags());
		reservation.setCheckedIn(requst.getCheckIn());
		return reservationRepository.save(reservation);
		
	}

	

}
