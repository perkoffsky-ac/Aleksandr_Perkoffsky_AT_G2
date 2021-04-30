Feature: LanguageCurrencyFeature

  Background:
    Given I see the site open

  Scenario: LanguageCurrency Scenario 1
    When I hover over the currency selection
    Then I see the currency selection test passed
    When I hover over the language selection
    Then I see the language selection test passed