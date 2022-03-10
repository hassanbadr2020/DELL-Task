Feature: User wants to add some shopping items to cart

  Scenario Outline: user trays to add one or more than one item to the shopping cart
    Given user has been logged in with valid user name "standard_user" and password "secret_sauce"
    And   user in the home page
    When  user add one or more than one "<items>" to the shopping cart
    And   user clicks on the shopping cart to checkout
    And   click on the checkout button
    And   fill payment information
    And   Click on continue button
    And   the total price is "<totalPrice>"
    And   clicks on the finish button
    Then  the order has been created with thanks word "Your order has been dispatched, and will arrive just as fast as the pony can get there!"
    Examples:
      | items | totalPrice |
      | 1     | 20         |
      | 2     | 30         |
      | 3     | 40         |