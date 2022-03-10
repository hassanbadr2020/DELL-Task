@removeItem
Feature: User wants to remove an item from the shopping cart

  Scenario Outline: User wants to remove the item from the cart after added
    Given user has been logged in with valid user name "standard_user" and password "secret_sauce"
    And   user in the home page
    When  user add one or more than one "<items>" to the shopping cart
    And   remove one item from the cart
    Then  number of items in the cart is "<numberOfItems>"
    Examples:
      | items | numberOfItems |
      #add 2 and removed one add anu item
      | 2     | 1             |
      #add 3 and removed one add anu item
      | 3     | 2             |