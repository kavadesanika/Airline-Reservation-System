package com.mycompany.airline_reservation_system.service;

import com.mycompany.airline_reservation_system.dto.BookingRequest;
import com.mycompany.airline_reservation_system.model.Booking;
import com.mycompany.airline_reservation_system.model.Flight;
import com.mycompany.airline_reservation_system.model.Passenger;
import com.mycompany.airline_reservation_system.repository.BookingRepository;
import com.mycompany.airline_reservation_system.repository.FlightRepository;
import com.mycompany.airline_reservation_system.repository.PassengerRepository;
import com.mycompany.airline_reservation_system.exception.ResourceNotFoundException;
import com.mycompany.airline_reservation_system.exception.SeatUnavailableException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private FlightRepository flightRepository;

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking createBooking(BookingRequest request) {
        Passenger passenger = passengerRepository.findById(request.getPassengerId())
            .orElseThrow(() -> new ResourceNotFoundException("Passenger not found"));

        Flight flight = flightRepository.findById(request.getFlightId())
            .orElseThrow(() -> new ResourceNotFoundException("Flight not found"));

        if (flight.getAvailableSeats() < request.getNumberOfSeats()) {
            throw new SeatUnavailableException("Not enough seats available");
        }

        flight.setAvailableSeats(flight.getAvailableSeats() - request.getNumberOfSeats());
        flightRepository.save(flight);

        Booking booking = new Booking();
        booking.setPassenger(passenger);
        booking.setFlight(flight);
        booking.setNumberOfSeats(request.getNumberOfSeats());
        booking.setBookingStatus("CONFIRMED");

        return bookingRepository.save(booking);
    }

    public void cancelBooking(Long id) {
        Booking booking = bookingRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Booking not found"));

        Flight flight = booking.getFlight();
        flight.setAvailableSeats(flight.getAvailableSeats() + booking.getNumberOfSeats());
        flightRepository.save(flight);

        booking.setBookingStatus("CANCELLED");
        bookingRepository.save(booking);
    }
}
