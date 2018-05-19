Feature: Lord and Taylor Products Page Functionality

  Background:
    Given Not a validated Products Page
    When User browse to the site
    And Closes the Popup window
    Then Lord and Taylor Homepage should display
    When User hover over the men section in navigation bar
    And User click on the Nike Link
    Then Nike products page should display

  @functional
  Scenario: 1. Verify the number of items displayed on page number one
    And User should see the exact number of products shown at the top of the page

  @functional
  @smoke
  Scenario: 2. Verify the filter navigation bar options
    And User should see the following filter options
    |Price |Type |Style |Size |Color |

  @functional
  Scenario: 3. Verify the Search by Filtering Functionality
    When User click on the price link
    And User selects the third option
    And click on the submit button
    Then User should see the following items
    |Two-Piece Jacket and Vest Set|

  @functional
  Scenario: 4. Verify the Search by Filtering Error Message
    When User click on the price link
    And click on the submit button
    Then User should see a search filter error message

  @functional
  Scenario: 5. Verify the Shop by Category column options
    And User should see the following category options
    |Shop All  |Clothing |Accessories |Big &amp; Tall |Shoes |

  @functional
  @smoke
  Scenario: 6. Verify the Shop by brands functionality
    When User click on the Shop by brand dropdown
    And Selects "Aramis" from the dropdown
    Then "ARAMIS" product page should display

  @functional
  Scenario: 7. Verify the product name in preview section of the products page
    When User choose a particular product
    And User clicks on the preview button of a product
    Then User should see the same product name

  @functional
  Scenario: 8. Verify the price in preview section of the products page
    When User choose a particular product and note the price of it
    And User clicks on the preview button of a product
    Then User should see the same price of the product

  @functional
  Scenario: 9. Verify that clicking cancel button of the popUp closes the pop up
    When User clicks on the preview button of a product
    And User clicks on the pop up cancel button
    Then Nike products page should display

  @functional
  Scenario: 10. Verify clicking the product image redirects the user to the correct product's page
    When User click on Nike Hydroguard Mica Top product image
    Then Hydroguard Mica Top Product page should display

  @functional
  Scenario: 11. Verify color options in product's page shows same color name
    When User click on Nike Hydroguard Mica Top product image
    Then Hydroguard Mica Top Product page should display
    And No text for colors should display
    When User click on "Mica Blue" color option
    Then "Mica Blue" should display as the text of the color

  @functional
  Scenario: 12.  Verify sold out button in unclickable for unavailable products
    When User click on Nike Hydroguard Mica Top product image
    Then Hydroguard Mica Top Product page should display
    When User click on "Mica Blue" color option
    And Selects X-large as the size
    Then User should see a sold out button that is unclickable

  @functional
  Scenario: 13. Verify add to bag functionality without choosing size and/or color
    When User click on Nike Hydroguard Mica Top product image
    Then Hydroguard Mica Top Product page should display
    When User click on the add to bag button
    Then User should see a add size and color error message

  @functional
  @smoke
  Scenario: 14. Verify that quantity box has a default value of 1
    When User click on Nike Hydroguard Mica Top product image
    Then Hydroguard Mica Top Product page should display
    When User should see the default quantity has value one

  @functional
  Scenario: 15. Verify quantity increment and decrement buttons
    When User click on Nike Hydroguard Mica Top product image
    Then Hydroguard Mica Top Product page should display
    When User clicks twice on the quantity increment button
    Then User should see the quantity has value three
    When User click on the quantity decrement button once
    Then User should see the quantity has value two

  @functional
  Scenario: 16. Verify same price of product displayed in the individual product's page
    When User click on Nike Hydroguard Mica Top product image
    Then Hydroguard Mica Top Product page should display
    Then User should see the same price in both of the product pages

  @functional
  Scenario: 17. Verify Product Size Guide Page Link
    When User click on Nike Hydroguard Mica Top product image
    Then Hydroguard Mica Top Product page should display
    When User click on the product size guide link
    Then Product size guide page should display

  @functional
  Scenario: 18. Verify product description
    When User click on Nike Hydroguard Mica Top product image
    Then Hydroguard Mica Top Product page should display
    And User should see the following product description
    |Classic sporty top with printed logo at chest |
    |Crewneck                                      |
    |Short raglan sleeves                          |
    |Polyester/cotton/nylon                        |
    |Machine wash                                  |
    |Imported                                      |

  @functional
  Scenario: 19.  Verify item unavailable message for store pick up
    When User click on Nike Hydroguard Mica Top product image
    Then Hydroguard Mica Top Product page should display
    When User click on "Mica Blue" color option
    And Selects Large as the size
    And Choose store pick up option
    And Enters a valid zipcode as "11435"
    And Clicks on Check Stores button
    Then User should see an item unavailable message for store pick up

  @functional
  Scenario: 20.  Verify invalid zipcode error message for store pick up
    When User click on Nike Hydroguard Mica Top product image
    Then Hydroguard Mica Top Product page should display
    When User click on "Mica Blue" color option
    And Selects Large as the size
    And Choose store pick up option
    And Enters an invalid zipcode as ""
    And Clicks on Check Stores button
    Then User should see an invalid zipcode error message