Feature: Products and product Operation

  Background: Again Test steps
    Given  Launch browser
    When Navigate to url AutomationExercise
    Then Verify that home page is visible successfully
    And Click on Product button
  @emrah
  Scenario: TC_08 Verify All Products and product detail page
    Given Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    Then Click on View Product of first product
    And Verify that user is landed to product detail page
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand
