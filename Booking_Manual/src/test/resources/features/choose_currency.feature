Feature: Choose currency in Booking
  As a user of the Booking
  I need to choose different currencies
  To see the prices

  @manual-result:passed
  @ChooseCurrency
  Background:
    Given the user is on the main page of Booking

  @manual-result:passed
    @ChooseCurrency
  Scenario Outline: Choose currency
    When the user choose <currency>
    Then the user will visualize the change to the specific currency
    Examples:
      | currency |
      | EUR      |
      | USD      |
      | ARS      |



