Feature: Divide by zero

  @Ready @Bug
  @Divide @ByZero @Nan
  @Regression
  Scenario: Divide by zero
    Given app is ready to use
    When divide two numbers, TWO and ZERO
    Then check number displayed is NaN
    And app is still functional