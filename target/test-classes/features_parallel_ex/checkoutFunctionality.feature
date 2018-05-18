Feature: Lord and Taylor Checkout Functionality

  Background:
    Given Not a validated checkout Functionality
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
    And Click on Add To Bag Button
    When User click on the View My Bag button

  Scenario: 1. Verify item added is displayed the same in the Shipping & Billing page
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    And User should see the same product name that was added to the cart

  Scenario: 2. Verify Shipping address missing field error message
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    When User enter Shipping details as
    |Debajyoti |Paul |123-45 85th Avenue | |New York |11435 |debajyotiSelenium@gmail.com |8183471234 |
    And Click the Continue Checkout button
    Then An enter missing field error message should display

  Scenario: 3. Verify Make Billing Address checkbox is selected by default in the Shipping & Billing page
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    And User should see the make billing address checkbox is checked by default

  Scenario: 4. Verify the Payment type options in the Shipping & Billing page
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    When User enter Shipping details as
    |Debajyoti |Paul |123-45 85th Avenue |Jamaica |New York |11435 |debajyotiSelenium@gmail.com |8183471234 |
    And Click the Continue Checkout button
    And Click on the use address as entered button
    And Click on the payment dropdown in the payments section
    Then User should see the following payment options
    |Lord &amp; Taylor |Discover |MasterCard |Visa |American Express |PayPal |Masterpass |Japan Credit Bureau |Diners Club |

  Scenario: 5. Verify the Payment functionality in the Shipping & Billing page
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    When User enter Shipping details as
    |Debajyoti |Paul |123-45 85th Avenue |Jamaica |New York |11435 |debajyotiSelenium@gmail.com |8183471234 |
    And Click the Continue Checkout button
    And Click on the use address as entered button
    And Click on the payment dropdown in the payments section
    And User selects "Visa" as the payment type
    And Provides the following card information
    |4114320116769723 |John Doe |06 |2020 |456 |
    And Click the continue Checkout
    Then User should see the following payment info in the review and submit page
    |Visa ending in 9723 John Doe |

  Scenario: 6. Verify the Error Message for an invalid credit card
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    When User enter Shipping details as
    |Debajyoti |Paul |123-45 85th Avenue |Jamaica |New York |11435 |debajyotiSelenium@gmail.com |8183471234 |
    And Click the Continue Checkout button
    And Click on the use address as entered button
    And Click on the payment dropdown in the payments section
    And User selects "Visa" as the payment type
    And Provides the following card information
    |6114320116769723 |John Doe |06 |2020 |456 |
    And Click the continue Checkout
    Then User should see Invalid card error message

  Scenario: 7. Verify the Error Message for an invalid gift card
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    When User enter Shipping details as
    |Debajyoti |Paul |123-45 85th Avenue |Jamaica |New York |11435 |debajyotiSelenium@gmail.com |8183471234 |
    And Click the Continue Checkout button
    And Click on the use address as entered button
    And Click on the payment dropdown in the payments section
    And User selects "Visa" as the payment type
    And Provides the following card information
    |4114320116769723 |John Doe |06 |2020 |456 |
    And Enters the following gift card information
    |67863637 |456 |
    And Clicks on the gift card apply link
    Then User should see Invalid gift card error message

  Scenario: 8. Verify the Edit Item size functionality in the Shipping & Billing Page
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    When User enter Shipping details as
    |Debajyoti |Paul |123-45 85th Avenue |Jamaica |New York |11435 |debajyotiSelenium@gmail.com |8183471234 |
    And Click the Continue Checkout button
    And Click on the use address as entered button
    Then Payment tab should display
    When User click on the edit item link in the payment section
    And Select the item size as medium
    And Click on apply edit button
    Then User should see the updated size on the payment page

  Scenario: 9. Verify the Edit Item quantity functionality in the Shipping & Billing Page
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    When User enter Shipping details as
    |Debajyoti |Paul |123-45 85th Avenue |Jamaica |New York |11435 |debajyotiSelenium@gmail.com |8183471234 |
    And Click the Continue Checkout button
    And Click on the use address as entered button
    Then Payment tab should display
    When User click on the edit item link in the payment section
    And Select quantity to be "3"
    And Click on apply edit button
    Then User should see the updated subtotal to be "$114.00"

  Scenario: 10. Verify the Edit Item quantity functionality in the Shipping & Billing Page
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    When User enter Shipping details as
    |Debajyoti |Paul |123-45 85th Avenue |Jamaica |New York |11435 |debajyotiSelenium@gmail.com |8183471234 |
    And Click the Continue Checkout button
    And Click on the use address as entered button
    Then Payment tab should display
    When User click on the remove item link
    And Clicks on the confirm remove item button
    Then User should see an empty item bag message

  Scenario: 11. Verify the Shipping Address is same as Billing Address in the Review Page
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    When User enter Shipping details as
    |Debajyoti |Paul |123-45 85th Avenue |Jamaica |New York |11435 |debajyotiSelenium@gmail.com |8183471234 |
    And Click the Continue Checkout button
    And Click on the use address as entered button
    And Click on the payment dropdown in the payments section
    And User selects "Visa" as the payment type
    And Provides the following card information
    |4114320116769723 |John Doe |06 |2020 |456 |
    And Click on the continue to review button
    Then Review and Submit tab should display
    And User should see the shipping address same as the billing address like
    |123-45 85th Avenue |Jamaica, |NY |11435 |

  Scenario: 12. Verify that delivery option is chosen as Standard by default
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    When User enter Shipping details as
    |Debajyoti |Paul |123-45 85th Avenue |Jamaica |New York |11435 |debajyotiSelenium@gmail.com |8183471234 |
    And Click the Continue Checkout button
    And Click on the use address as entered button
    And Click on the payment dropdown in the payments section
    And User selects "Visa" as the payment type
    And Provides the following card information
    |4114320116769723 |John Doe |06 |2020 |456 |
    And Click on the continue to review button
    Then Review and Submit tab should display
    And User should see the delivery option is chosen as Standard by default

  Scenario: 13. Verify Promo Code Error Message
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    When User enter Shipping details as
    |Debajyoti |Paul |123-45 85th Avenue |Jamaica |New York |11435 |debajyotiSelenium@gmail.com |8183471234 |
    And Click the Continue Checkout button
    And Click on the use address as entered button
    And Click on the payment dropdown in the payments section
    And User selects "Visa" as the payment type
    And Provides the following card information
    |4114320116769723 |John Doe |06 |2020 |456 |
    And Click on the continue to review button
    Then Review and Submit tab should display
    When User click on the promo code edit link
    And Enters the promo code
    And Clicks Apply Promo Code
    Then An invalid promo code error message should display

  Scenario: 14. Verify that standard delivery is free for orders totalling over 99 dollars
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    When User enter Shipping details as
    |Debajyoti |Paul |123-45 85th Avenue |Jamaica |New York |11435 |debajyotiSelenium@gmail.com |8183471234 |
    And Click the Continue Checkout button
    And Click on the use address as entered button
    Then Payment tab should display
    When User click on the edit item link in the payment section
    And Select quantity to be "3"
    And Click on apply edit button
    Then Order total should update to "$114.00"
    And Delivery should get FREE

  Scenario: 15. Verify error message when placing order with invalid credit card information
    And Click on the checkout button
    And click on the checkout as guest button
    Then Shipping and billing page should display
    When User enter Shipping details as
    |Debajyoti |Paul |123-45 85th Avenue |Jamaica |New York |11435 |debajyotiSelenium@gmail.com |8183471234 |
    And Click the Continue Checkout button
    And Click on the use address as entered button
    And Click on the payment dropdown in the payments section
    And User selects "Visa" as the payment type
    And Provides the following card information
    |4114320116769723 |John Doe |06 |2020 |456 |
    And Click on the continue to review button
    Then Review and Submit tab should display
    When User click on the Place Order button
    Then An invalid payment error message should display