package com.mycompany.airline_reservation_system.controller;

import com.mycompany.airline_reservation_system.dto.PaymentRequest;
import com.mycompany.airline_reservation_system.model.Payment;
import com.mycompany.airline_reservation_system.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "*")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @PostMapping
    public Payment makePayment(@RequestBody PaymentRequest request) {
        return paymentService.makePayment(request);
    }
}
