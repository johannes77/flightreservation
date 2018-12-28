package com.jojo.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jojo.flightreservation.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
