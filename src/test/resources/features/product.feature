Feature: Products and product Operation

  Background: Again Test steps
    Given  Launch browser
    When Navigate to url AutomationExercise
    Then Verify that home page is visible successfully
    And Click on Product button
    Then Verify user is navigated to ALL PRODUCTS page successfully

  Scenario: TC_08 Verify All Products and product detail page
    Given The products list is visible
    Then Click on View Product of first product
    And Verify that user is landed to product detail page
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand

  Scenario: TC_09 Search Product
    Given Enter product name in search input and click search button
    And Verify 'SEARCHED PRODUCTS' is visible
    Then Verify all the products related to search are visible
  @emrah
  Scenario:TC_12 Add Products in Cart
    Given Hover over first product and click 'Add to cart'
    And Click 'Continue Shopping' button
    And Hover over second product and click 'Add to cart'
    And Click 'View Cart' button
    And Verify both products are added to Cart
    And Verify their prices, quantity and total price