package com.mycompany.airline_reservation_system.repository;

import com.mycompany.airline_reservation_system.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {}
