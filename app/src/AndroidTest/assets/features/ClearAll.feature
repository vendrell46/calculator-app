Feature: Clear all

  @Ready
  @ClearAll
  @Regression
  Scenario: Clear all
    Given I have two digits entered
    When I long click the clear button
    Then check number displayed is 0