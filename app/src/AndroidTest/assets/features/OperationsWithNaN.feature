Feature: I operate with displayed NaN

  @Ready @Bug
  @Nan
  @Regression
  Scenario Outline: Any operation done with NaN should return NaN
    Given I have NaN displayed on screen
    When I do <operation> operation with displayed result
    Then check number displayed is NaN

    Examples:
      | operation |
      | PLUS      |
      | MINUS     |
      | MULTIPLY  |
      | DIVIDE    |
      | PERCENT   |
      | POWER     |