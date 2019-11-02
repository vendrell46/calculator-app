Feature: All theme options are displayed

  @Ready
  @Settings @CustomizeColors
  @Regression
  Scenario: Verifying all theme options are displayed
    Given I am on Settings page
    When I navigate to Customize colors page
    Then all available theme options are displayed