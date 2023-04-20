package com.example.Airline_Lab.services;

import com.example.Airline_Lab.models.Flight;
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

   public PassengerRepository savePassenger()

}
