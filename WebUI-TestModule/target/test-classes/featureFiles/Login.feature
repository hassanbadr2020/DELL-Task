@login
Feature: User Login

  @HappyScenario
  Scenario Outline: User try to login with valid email and password
    Given  A user in the login page
    When   user enter name and password in fields "<email>" "<password>"
    And    click on the login button
    Then   user in the home page
    Examples:
      | email         | password     |
      | standard_user | secret_sauce |

  @NegativeScenarios
  Scenario Outline: User try to login with invalid credentials
    Given  A user in the login page
    When   user enter name and password in fields "<email>" "<password>"
    And    click on the login button
    Then   system displays an error message says "<errorMessage>"
    Examples:
      | email         | password     | errorMessage                                                              |
      #Valid Email and invalid Password
      | standard_user | Aa123456     | Epic sadface: Username and password do not match any user in this service |
      #Invalid Email and valid Password
      | mmm@mmm.com   | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      #Valid Email and missing password
      | standard_user |              | Epic sadface: Password is required                                        |
      #Missed Email and Valid password
      |               | secret_sauce | Epic sadface: Username is required                                       |

