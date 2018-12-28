package com.jojo.flightreservation.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jojo.flightreservation.entity.Flight;
import com.jojo.flightreservation.repository.FlightRepository;

@Controller
public class FlightController {
	@Autowired
	FlightRepository flightRepository;
	@RequestMapping("/findFlight")
	public String findFlight(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern = "yyy-MM-dd") Date departureDte, ModelMap modelMap) {
	List<Flight> flights = flightRepository.findFlights(from, to, departureDte);
	modelMap.addAttribute("flights", flights);
	return "displayFlights";

	}
}
