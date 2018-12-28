package com.jojo.flightreservation.service;

import com.jojo.flightreservation.dto.ReservationRequst;
import com.jojo.flightreservation.entity.Reservation;

public interface ReservationService {
	public Reservation bookFAlight(ReservationRequst requst);
}
