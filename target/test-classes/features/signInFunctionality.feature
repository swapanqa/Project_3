Feature: Lord and Taylor Sign In Page Functionality

  Background:
    Given Not a validated user
    When User browse to the site
    And Closes the Popup window
    Then Lord and Taylor Homepage should display
    When User clicks on the login link
    Then Lord and Taylor Login page should display

  @functional
  @smoke
  Scenario Outline: 1. Login with valid username and valid password
    When User enter user email as "<EmailAddress>"
    And User enter user password as "<Password>"
    And User clicks on login button
    Then Lord and Taylor User account page should display
    And Login welcome message should display
    Examples:
      |EmailAddress                      |Password       |
      |debajyoti90000@gmail.com          |Selenium0119!! |
      |debajyoti199000@gmail.com         |Shiftqa0119!!  |

  @functional
  Scenario Outline: 2. Login with invalid username or invalid password
    When User enter user email as "<email>"
    And User enter user password as "<password>"
    And User clicks on login
    Then Login error message should display
    Examples:
      |email                             |password       |
      |xyz123@gmail.com                  |Selenium0119!! |
      |debajyoti90000@gmail.com          |Xyz123!!       |

  @functional
  @smoke
  Scenario: 3. Valid username with missing password
    When User login with email and password
      |Key      |Value           |
      |PASSWORD |Selenium0119!!  |
    Then Missing error message should display

  @functional
  Scenario: 4. Missing username with valid password
    When User login with email and password
      |Key      |Value                      |
      |EMAIL    |debajyoti199000@gmail.com  |
    Then Missing error message should display

  @functional
  Scenario: 5. Forget Password Functionality
    When User click the Forget Password Link
    Then Forget Password page should display
    When When User enter user email as "debajyoti199000@gmail.com"
    And Click the continue button
    Then Verification message should display

  @functional
  Scenario: 6. Check Order Status Functionality
    When User enters an invalid order number
    And User enters a valid zip code
    And Click the submit button
    Then Error message should display

