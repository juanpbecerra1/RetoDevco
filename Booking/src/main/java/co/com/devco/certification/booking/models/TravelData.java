package co.com.devco.certification.booking.models;

import co.com.devco.certification.booking.utils.enums.Moths;

public class TravelData {
    private String origin;
    private String destinationPlace;
    private String arrivalDate;
    private String departureDate;

    public TravelData(String origin, String destinationPlace, String arrivalDate, String departureDate) {
        this.origin = origin;
        this.destinationPlace = destinationPlace;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestinationPlace() {
        return destinationPlace;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }
}
