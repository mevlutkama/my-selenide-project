@assertions2
Feature: assertions2
  Scenario: TC01_search for tesla
    Given I navigate to "https://www.google.com"
    When I search for "Tesla"
    Then verify page source contains "Tesla"
    Then verify the result should contain "Yaklaşık" keyword
    Then the first result in the page sections should contain "Tesla"

    # Created test case in feature folder
    # Create page objects in the page folder
    # Create step definitions in stepdefinitions folder