Feature: Power

  @Ready
  @Power @NegativeNumber
  @Regression
  Scenario: Calculate negative 3 to the power of 2
    Given app is ready to use
    When I calculate negative THREE to the power of TWO
    Then check number displayed is -9