Feature: View my notifications in Booking
  As a registered user in Booking
  I need to view my notifications
  To be informed

  @manual-result:passed
  @ViewMyNotifications
    Scenario: View my notifications in Booking
    Given the user is authenticated in Booking
    When he click in view notifications
    Then the user will be able to see the notifications
