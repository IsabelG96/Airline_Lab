package com.example.Airline_Lab.repositories;

import com.example.Airline_Lab.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
