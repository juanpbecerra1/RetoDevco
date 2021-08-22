Feature: Search Accommodation
  As user the Booking
  I need to find accommodation
  for my trips

  @SearchAccommodationSuccessful
  Scenario Outline: Search Accommodation
    Given the user is on the main page
    When enters the accommodation data
      | destinationPlace   | arrivalDate   | departureDate   |
      | <destinationPlace> | <arrivalDate> | <departureDate> |
    Then he will be able to see the label <message>
    Examples:
      | destinationPlace    | arrivalDate       | departureDate     | message                                                                  |
      | Cartagena de Indias | 5-September-2021 | 10-September-2021 | "accommodations found "                                                  |
      | Santa Marta         | 5-September-2021 | 10-November-2021  | "Sorry, it is not possible to make reservations for more than 30 nights" |





