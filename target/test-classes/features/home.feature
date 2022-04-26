Feature: Home Page Testing

  Scenario: TC_010 Verify Subscription in home page
    Given Launch browser
    When Navigate to url AutomationExercise
    Then Verify that home page is visible successfully
    And Scroll down to footer
    And Verify text 'SUBSCRIPTION'
    And Enter email address in input and click arrow button
    And Verify success message 'You have been successfully subscribed!' is visible

  Scenario: TC_11 Verify Subscription in Cart page
    Given Launch browser
    When Navigate to url AutomationExercise
    And Verify that home page is visible successfully
    Then Click Cart button
    When Scroll down to footer
    And Verify text 'SUBSCRIPTION'
    And Enter email address in input and click arrow button
    And Verify success message 'You have been successfully subscribed!' is visible