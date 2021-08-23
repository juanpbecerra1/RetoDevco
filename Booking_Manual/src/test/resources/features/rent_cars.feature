Feature: Rent cars in Booking
  As a user of the Booking
  I need to rent a car
  To transport me

  @manual-result:passed
    @CarRentReturnInTheSamePlace
  Scenario Outline: Rent car return in the same place
    Given the user is on the rent cars page
    When enters the data to rent car with return in the same place
      | pickUpPlace   | pickUpDate   | returnDate   | driversAge   |
      | <pickUpPlace> | <pickUpDate> | <returnDate> | <driversAge> |
    Then the user will see the <option>
    Examples:
      | pickUpPlace | pickUpDate        | returnDate        | driversAge | option                                         |
      | Medellin    | 02-september-2021 | 10-september-2021 | 30-65      | Map                                            |
      | Medellin    | 02-september-2021 | 10-september-2021 | 16         | The driver must be between 18 and 99 years old |
