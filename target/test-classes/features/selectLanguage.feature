Feature: Language feature

  Scenario: Successful Login under specific language
    Given User on main search page
    When User enters value "selenoid" in the search field
    Then List of results is appeared


