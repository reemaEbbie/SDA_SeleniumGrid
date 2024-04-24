@SignIn
Feature: Contact list Sign In
  Scenario: Valid Sign in
    Given User visits "https://thinking-tester-contact-list.herokuapp.com/"
    When User enters email as "sdatest@tester.com" and password as "tester.123"
    And User clicks on submit button
    Then verify logout button displayed
    And close driver
