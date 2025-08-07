package com.mycompany.airline_reservation_system.repository;

import com.mycompany.airline_reservation_system.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {}
