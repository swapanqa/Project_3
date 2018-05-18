Feature: Lord and Taylor Register User Page Functionality

  Background:
    Given Not a validated user
    When User browse to the site
    And Closes the Popup window
    Then Lord and Taylor Homepage should display
    When User clicks on the login link
    Then Lord and Taylor Login page should display
    When User clicks on the Create Account link
    Then Lord and Taylor Create New Account page should display

  @functional
  @smoke
  Scenario: 1. New User Registration with all fields having valid data
    When User enter all the fields with valid data
      |Debajyoti |Paul |debajyoti98123456@gmail.com |Shiftqa0119!! |Shiftqa0119!! |11435 |
    And Click on the create account button
    Then Registration welcome message should display

  @functional
  Scenario: 2. Electronic marketing communications Notice for new Canadian User Registration
    When Canadian user enter all the field boxes with valid data
      |Debajyoti |Paul |debajyoti91234561@gmail.com |Selenium0119!! |Selenium0119!! |11435 |
    And Click on canadian user radio button
    Then An electronic marketing communications notice should display
    When Click on the create account button
    Then Registration welcome message should display

  @functional
  Scenario: 3. New User Registration with some fields missing valid data
    When User enter some of the fields with valid data
      |Debajyoti |Paul | |Shiftqa0119!! |Shiftqa0119!! |11435 |
    And Click on the create account button
    Then Registration error message should display

  @functional
  @smoke
  Scenario: 4. New User Registration with different password and confirm password fields
    When User enter different password and confirm password fields
      |Debajyoti |Paul |debajyoti22002@gmail.com |Shiftqa0119!! |Shiftqa0119xx!! |11435 |
    And Click on the create account button
    Then Password error message should display

  @functional
  Scenario: 5. New User Registration with special characters in first or last name fields
    When User enter special characters in first or last name fields
      |Debajyoti |Paul** |debajyoti22003@gmail.com |Shiftqa0119!! |Shiftqa0119!! |11435 |
    And Click on the create account button
    Then Invalid characters error message should display

  @functional
  Scenario: 6. Verify that clicking the Terms and Conditions Link redirects to the correct page
    When User clicks the Terms and Conditions Link
    Then Terms and conditions page should display

  @functional
  Scenario: 7. Verify that clicking the Cancel button redirects the user to the Sign In page
    When User clicks the cancel button
    Then Sign In page should display