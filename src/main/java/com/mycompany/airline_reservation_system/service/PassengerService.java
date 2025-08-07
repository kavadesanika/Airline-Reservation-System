package com.mycompany.airline_reservation_system.service;

import com.mycompany.airline_reservation_system.model.Passenger;
import com.mycompany.airline_reservation_system.repository.PassengerRepository;
import com.mycompany.airline_reservation_system.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public Passenger getPassengerById(Long id) {
        return passengerRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Passenger not found with ID: " + id));
    }

    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    public void deletePassenger(Long id) {
        Passenger passenger = getPassengerById(id);
        passengerRepository.delete(passenger);
    }

    public Passenger updatePassenger(Long id, Passenger updatedPassenger) {
        Passenger passenger = getPassengerById(id);
        passenger.setName(updatedPassenger.getName());
        passenger.setEmail(updatedPassenger.getEmail());
        passenger.setPhoneNumber(updatedPassenger.getPhoneNumber());
        return passengerRepository.save(passenger);
    }
}
