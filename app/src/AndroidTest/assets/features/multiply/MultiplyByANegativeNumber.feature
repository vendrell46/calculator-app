Feature: Multiply negative

  @Ready
  @Multiply @NegativeNumber
  @Regression
  Scenario: Multiply with a negative number
    Given app is ready to use
    When multiply TWO by a negative FOUR
    Then check number displayed is -8