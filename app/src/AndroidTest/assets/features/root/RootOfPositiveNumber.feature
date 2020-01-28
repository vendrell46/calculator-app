Feature: Root

  @Ready
  @Root
  @Regression
  Scenario: Calculate root of 9
    Given app is ready to use
    When I calculate root of NINE
    Then check number displayed is 3