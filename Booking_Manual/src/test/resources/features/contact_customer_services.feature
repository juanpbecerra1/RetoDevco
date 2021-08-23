Feature: Contact customer services of Booking
  As a user of the app
  I need to contact customer service
  To solve doubts

  @manual-result:passed
  @ContactCustomerServices
  Scenario: Contact customer services
    Given the user is on the main page
    When he click in contact customer services
    Then the user will see the message "Help Page"
