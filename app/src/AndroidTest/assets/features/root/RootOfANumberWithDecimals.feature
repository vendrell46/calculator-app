Feature: Root of number with decimals

  @Ready
  @Root @Decimals
  @Regression
  Scenario: Calculate root of number with decimals
    Given app is ready to use
    When I calculate root with decimal number 4.9
    Then check number displayed is 2.213594362118