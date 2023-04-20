package com.example.Airline_Lab.services;

import com.example.Airline_Lab.models.Flight;
import com.example.Airline_Lab.models.Passenger;
import com.example.Airline_Lab.models.PassengerDTO;
import com.example.Airline_Lab.repositories.FlightRepository;
import com.example.Airline_Lab.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {

   @Autowired
   PassengerRepository passengerRepository;

   @Autowired
   FlightRepository flightRepository;

   public PassengerRepository savePassenger(PassengerDTO passengerDTO){
   Passenger passenger = new Passenger(passengerDTO.getName(), passengerDTO.getContactDetails());
   for (Long flightId : passengerDTO.getFlightIDs()){
      Flight flight = flightService.findFlight(flightId);
      passenger.addFlight(flight);
   }
   return passengerRepository.save(passenger);
}

public Passenger findPassenger(Long id) {
   return flightRepository.findById(id).get();}
}
