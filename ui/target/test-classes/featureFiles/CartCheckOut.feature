@checkoutCart
Feature: User wants to add some shopping items to cart

  @HappyScenario
  Scenario Outline: user trays to add one or more than one item to the shopping cart
    Given user has been logged in with valid user name "standard_user" and password "secret_sauce"
    And   user in the home page
    When  user add one or more than one "<items>" to the shopping cart
    And   user clicks on the shopping cart to checkout
    And   click on the checkout button
    And   fill payment information first name "Test" last name "Fake" and postal code "123456"
    And   Click on continue button
    And   the total price is "<totalPrice>"
    And   clicks on the finish button
    Then  the order has been created with thanks word "Your order has been dispatched, and will arrive just as fast as the pony can get there!"
    Examples:
      | items | totalPrice    |
      #Didn't add anu item
      | 0     | Total: $0.00  |
      #add one item
      | 1     | Total: $32.39 |
      #add two items
      | 2     | Total: $43.18 |
      #add three items
      | 3     | Total: $60.45 |

  Scenario Outline: User wants to sort the items from A to Z or Z to A
    Given user has been logged in with valid user name "standard_user" and password "secret_sauce"
    And   user in the home page
    When  select  one of the sorting type "<sortType>"
    Then  the "<items>" have been sorted based the selection
    Examples:
      | sortType    | items                             |
      | AZ          | Sauce Labs Backpack               |
      | ZA          | Test.allTheThings() T-Shirt (Red) |
      | low To High | Sauce Labs Onesie                 |
      | High To low | Sauce Labs Fleece Jacket          |