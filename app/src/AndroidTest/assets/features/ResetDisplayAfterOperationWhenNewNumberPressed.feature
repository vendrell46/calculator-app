Feature: Reset display after operation when number pressed

  @Ready @Bug
  @KeysDisplayed
  @Regression
  Scenario: Newly entered number to be displayed after operation ends
    Given a result is displayed after an operation
    When I click key number EIGHT
    Then check number displayed is EIGHT