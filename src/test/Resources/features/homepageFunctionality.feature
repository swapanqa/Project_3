Feature: Lord and Taylor Homepage Functionality

  Background:
    Given Not a validated homepage
    When User browse to the site
    And Closes the Popup window
    Then Lord and Taylor Homepage should display

  @functional
  @smoke
  Scenario: 1. Verify all the Homepage Image Links aren't broken
    Then User should get all the image links in proper working order

  @functional
  @smoke
  Scenario: 2. Verify that clicking the Father's day gift guide link navigates to the appropriate page
    When User clicks the Father's day gift guide link
    Then Father's Day Gift Guide page should display

  @functional
  Scenario: 3. Verify the size of the first advertisement banner
    Then User should see the first advertisement banner as per the size mentioned in the business document

  @functional
  @smoke
  Scenario: 4. Verify the exact discount percentage for the third advertisement banner
    Then User should see the exact discount of the third advertisement banner
