@UpdateCategory
Feature: User Wants to update a category name or id or both of them with the category id

  Scenario Outline: User trays to update the category with valid data
    Given user wants to update a category with the category "<id>"
    And   the category already created before
      | name         | id   |
      | <nameCreate> | <id> |
    When  User send a patch request to update a Category
      | name   | id   |
      | <name> | <id> |
    Then  Category has been updated with "<name>" and "<id>" that we've provided
    And status code is "200"
    And the test data already cleaned with the "<id>"
    Examples:
      | nameCreate  | id        | name        |
      | Fake Name 3 | Fake Id 3 | Fake Name 4 |
      | Fake Name 4 | Fake Id 4 | Fake Name 5 |