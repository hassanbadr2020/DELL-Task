@GetAllCategories
Feature: User Get All Categories

  Scenario: User Try to get All Categories
    Given User send a get request to list all Categories
    Then status code is "200"
    And response body matches "JsonSchemas/ListOfCategories.json" in Api contract
