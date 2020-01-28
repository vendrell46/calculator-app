Feature: Root of negative number

  @Ready @Bug
  @Root @NegativeNumber @Nan
  @Regression
  Scenario: Calculate root of negative 4
    Given app is ready to use
    When I calculate root with negative FOUR
    Then check number displayed is NaN
    And app is still functional