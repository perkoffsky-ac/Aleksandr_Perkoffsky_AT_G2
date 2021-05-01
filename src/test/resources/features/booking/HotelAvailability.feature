Feature: HotelAvailabilityFeature

  Background:
    Given I open a site

  Scenario: HotelAvailability Scenario 1
    When I type "Москва" as name of the city
    And I enter date range
    When I submit the entered data
    And I choice the hotel
    Then I see test passed
