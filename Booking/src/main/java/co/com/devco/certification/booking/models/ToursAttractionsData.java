package co.com.devco.certification.booking.models;

import co.com.devco.certification.booking.utils.enums.Translates;

public class ToursAttractionsData {
    private String destination;
    private String date;
    private String numberTickets;
    private String name;
    private String lastName;
    private String mail;
    private String phoneNumber;
    private String country;

    public ToursAttractionsData(String destination, String date, String numberTickets, String name, String lastName, String mail, String phoneNumber, String country) {
        this.destination = destination;
        this.date = date;
        this.numberTickets = numberTickets;
        this.name = name;
        this.lastName = lastName;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getDestination() {
        destination = destination.replace(" ", "_").toUpperCase();
        return Translates.valueOf(destination).toSpanish();
    }

    public String getDate() {
        return date;
    }

    public String getNumberTickets() {
        return numberTickets;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
