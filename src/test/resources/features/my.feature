Feature: MyFeature

  Background:
    Given I open a site

  Scenario: My Single Scenario 1
    When I type "Париж" as name of the city
    Then I see test passed

  Scenario: My Single Scenario 2
    When I type "Москва" as name of the city
    Then I see test passed

  Scenario Outline: My triple Scenario
    When I type "<city>" as name of the city
    Then I see test passed
    Examples:
      | city |
      | Париж |
      | Москва |
      | Тбилиси |