Feature: Budget
  As a User
  I need an option to register the budget value
  To get control of my whole purchases and obligation


  Background: the user most be in the app
    Given the user has access to the app

  Scenario: Enter the budget value for first time
    When the user defines a budget value for month
    Then the user should be able to see that the budget value is the same value registered in the app home

  Scenario: Edit the budget valueGiven the user has access to the app
    When the user changes the actual budget value
    Then the user should be able to see that the budget value has changed on the app home

  Scenario: Deactivate budget mode
    When the user deactivates the budget mode
    Then the user should be able to see that the budget is not visible
    And the user should be able to see that the expenses and the incomes are visible at the app home

  Scenario: Register expense with budget mode activated
    Given the user has a budget
    When the user register a new expense
    Then the user must be able to see that the budget has been reduced
    And the user should be able to see that the value of expenses has increased


  Scenario: Register income with budget mode activated
    Given the user has a budget
    When the user register a new income
    Then the user should be able to see that the budget isn't changed