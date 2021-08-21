Feature: Login in the Booking
  As a registered user of the Booking
  I need login
  to manage my account

  Scenario: Login in the Booking
    Given the user is on the main page
    When he enters the login data
      | mail                       | password       |
      | devco-automation@gmail.com | Booking-147963 |
    Then he will be able to see the option "Your account"
