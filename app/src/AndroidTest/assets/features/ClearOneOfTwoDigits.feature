Feature: Clear one of two digits

  @Ready
  @Clear
  @Regression
  Scenario: Clear one of two digits
    Given I have two digits entered
    When I click clear button
    Then check number displayed is 4