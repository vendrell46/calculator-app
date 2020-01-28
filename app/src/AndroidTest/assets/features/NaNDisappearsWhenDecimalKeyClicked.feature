Feature: NaN disappears when decimal key clicked

  @Ready @Bug
  @Nan
  @Regression
  Scenario: NaN disappears when decimal key clicked
    Given I have NaN displayed on screen
    When I click decimal key
    Then check number displayed is 0.
    And app is still functional