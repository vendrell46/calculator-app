Feature: Percentage

  @Ready
  @Percentage @NegativeNumber
  @Regression
  Scenario: Calculate percentage with negative number
    Given app is ready to use
    When I calculate percentage of EIGHT with negative ONE
    Then check number displayed is -0.08