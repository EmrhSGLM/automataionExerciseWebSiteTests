Feature: Cart Page Testing

  Scenario: TC_11 Verify Subscription in Cart page

  Given Launch browser
  When Navigate to url AutomationExercise
  And Verify that home page is visible successfully
  Then Click Cart button
  When Scroll down to footer
  And Verify text 'SUBSCRIPTION'
  And Enter email address in input and click arrow button
  And Verify success message 'You have been successfully subscribed!' is visible
