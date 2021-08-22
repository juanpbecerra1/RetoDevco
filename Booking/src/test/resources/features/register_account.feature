Feature: Create Account
  As user the Booking
  I need create account
  to manage my reservations

  @CreateAccountSuccessful
  Scenario: Create account in Booking
    Given the user is on the main page
    When he enters the register data
      | mail                        | password       |
      | devco-automation1@gmail.com | Booking-147963 |
    Then he will be able to see the option "Your account"


