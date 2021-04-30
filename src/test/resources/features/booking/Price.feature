Feature: PriceFeature

  Background:
    Given I open this site

  Scenario: Price Scenario 1
    When I type "Париж" as name of this city
    And I enter date this range
    When I choose the number of guests
    And I choose the number of rooms
    Then I select the hotels with the highest price
    And I am sorting hotels in ascending order
    And I see the spinner loading
    Then I see comparison of numbers test passed



