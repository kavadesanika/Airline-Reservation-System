package com.mycompany.airline_reservation_system.service;

import com.mycompany.airline_reservation_system.model.Flight;
import com.mycompany.airline_reservation_system.repository.FlightRepository;
import com.mycompany.airline_reservation_system.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight getFlightById(Long id) {
        return flightRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Flight not found with ID: " + id));
    }

    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public void deleteFlight(Long id) {
        Flight flight = getFlightById(id);
        flightRepository.delete(flight);
    }

    public Flight updateFlight(Long id, Flight updatedFlight) {
        Flight flight = getFlightById(id);
        flight.setFlightNumber(updatedFlight.getFlightNumber());
        flight.setSource(updatedFlight.getSource());
        flight.setDestination(updatedFlight.getDestination());
        flight.setDepartureTime(updatedFlight.getDepartureTime());
        flight.setAvailableSeats(updatedFlight.getAvailableSeats());
        return flightRepository.save(flight);
    }
}
