Feature: Sum

  @Ready
  @Sum
  @Regression
  Scenario: Sum two numbers
    Given app is ready to use
    When sum two numbers
    Then check number displayed is 6