Feature: Lord and Taylor Shopping Bag Page and Add To Bag Functionality

  Background:
    Given Not a validated Shopping Cart Page and Add To Cart Functionality
    When User browse to the site
    And Closes the Popup window
    Then Lord and Taylor Homepage should display
    When User hover over the men section in navigation bar
    And User click on the Nike Link
    Then Nike products page should display
    When User click on Nike Hydroguard Mica Top product image
    Then Hydroguard Mica Top Product page should display
    When User click on "Mica Blue" color option
    And Selects Large as the size

  Scenario: 1. Verify that shopping cart pop up shows the same product related details after adding the item
    And Click on Add To Bag Button
    Then User should see the following product related details in the pop up box
    |Nike                |
    |Hydroguard Mica Top |
    |Size: LARGE         |
    |Color: MICA BLUE    |
    |QTY: 1              |
    |$38.00              |

  Scenario: 2. Verify the price displayed in pop up is properly calculated as per the quantity
    And Enters "2" in the quantity box
    And Click on Add To Bag Button
    Then the total price displayed in the pop up would be "$76.00"

  Scenario: 3. Verify that clicking the View My Bag redirects the user to the Shopping Bag Page
    And Click on Add To Bag Button
    When User click on the View My Bag button
    Then Shopping Bag page should display

  Scenario: 4. Verify that clicking the Bag Link in navigation bar pops up the shopping bag popup box
    And Click on Add To Bag Button
    When User click the pop up close button
    And User click on Bag Link in the navigation bar
    Then Shopping Bag pop up should display

  Scenario: 5. Verify that updating quantity functionality of the shopping bag page
    And Click on Add To Bag Button
    When User click on the View My Bag button
    Then Shopping Bag page should display
    When User updates the quantity as "2"
    Then New updated item price of "$76.00" should display

  Scenario: 6. Verify the update item size functionality in the shopping bag page
    And Click on Add To Bag Button
    When User click on the View My Bag button
    Then Shopping Bag page should display
    When User clicks the edit item link
    And Choose size Medium
    And Clicks on Apply modification button
    Then Updated "Medium" size should display in the shipping bag page

  Scenario: 7. Verify the remove item functionality in the shopping bag page
    And Click on Add To Bag Button
    When User click on the View My Bag button
    Then Shopping Bag page should display
    When User clicks the remove item link
    And Clicks on the confirm remove item link
    Then User should see that the item has been removed

  Scenario: 8. Verify the cancel remove item functionality in the shopping bag page
    And Click on Add To Bag Button
    When User click on the View My Bag button
    Then Shopping Bag page should display
    When User clicks the remove item link
    And Clicks on the cancel remove item link
    Then User should see that the item isn't been removed

  Scenario: 9. Verify Shipping Method options
    And Click on Add To Bag Button
    When User click on the View My Bag button
    Then Shopping Bag page should display
    When User enter zipcode as "11435"
    And Click on shipping method dropdown
    Then User should see the following shipping options
    |Standard Delivery - $7.95  |
    |Rush Delivery - $14.95     |
    |Next Business Day - $20.95 |

  Scenario: 10. Verify Shipping Method cost
    And Click on Add To Bag Button
    When User click on the View My Bag button
    Then Shopping Bag page should display
    When User enter zipcode as "11435"
    And Click on shipping method dropdown
    And Selects "Rush" as the shipping method
    Then User should see the grand total as "$54.28"

  Scenario: 11. Verify Shipping Method functionality
    And Click on Add To Bag Button
    When User click on the View My Bag button
    Then Shopping Bag page should display
    When User enter zipcode as "11435"
    And Click on shipping method dropdown
    And Selects "Rush" as the shipping method
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display

  Scenario: 12. Verify Paypal checkout button
    And Click on Add To Bag Button
    When User click on the View My Bag button
    Then Shopping Bag page should display
    When User enter zipcode as "11435"
    And Click on shipping method dropdown
    And Selects "Rush" as the shipping method
    And Click on the paypal checkout button
    Then Paypal checkout page should open

  Scenario: 13. Verify Masterpass checkout sign up error message
    And Click on Add To Bag Button
    When User click on the View My Bag button
    Then Shopping Bag page should display
    When User enter zipcode as "11435"
    And Click on shipping method dropdown
    And Selects "Rush" as the shipping method
    And Click on the masterpass checkout button
    Then Masterpass checkout pop up should open
    When User provides a valid phone number
    And Click on Sign Up button
    And Provide an invalid credit card number
    Then An error message should display

  Scenario: 14. Verify Masterpass checkout cancel button functionality
    And Click on Add To Bag Button
    When User click on the View My Bag button
    Then Shopping Bag page should display
    When User enter zipcode as "11435"
    And Click on shipping method dropdown
    And Selects "Rush" as the shipping method
    And Click on the masterpass checkout button
    Then Masterpass checkout pop up should open
    When User clicks on the cross button
    Then Shopping Bag page should display

  Scenario: 15. Verify Shopping Bag Page with multiple items
    And Click on Add To Bag Button
    When User click the pop up close button
    And User hover over the men section in navigation bar
    And User click on the Nike Link
    Then Nike products page should display
    When User click on Nike Running Tee product image
    Then Nike Running Tee Product page should display
    When Selects Large as the size
    And Selects black as the color
    And Click on Add To Bag Button
    And User click on the View My Bag button
    Then Shopping Bag page should display items as follows
    |Dry Printed Running Tee |Hydroguard Mica Top |
