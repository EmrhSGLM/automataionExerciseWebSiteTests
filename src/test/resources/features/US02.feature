Feature: US02 Kayıt ve Dogrulama Islemleri Testi

  Background:Tekrar methodları

    Given Launch browser
    Then Navigate to url automation
    And Verify that home page is visible successfully

  Scenario: TC05 Register user with existing email

    When Click on Signup Login button
    And Verify New User Signup! is visible
    And Enter name and already registered email address
    And Click Signup button
    And Verify error Email Address already exist! is visible


  Scenario: TC06 Contact Us Form

      When Click on Contact Us button
      And Verify GET IN TOUCH is visible
      And Enter name, email, subject and message
      And Upload file
      And  Click Submit button
      And Click OK button
      And Verify success message Success! Your details have been submitted successfully. is visible
      And Click Home button and verify that landed to home page successfully


  Scenario: TC07 Verify Test Cases Page

    When Click on Test Cases button
    And Verify user is navigated to test cases page successfully


  Scenario: TC08 Verify All Products and product detail page

    When Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    And Click on View Product of first product
    And User is landed to product detail page
    And Verify that detail detail is visible: product name, category, price, availability, condition, brand


