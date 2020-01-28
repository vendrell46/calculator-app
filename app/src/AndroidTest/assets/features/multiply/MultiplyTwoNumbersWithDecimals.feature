Feature: Multiply with decimals

  @Ready
  @Multiply @Decimals
  @Regression
  Scenario: Multiply two numbers with decimals
    Given app is ready to use
    When multiply decimal numbers 2.5 and 1.5
    Then check number displayed is 3.75