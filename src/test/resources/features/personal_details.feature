Feature: Users should be able change
@wip

  Scenario: the user updates name
    When the user logs in with valid credentials
  Then the user navigates to personal account
  And the use navigates to my personal information page
  And the user updates name
  And the user verifies that name is updated