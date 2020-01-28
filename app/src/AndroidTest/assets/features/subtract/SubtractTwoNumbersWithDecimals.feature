Feature: Subtract numbers with decimals

  @Ready
  @Subtract @Decimals
  @Regression
  Scenario: Subtract two decimal numbers
    Given app is ready to use
    When subtract two decimal numbers, 4.5 minus 1.5
    Then check number displayed is 3