Feature: Checking all theme options available

  @Ready
  @Settings
  @Regression
  Scenario: Checking all theme options available
    Given I am on Settings page
    When I navigate to Customize colors page
    Then all available theme options are displayed