Feature: Contact Us Form operation
  @emrah
  Scenario: TC_06 Contact Us Form Testing
    Given Launch browser
    Then Navigate to url AutomationExercise
    And Verify that home page is visible successfully
    And Click on Contact Us button
    And Verify GET IN TOUCH is visible
    Then Enter name, email, subject and message
    Then Upload file
    And Click Submit button
    And Click OK button
    Then Verify success message Success! Your details have been submitted successfully. is visible
    Then Click Home button and verify that landed to home page successfully