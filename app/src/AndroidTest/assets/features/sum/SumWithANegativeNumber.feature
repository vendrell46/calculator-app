Feature: Sum

  @Ready
  @Sum @NegativeNumber
  @Regression
  Scenario: Sum with a negative number
    Given app is ready to use
    When sum FOUR to a negative TWO
    Then check number displayed is 2