package com.mycompany.airline_reservation_system.service;

import com.mycompany.airline_reservation_system.dto.PaymentRequest;
import com.mycompany.airline_reservation_system.model.Booking;
import com.mycompany.airline_reservation_system.model.Payment;
import com.mycompany.airline_reservation_system.repository.BookingRepository;
import com.mycompany.airline_reservation_system.repository.PaymentRepository;
import com.mycompany.airline_reservation_system.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private BookingRepository bookingRepository;

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment makePayment(PaymentRequest request) {
        Booking booking = bookingRepository.findById(request.getBookingId())
            .orElseThrow(() -> new ResourceNotFoundException("Booking not found"));

        Payment payment = new Payment();
        payment.setBooking(booking);
        payment.setAmount(request.getAmount());
        payment.setPaymentMethod(request.getPaymentMethod());
        payment.setStatus("SUCCESS");

        return paymentRepository.save(payment);
    }
}
