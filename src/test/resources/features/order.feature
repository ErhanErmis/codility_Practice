Feature: Users should be able to order a t-shirt


  Scenario: the user orders a t-shirt
    Given the user is on the Mystore page
    When the user logs in with valid credentials
    Then the user navigates to t-shirts page
    And the user selects a t-shirt
#    Then the user clicks the add to cart button
    Then the user clicks on proceed to checkout button at the pop up screen
    Then the user clicks on proceed to checkout button at the shopping summary
    Then the user clicks on proceed to checkout button at the addresses
    Then the user accepts the terms and conditions
    Then the user clicks on proceed to checkout button at the shipping
    Then the user select the payment option
    Then the user confirms the order
    Then the user views to confirmation page

  Scenario: the user confirms the order from order history
    When the user logs in with valid credentials
    Then the user navigates to personal account
    Then the user clicks on order history button
    Then the user confirms the order number