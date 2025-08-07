package com.mycompany.airline_reservation_system.repository;

import com.mycompany.airline_reservation_system.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {}
