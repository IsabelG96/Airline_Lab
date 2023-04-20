package com.example.Airline_Lab.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column

    private Long id;

    @Column
    private String name;

    @Column(name = "contact_details")
    private String contactDetails;

    @JsonIgnoreProperties({"passengers"})
    @ManyToMany
    @JoinTable(
            name = "passengers_flights",
            joinColumns = @JoinColumn(name = "passenger_id"),
            inverseJoinColumns = @JoinColumn(name = "flight_id")
    )

    private List<Flight> flights;

    public Passenger(String name, String contactDetails) {
        this.name = name;
        this.contactDetails = contactDetails;
        this.flights = new ArrayList<>();
    }

    public Passenger() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}
