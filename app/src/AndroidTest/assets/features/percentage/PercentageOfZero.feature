Feature: Percentage of zero

  @Ready
  @Percentage @ByZero
  @Regression
  Scenario: Calculate 5 percent of 0
    Given app is ready to use
    When I calculate FIVE percent of ZERO
    Then check number displayed is 0