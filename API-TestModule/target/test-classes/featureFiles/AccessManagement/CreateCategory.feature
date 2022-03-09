@CreateCategory
Feature: User wants to create a new Category
  @HappyScenario
  Scenario Outline: User trays to create a new Category with Valid data
    Given user has the name and id of a new Category
      | name   | id   |
      | <name> | <id> |
    When User Send a post request to create the Category
    Then Category has been created with "<name>" and "<id>" that we've provided
    And status code is "201"
    And the test data already cleaned with the "<id>"
    Examples:
      | name        | id        |
      | Fake Name 1 | Fake Id 1 |
      | Fake Name 2 | Fake Id 2 |

