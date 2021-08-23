Feature: Book taxi from or to the airport
  As a user of the Booking
  I need to book a taxi to or from the airport
  To be transported

  @manual-result:passed
  @BookTaxiOnWaySuccessful
  Scenario: Book taxi from airport one way
    Given the user is on the taxis reservation page
    When enters the data to taxi reservation
      | pickUpPlace       | destination   | date              | hour  | passenger |
      | Aeroport de paris | Museum Louvre | 10-september-2021 | 10:00 | 2         |
    Then the ser will see the price of the taxis

  @manual-result:passed
  @BookTaxiRoundTripSuccessful
  Scenario: Book taxi from airport round trip
    Given the user is on the taxis reservation page
    When enters the data to taxi reservation
      | OneWayPickUpLocation | destinationPlace | ReturnPickUpLocation | ReturnDestinationPlace | oneWayDate        | oneWayHour | returnDate        | returnHour | passenger |
      | Aeroport de paris    | Museum Louvre    | Museum Louvre        | Aeroport de paris      | 10-september-2021 | 10:00      | 10-september-2021 | 14:00      | 2         |
    Then the user will see the price of the taxis







