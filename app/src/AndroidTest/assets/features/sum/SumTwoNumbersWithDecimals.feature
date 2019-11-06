Feature: Sum numbers with decimals

  @Ready
  @Sum @Decimals
  @Regression
  Scenario: Sum two decimal numbers
    Given app is ready to use
    When sum two decimal numbers, 3.3 plus 1.7
    Then check number displayed is 5