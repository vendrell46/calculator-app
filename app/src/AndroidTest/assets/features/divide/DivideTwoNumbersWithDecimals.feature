Feature: Divide

  @Ready
  @Divide @Decimals
  @Regression
  Scenario: Divide two numbers with decimals
    Given app is ready to use
    When divide decimal number 2.5 by itself
    Then check number displayed is 1