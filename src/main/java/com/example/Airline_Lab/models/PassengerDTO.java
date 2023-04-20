package com.example.Airline_Lab.models;

import java.util.List;

public class PassengerDTO {

    private String name;
    private String contactDetails;

    private List<Long> flightIDs;

    public PassengerDTO(String name, String contactDetails, List flightIDs){
        this.name = name;
        this.contactDetails = contactDetails;
        this.flightIDs = flightIDs;
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

    public List<Long> getFlightIDs() {
        return flightIDs;
    }

    public void setFlightIDs(List<Long> flightIDs) {
        this.flightIDs = flightIDs;
    }
}
