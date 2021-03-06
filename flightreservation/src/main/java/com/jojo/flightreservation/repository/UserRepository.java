package com.jojo.flightreservation.repository;

import com.jojo.flightreservation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
