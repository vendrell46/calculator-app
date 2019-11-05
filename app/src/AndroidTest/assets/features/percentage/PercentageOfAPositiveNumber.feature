Feature: Percentage

  @Ready
  @Percentage
  @Regression
  Scenario: Calculate 1 percent of 8
    Given app is ready to use
    When I calculate ONE percent of EIGHT
    Then check number displayed is 0.08