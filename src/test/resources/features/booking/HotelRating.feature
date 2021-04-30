Feature: HotelRatingFeature

  Background:
    Given I am opening this site

  Scenario: HotelRating Scenario 1
    When I enter "Москва" as name of the city
    And I press the enter in the city line
    When I am sorting hotels by rating
    And I switch focus to the new window
    Then I see the test passed