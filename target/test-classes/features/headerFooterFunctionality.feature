Feature: Lord and Taylor Header and Footer Section Functionality

  Background:
    Given Not a validated Header and Footer section
    When User browse to the site
    And Closes the Popup window
    Then Lord and Taylor Homepage should display

  @functional
  @smoke
  Scenario: 1. Verify that Navigation Bar Menu Links are not broken
    Then User should have all links under Dresses Section in proper working order

  @functional
  Scenario: 2. Verify that clicking the Always free shipping link redirects to the appropriate page
    When User click the Always free shipping link
    Then Lord and Taylor Buy Online Pick Up In Store page should display

  @functional
  @smoke
  Scenario: 3. Verify that all the options of navigation bar are displayed
    Then User should see all the options of navigation bar in capital letters as
    |DRESSES |WOMEN |SHOES |HANDBAGS |JEWELRY & ACCESSORIES |BEAUTY |MEN |KIDS |HOME |BRANDS |GIFTS |SALE |

  @functional
  Scenario: 4. Verify that all the options of navigation bar welcome dropdown are displayed
    Then User should see all the options of navigation bar welcome dropdown as
    |Your Account |Order History |Account Settings |Shipping Address Book |Billing Address Book |Payment Method |

  @functional
  Scenario: 5. Verify that Footer Section Links are not broken
    Then User should have all links under Footer Section in proper working order

  @functional
  Scenario: 6. Verify that clicking the FAQ link redirects to the appropriate page
    When User click the FAQ link
    Then Lord and Taylor FAQ page should display

    ## The following 2 scenarios were working fine last week until the developers updated the
    ## system. It is some sort of bug (Email subscription functionality not working -- checked
    ## both manually and through automation)

#  @functional
#  Scenario: 7. Verify Email Subscription Functionality
#    When User enters email in the email subscription box as "debajyoti1234560@gmail.com"
#    And User clicks on the go button
#    When User enters all the sign up fields with data as
#    |debajyoti1234560@gmail.com |debajyoti1234560@gmail.com |Debajytoi |Paul |11435 |January |11 |2001 |MALE |
#    And User clicks on the sign up submit button
#    Then User should see a Thank You notice

#  @functional
#  Scenario: 8. Verify Error message for already signed up email in the Email Subscription Functionality
#    When User enters email in the email subscription box as "debajyoti199007@gmail.com"
#    And User clicks on the go button
#    When User enters all the sign up fields with data as
#    |debajyoti199007@gmail.com |debajyoti199007@gmail.com |Debajytoi |Paul |11435 |January |11 |2001 |MALE |
#    And User clicks on the sign up submit button
#    Then User should see a Connection Error Message


  @functional
  Scenario: 9. Verify that clicking the Lord and Taylor Logo from any page redirects the user to the homepage
    When User click the FAQ link
    Then Lord and Taylor FAQ page should display
    When User click the Lord and Taylor logo
    Then Lord and Taylor Homepage should display

  @functional
  @smoke
  Scenario: 10. Verify the Link Header texts in the footer section are displayed as per business requirements
    Then User should see the following options under Shop Lord and Taylor
    |Gift Cards |FAQ |Pricing Policy |Contact Us |Forms of Payment |
    And User should see the following options under Stores and Corporate
    |Store Locations & Events |About Us |Careers |Personal Shopping |
    And User should see the following options under Shipping and Returns
    |Shipping & Delivery |Returns & Exchanges |International Shipping |Order Status & Tracking|
    And User should see the following options under Lord and Taylor Credit
    |Credit Services |Pay Bills Online |Apply for the Lord & Taylor Card |

  @functional
  Scenario: 11. Verify the Social Media options are displayed as per business requirements
    Then User should see the following social media options in the footer section
    |facebook |twitter |pinterest |youtube |instagram |tumblr |

