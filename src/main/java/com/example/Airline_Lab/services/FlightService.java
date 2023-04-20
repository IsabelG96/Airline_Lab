package com.example.Airline_Lab.services;

import com.example.Airline_Lab.models.Flight;
import com.example.Airline_Lab.models.Passenger;
import com.example.Airline_Lab.repositories.FlightRepository;
import com.example.Airline_Lab.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    public void saveFlight(Flight flight) {flightRepository.save(flight);}

    public Flight findFlight(Long id) {return flightRepository.findById(id).get();}

    public List<Flight> findAllFlights(){return flightRepository.findAll();}

    public void cancelFlight(Long id) {
        Flight flight = flightRepository.findById(id).get();
        for(Passenger passenger : flight.getPassengers()){
            passenger.removeFlight(flight);
            passengerRepository.save(passenger);
        }
        flightRepository.deleteById(id);
    }
}
