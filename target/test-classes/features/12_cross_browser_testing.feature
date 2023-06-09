Feature: cross browser
  @headless
  Scenario: TC01 Running of headless
    # For cross browser testing, we should assign the browser type before opening the browser
    # Otherwise selenide will open the browser on chrome
    Given I open the "headless" browser
    And I navigate to "https://www.techproeducation.com"
    And I capture the screenshot of the page

  @firefox
  Scenario: TC01 Running of headless
    Given I open the "firefox" browser
    And I navigate to "https://www.amazon.com"
    And I capture the screenshot of the page

  @safari
  Scenario: TC01 Running of headless
    Given I open the "safari" browser
    And I navigate to "https://www.amazon.com"
    And I capture the screenshot of the page

  @chrome
  Scenario: TC01 Running of headless
    Given I open the "chrome" browser
    And I navigate to "https://www.apple.com"
    And I capture the screenshot of the page