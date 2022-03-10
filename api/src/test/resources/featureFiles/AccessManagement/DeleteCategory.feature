@DeleteCategory
Feature: User wants to delete a category with an id of category

  @HappyScenario
  Scenario Outline: User trays to delete a category with valid id
    Given user wants to delete a category with the category "<id>"
    And   the category already created before
      | name   | id   |
      | <name> | <id> |
    When  user sends a delete request to the category service
    Then  status code is "200"
    Examples:
      | id        |
      | Fake Id 1 |
      | Fake Id 2 |