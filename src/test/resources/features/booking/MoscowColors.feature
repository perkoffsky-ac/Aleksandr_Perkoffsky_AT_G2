Feature: MoscowColorsFeature

  Background:
    Given I see that this site is open

  Scenario: MoscowColors Scenario 1
    When I enter "Москва" as city name
    And I press the input in the city line
    When I see a certain hotel
    Then I see color comparison test passed