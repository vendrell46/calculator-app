Feature: Subtract

  @Ready
  @Subtract
  @Regression
  Scenario: Subtract two numbers
    Given app is ready to use
    When subtract two numbers, EIGHT minus FOUR
    Then check number displayed is 4