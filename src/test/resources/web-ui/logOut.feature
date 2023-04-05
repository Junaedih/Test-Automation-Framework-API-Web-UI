@web
Feature: Logout

  @valid-logout
  Scenario: Logout from application
    Given user is on home page
    When user click logout button
    Then user on at first page
