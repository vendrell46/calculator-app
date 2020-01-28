Feature: Power of number with decimals

  @Ready
  @Power @Decimals
  @Regression
  Scenario: Calculate 2.5 to the power of 2
    Given app is ready to use
    When I calculate to the power of TWO decimal number 2.5
    Then check number displayed is 6.25