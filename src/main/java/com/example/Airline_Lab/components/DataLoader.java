package com.example.Airline_Lab.components;


import com.example.Airline_Lab.models.Flight;
import com.example.Airline_Lab.models.Passenger;
import com.example.Airline_Lab.repositories.FlightRepository;
import com.example.Airline_Lab.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    FlightRepository flightRepository;

    public DataLoader(){

    }
    @Override
    public void run(ApplicationArguments args) throws Exception {

        //NEW YORK
        Flight flightNYC = new Flight("New York City",
                215,
                LocalDate.of(2023, 05, 15),
                22.03 );

        Passenger evePolastri = new Passenger("Eve Polastri",
                "evePolastri@British.gov");

        Passenger villanelle = new Passenger("Villanelle", "666666");

        //PARIS
        Flight flightParis = new Flight("Paris",
                20,
                LocalDate.of(2024,02,03),
                06.45);

        Passenger andySachs = new Passenger("Andy Sachs", "andy@runway.com");
        Passenger mirandaPriestley = new Passenger("Miranda Priestley",
                "editor@runway.com");


        //HONG KONG
        Flight flightHongKong = new Flight("Hong Kong",
                175,
                LocalDate.of(2023, 05,18),
                05.45);

        Passenger fayeWong = new Passenger("Faye Wong", "CaliforniaDreamin@aol.com");
    }
}

