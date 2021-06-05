Feature: Users should be able to login

  @wip
  Scenario: Login as a customer
    When the user logs in with valid credentials
    Then the users personal account is displayed
