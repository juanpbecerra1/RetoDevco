Feature: Search Flights
  As user the Booking
  I need to find flights
  for my trips

  @SearchFlightsSuccessful
  Scenario: Search Flights
    Given the user is on the flights page
    When enters the data to fly
      | origin   | destinationPlace | arrivalDate | departureDate |
      | Bogota | Miami            | 10/09/2021  | 15/09/2021    |
    Then he will be able to see the button "View deal"

