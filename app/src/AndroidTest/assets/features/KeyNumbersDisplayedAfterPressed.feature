Feature: Numbers displayed after pressed

  @Ready
  @KeysDisplayed
  @Regression
  Scenario Outline: Numbers displayed after pressed
    Given app is ready to use
    When I click key number <keyNumber>
    Then check key number <keyNumber> pressed is displayed

    Examples:
      | keyNumber |
      | ONE       |
      | TWO       |
      | THREE     |
      | FOUR      |
      | FIVE      |
      | SIX       |
      | SEVEN     |
      | EIGHT     |
      | NINE      |