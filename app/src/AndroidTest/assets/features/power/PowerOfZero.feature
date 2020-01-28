Feature: Power of zero

  @Ready
  @Power @ByZero
  @Regression
  Scenario: Calculate 4 to the power of 0
    Given app is ready to use
    When I calculate FOUR to the power of ZERO
    Then check number displayed is 1