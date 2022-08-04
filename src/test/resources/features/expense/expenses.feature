Feature: Incomes
  As a User
  I need an option to register the expensive
  To get control of my whole purchases and obligation

  Background: the user most be in the app
    Given the user has access to the app


    Scenario: Register new expenses without incomes
      When the user registers new expenses
      Then the user should be able to see that the balance is the expected
      And the user should be able to see that the expenses are the expected

  Scenario: Register new expense by category without incomes
    When the user registers new expenses
    Then the user should be able to see that the balance is the expected
    And the user should be able to see that the expenses are the expected
    And the user should be able to see that the expense percentages add up to 100 percent


    Scenario: Register a new expense selecting a predefined category
      When the user selects a category to register a new expense
      Then the user should be able to see that the balance is negative and the expected
      And the user should be able to see that the percent is 100 percent in the category selected



    Scenario: scroll
      When I perform a scroll