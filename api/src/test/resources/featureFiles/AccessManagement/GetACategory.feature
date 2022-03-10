@GetACategory
Feature: User wants to get a Category with Id

  @HappyScenario
  Scenario Outline: User try to get a Category with the id of the Category
    Given user send a request to get Category with valid "<id>"
    Then status code is "200"
    And the name of the Category is "<name>"
    And response body matches "JsonSchemas/CategoryBody.json" in Api contract
    Examples:
      | id           | name          |
      | abcat0010000 | Gift Ideas    |
      | abcat0020001 | Learning Toys |
      | abcat0020002 | DVD Games     |

  @NegativeScenarios
  Scenario Outline: User try to get a post with the invalid id of the Category
    Given user send a request to get Category with invalid "<id>"
    Then status code is "404"
    And there is no "<record>" found for this id
    Examples:
      | id  | record                       |
      | 0   | No record found for id '0'   |
      | 101 | No record found for id '101' |
      | jk  | No record found for id 'jk'  |