Feature: Lord and Taylor International Shipping Functionality

  Background:
    Given Not a validated ship to other country functionality
    When User browse to the site
    And Closes the Popup window
    Then Lord and Taylor Homepage should display
    When User click on ship to country link
    Then International Shipping page should display
    When User selects the country as "India"
    And User selects the currency as "Indian Rupee"

  @functional
  Scenario: 1. Verify switching to another country changes the country flag logo
    And User click on the international shipping save and continue button
    And User closes the pop up window
    Then User should see the Indian flag in the top corner of the page

  @functional
  Scenario: 2. Verify click back to US site button takes the user back to usa website
    And User click on the back to US site button
    Then User should see the USA flag in the top corner of the page

  @functional
  @smoke
  Scenario: 3. Verify switching to another country changes shows product price in the currency which is chosen
    And User click on the international shipping save and continue button
    And User closes the pop up window
    When User hover over the men section in navigation bar
    And User click on the Nike Link
    Then Nike products page should display
    And User should see the price of the products in Indian Rupee

  @functional
  @smoke
  Scenario: 4. Verify the notice in the international shipping page
    Then User should see the following notice
    |View the order total (including shipping fees, customs tariffs and taxes) at checkout|
    |Your total is guaranteed at the exchange rate set when your order is placed|
    |No additional payment will be required upon delivery of your order|
    |Please note: Not all products sold on lordandtaylor.com can be shipped internationally and order total cannot exceed U.S. $25,000.|