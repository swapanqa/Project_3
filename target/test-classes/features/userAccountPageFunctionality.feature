Feature: Lord and Taylor User Account Page Functionality

  Background:
    Given Not a validated user
    When User browse to the site
    And Closes the Popup window
    Then Lord and Taylor Homepage should display
    When User clicks on the login link
    Then Lord and Taylor Login page should display
    When User login with valid credentials
    Then Lord and Taylor User account page should display

  @functional
  Scenario: 1. Verify that clicking the Credit Card Apply Now link redirects to the correct page
    When User clicks the Credit Card Apply Now link
    Then Credit Card Apply Now page should display

  @functional
  Scenario: 2. Verify the Add Shipping Address functionality of the your account page
    When User clicks the shipping address navigation bar link
    And User clicks the add shipping address link
    And User enters all field with valid data
     |United States|Debajyoti |Paul |123-45 82nd Street |Jamaica |New York |11435 |8183081234 |
    And User selects default billing address checkbox
    And User clicks the submit button
    Then Entire added shipping address should display in Shipping Address Page
    And Entire added shipping address should display in Billing Address Page

  @functional
  Scenario: 3. Verify that adding wrong card number in payments section shows proper error message
    When User clicks the payments navigation bar link
    And User clicks the add a new payment link
    And User enters all the field with valid data
    |Debajyoti Paul |4833160123478641 |03 - March |2020 |
    And User clicks the payment submit button
    Then Add payment error message should display

  @functional
  Scenario: 4. Verify that clicking the back to top button takes the user to the top of the page
    When User scrolls to the bottom half of the page
    And User clicks the back to top button
    Then User should go back to the top of the page

  @functional
  @smoke
  Scenario: 5. Verify that the States dropdown box in Add Shipping Address field is in alphabetical order
    When User clicks the shipping address navigation bar link
    And User clicks the add shipping address link
    Then User should see the states dropdown menu options in alphabetical order

  @functional
  Scenario: 6. Verify the navigational options for user account page are displayed as per BRD
    And User should the following options in the navigation bar
    |Account Summary |Order History |Shipping Address |Billing Address |Payment |Settings |

  @functional
  @smoke
  Scenario: 7. Verify the Order History Message for new account holders who hasn't placed an order yet
    And User clicks the Order History link
    Then The following order history message should display
    |You haven't placed an order with us! |
    |Check back after you've ordered to check its status. |

  @functional
  Scenario: 8. Verify the missing field error message in the Add Shipping Address functionality of the your account page
    When User clicks the shipping address navigation bar link
    And User clicks the add shipping address link
    And User enters all field with valid data
      |United States|Debajyoti |Paul |123-45 90th Street |Jamaica |New York |11435 | |
    And User selects default billing address checkbox
    And User clicks the submit button
    Then A shipping address missing field error message should display

  @functional
  Scenario: 9. Verify the Edit functionality of the Add Shipping Address feature
    When User clicks the shipping address navigation bar link
    And User clicks the add shipping address link
    And User enters all field with valid data
      |United States|John |Doe |20-12 75th Street |Kew Gardens |New York |11415 |8183081234 |
    And User selects default billing address checkbox
    And User clicks the submit button
    Then User should see name as John Doe
    When User click on the Edit Link
    And Edit the first name as "Jonathan"
    And User clicks the submit button
    Then User should see updated name as "Jonathan Doe"

