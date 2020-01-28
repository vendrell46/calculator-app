Feature: Subtract from negative number

  @Ready
  @Subtract @NegativeNumber
  @Regression
  Scenario: Subtract with a negative number
    Given app is ready to use
    When subtract TWO to a negative SIX
    Then check number displayed is -8