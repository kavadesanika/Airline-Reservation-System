package com.mycompany.airline_reservation_system.controller;

import com.mycompany.airline_reservation_system.dto.BookingRequest;
import com.mycompany.airline_reservation_system.model.Booking;
import com.mycompany.airline_reservation_system.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping
    public Booking createBooking(@RequestBody BookingRequest request) {
        return bookingService.createBooking(request);
    }

    @PutMapping("/cancel/{id}")
    public void cancelBooking(@PathVariable Long id) {
        bookingService.cancelBooking(id);
    }
}
