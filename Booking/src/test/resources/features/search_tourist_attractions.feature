Feature: Search Tourist Attractions
  As a user the Booking
  I need to search for tourist attractions
  for my next visits

  @SearchTouristAttractionsSuccessFul
  Scenario: Search Tourist Attractions
    Given the user is on the tourist attractions page
    When he enters the tourist attractions data
      | date              | numberTickets | name  | lastName | mail                       | phoneNumber |
      | 10-September-2021 | 1             | Pedro | Perez    | devco-automation@gmail.com | 3112224589  |
    Then he will be able to see the label "Review and payment"
