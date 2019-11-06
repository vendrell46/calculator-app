Feature: Root of zero

  @Ready
  @Root @ByZero
  @Regression
  Scenario: Calculate root of 0
    Given app is ready to use
    When I calculate root of ZERO
    Then check number displayed is 0