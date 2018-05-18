Feature: Lord and Taylor Search Box Functionality

  Background:
    Given Not a validated search box
    When User browse to the site
    And Closes the Popup window
    Then Lord and Taylor Homepage should display

  @functional
  @smoke
  Scenario: 1. Verify Search Functionality
    When User enters as "Men's Nike Air" in the search box
    And User clicks on search button
    Then User should see Search page header containing the same text that is entered in search box
    And User should see the following six items
    |Men's Nike Air Max Vision Shoe |Men's Nike Air Presto Essential Shoe | Air Zoom Pegasus 34 Running Sneakers |Air Max '90 Faux Leather Sneakers |Air Max 1 Running Shoes |
    #Extra product - Air Max I Ultra 2.0 Essential Sneakers |

  @functional
  Scenario: 2. Verify invalid search query
    When User enters as "xxxx" in the search box
    And User clicks on search button
    Then User should see a No Results Found message

  @functional
  Scenario: 3. Verify Dropdown box options within Search Box
    When User enters as "Men's Nike Air" in the search box
    And User clicks on dropdown box button
    Then User should see the following dropdown options within the search box
    |All Categories |Women |Shoes |Handbags |Jewelry & Accessories |Beauty |Men |Kids |Home |Gifts |Sale |

  @functional
  Scenario: 4. Verify Advanced Search box functionality
    When User enters "Nike Air" in the search box
    And User clicks on dropdown box button
    And User select "Kids" from Dropdown option
    And User clicks on search button
    Then User should see Search page header containing the same text that is entered
    And User should see the following eight items
    |Girls' Pre-School Nike Air Max 90 Shoe |Boy's Colorblock Air Hoodie |Boy's Air Max 9 Athletic Sneakers |Boy's Air Max Sequent 3 Running Shoe |Girls' Air Max Tiny 90 |Boys' Air Max Tiny 90 |Boys Air Jogger Pants |Girl's Air Max 90 Low Top Sneakers |Boys Air Max 90 Leather Sneakers |

  @functional
  Scenario: 5. Verify Advanced Search box functionality with Featured Shop Filter
    When User enters "Nike Air" in the search box
    And User clicks on dropdown box button
    And User select "Kids" from Dropdown option
    And User clicks on search button
    Then User should see Search page header containing the same text that is entered
    When User click Featured shops link
    Then User should see the following six search results
    |Girls' Pre-School Nike Air Max 90 Shoe |Boy's Colorblock Air Hoodie |Boy's Air Max 9 Athletic Sneakers |Boy's Air Max Sequent 3 Running Shoe |Boys' Air Max Tiny 90 |Boys Air Jogger Pants |Girl's Air Max 90 Low Top Sneakers |Boys Air Max 90 Leather Sneakers |

  @functional
  Scenario: 6. Verify Advanced Search box functionality with Color Filter
    When User enters "Nike Air" in the search box
    And User clicks on dropdown box button
    And User select "Kids" from Dropdown option
    And User clicks on search button
    Then User should see Search page header containing the same text that is entered
    When User click on color tab
    And User selects blue color
    And User clicks on apply button
    Then User should see the following three results as
    |Boy's Colorblock Air Hoodie |Boy's Air Max Sequent 3 Running Shoe |Girls' Air Max Tiny 90 |Boys' Air Max Tiny 90 |Boys Air Max 90 Leather Sneakers |

  @functional
  Scenario: 7. Verify Advanced Search Cancel filter button
    When User enters "Nike Air" in the search box
    And User clicks on dropdown box button
    And User select "Kids" from Dropdown option
    And User clicks on search button
    Then User should see Search page header containing the same text that is entered
    When User click on color tab
    And User selects blue color
    And User clicks on apply button
    Then User should see four products
    When User clicks the cancel filter button
    Then User should see the following six search results
    |Girls' Pre-School Nike Air Max 90 Shoe |Boy's Colorblock Air Hoodie |Boy's Air Max 9 Athletic Sneakers |Boy's Air Max Sequent 3 Running Shoe |Girls' Air Max Tiny 90 |Boys' Air Max Tiny 90 |Boys Air Jogger Pants |Girl's Air Max 90 Low Top Sneakers |Boys Air Max 90 Leather Sneakers |

  @functional
  @smoke
  Scenario: 8. Verify Search box functionality with search keyword containing spaces in between
    When User enters "N i k e A i r" with spaces in between characters in the search box
    And User clicks on dropdown box button
    And User select "Kids" from Dropdown option
    And User clicks on search button
    Then User should see a No Results Found message

  @functional
  Scenario: 9. Verify Advanced Search box functionality with spaces before and after the keyword
    When User enters "   Nike Air  " having spaces before and after the keyword in the search box
    And User clicks on dropdown box button
    And User select "Kids" from Dropdown option
    And User clicks on search button
    Then User should see Search page header containing the same text that is entered
    And User should see the following eight items
    |Girls' Pre-School Nike Air Max 90 Shoe |Boy's Colorblock Air Hoodie |Boy's Air Max 9 Athletic Sneakers |Boy's Air Max Sequent 3 Running Shoe |Girls' Air Max Tiny 90 |Boys' Air Max Tiny 90 |Boys Air Jogger Pants |Girl's Air Max 90 Low Top Sneakers |Boys Air Max 90 Leather Sneakers |

  @functional
  Scenario: 10. Verify search functionality by pressing Enter instead of clicking search button
    When User enters as "Men's Nike Air" in the search box
    And User presses the Enter button
    Then User should see Search page header containing the same text that is entered in search box
    And User should see the following six items
    |Men's Nike Air Max Vision Shoe |Men's Nike Air Presto Essential Shoe | Air Zoom Pegasus 34 Running Sneakers |Air Max '90 Faux Leather Sneakers |Air Max 1 Running Shoes |


