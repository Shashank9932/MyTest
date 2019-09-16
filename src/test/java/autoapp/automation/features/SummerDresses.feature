Feature: Summer Dress add to cart


  Scenario: check Megamenus and sorting works
    Given Automation practice application is opened
    And I hover on Dresses
    And I will see Summer Dresses
    And I will click on Summer Dresses
    And I will see sortby option
    And I select sortby price
    And I see dresses sorted
    
    
    Scenario: Select a dress and change the color (Blue) and then add the item to cart
    Given Automation practice application is opened
    And I hover on Dresses
    And I will see Summer Dresses
    And I will select first summer Dress in list
    And I will see printed Summer Dress loaded
    And I select colour blue
    And I click on add to cart
    And I compare the product details