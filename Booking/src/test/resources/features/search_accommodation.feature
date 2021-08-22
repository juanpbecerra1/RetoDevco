Feature: Search Accommodation
  As user the Booking
  I need to find accommodation
  for my trips

  @SearchAccommodationSuccessful
  Scenario:Search Accommodation
    Given the user is on the main page
    When enters the accommodation data
      | destinationPlace    | arrivalDate      | departureDate     |
      | Cartagena de Indias | 5-September-2021 | 10-September-2021 |
    Then he will be able to see the label accommodations_found

  @SearchAccommodation30days
  Scenario:Search Accommodation
    Given the user is on the main page
    When enters the accommodation data
      | destinationPlace | arrivalDate      | departureDate    |
      | Santa Marta      | 5-September-2021 | 10-November-2021 |
    Then he will be able to see the message Sorry_it_is_not_possible_to_make_reservations_for_more_than_30_nights










