Feature: Divide negative

  @Ready
  @Divide @NegativeNumber
  @Regression
  Scenario: Divide with a negative number
    Given app is ready to use
    When divide by THREE a negative SIX
    Then check number displayed is -2