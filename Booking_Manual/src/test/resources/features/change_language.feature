Feature: Change language in the Booking
  As a user of the Booking
  I need to switch to multiple languages
  To validate the translation

  Background:
    Given the user is on the main page of Booking

  @manual-result:passed
    @ChangeLanguageSuccessful
  Scenario Outline: Change languages in the Booking
    When the user change <languages>
    Then the user will visualize the change to the specific language
    Examples:
      | languages |
      | Italiano  |
      | Français  |
      | Deutsch   |



