Feature: MadridFeature

  Background:
    Given I open this new site

  Scenario: Madrid Scenario 1
  When I press the enter button
  When I enter email address and password
  And I type "Мадрид" as name of the new city
  When I enter date range a month
  And I submit selected data
  When I choose hotels from the list
  Then I see two selected hotels in my favorites