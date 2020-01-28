Feature: Multiply

  @Ready
  @Multiply
  @Regression
  Scenario: Multiply two numbers
    Given app is ready to use
    When multiply two numbers, TWO and FIVE
    Then check number displayed is 10