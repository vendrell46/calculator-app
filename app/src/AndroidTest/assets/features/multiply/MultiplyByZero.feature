Feature: Multiply by zero

  @Ready
  @Multiply @ByZero
  @Regression
  Scenario: Multiply by zero
    Given app is ready to use
    When multiply two numbers, TWO and ZERO
    Then check number displayed is 0