Feature: Power

  @Ready
  @Power
  @Regression
  Scenario: Calculate 2 to the power of 3
    Given app is ready to use
    When I calculate TWO to the power of THREE
    Then check number displayed is 8