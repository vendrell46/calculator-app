Feature: Sum

  @Ready
  @Sum
  @Regression
  Scenario: Sum two numbers
    Given app is ready to use
    When sum two numbers, TWO and FOUR
    Then check number displayed is 6