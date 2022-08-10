Feature: Login
  As a swag labs user
  I want a login form
  to get access to my profile


  Scenario: Login
    Given Elvis opens swag labs app
    When he enters to the application with his credentials
    Then he should be able to see the welcome message