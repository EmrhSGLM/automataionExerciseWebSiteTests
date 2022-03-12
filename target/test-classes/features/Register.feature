Feature: Register operations

  @emrah
  Scenario: Register User
    Given  Launch browser
    When Navigate to url AutomationExercise
    Then Verify that home page is visible successfully
    And Click on Signup-Login button
    And Verify New User Signup! is visible
    Then Enter name and email address
    And Click Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    Then Click (Create Account button)
    And Verify that "ACCOUNT CREATED!" is visible
    Then Click 'Continue' button
    And Verify that Logged in as username is visible
    Then Click Delete Account button