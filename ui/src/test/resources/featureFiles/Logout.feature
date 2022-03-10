@logout
Feature: User wants to logout from the system

  Scenario: user wants to logout when he authenticated
    Given user has been logged in with valid user name "standard_user" and password "secret_sauce"
    And   user in the home page
    When  user click on menu button
    And   click on logout button
    Then  user has been logged out and in login page again