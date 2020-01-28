Feature: Divide

  @Ready
  @Divide
  @Regression
  Scenario: Divide two numbers
    Given app is ready to use
    When divide two numbers, SIX and THREE
    Then check number displayed is 2