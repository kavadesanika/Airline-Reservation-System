package com.mycompany.airline_reservation_system.repository;

import com.mycompany.airline_reservation_system.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {}
