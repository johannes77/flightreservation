package com.jojo.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jojo.flightreservation.dto.ReservationRequst;
import com.jojo.flightreservation.entity.Flight;
import com.jojo.flightreservation.entity.Reservation;
import com.jojo.flightreservation.repository.FlightRepository;
import com.jojo.flightreservation.service.ReservationServiceImpl;

@Controller
public class ReservationController {
	@Autowired
	FlightRepository flightRepository;

	@Autowired
	ReservationServiceImpl reservationServiceImpl;

	@RequestMapping("/showComplitReservation")
	public String showComplitReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		Flight flight = flightRepository.findById(flightId).get();
		modelMap.addAttribute("flight", flight);
		return "completeReservation";

	}

	@RequestMapping(value = "/conpleteReservation", method = RequestMethod.POST)
	public String conpleteReservation(ReservationRequst requst, ModelMap modelMap) {
		Reservation bookFAlight = reservationServiceImpl.bookFAlight(requst);
		Long flightId = requst.getFlightId();
		modelMap.addAttribute("msg", "Reservation created succesfuly and  the id is:" + bookFAlight.getId());
		return "reservationConfirmation";

	}

}
