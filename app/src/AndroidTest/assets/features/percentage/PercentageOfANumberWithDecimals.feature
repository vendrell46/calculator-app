Feature: Percentage with decimals

  @Ready
  @Percentage @Decimals
  @Regression
  Scenario: Calculate 2.5 percent of 5
    Given app is ready to use
    When I enter in calculator 2.5 percent of FIVE
    Then check number displayed is 0.125