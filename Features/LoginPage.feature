Feature: Login Page
Scenario: Verify Login Page with valid credentials
Given User should open Chrome browser
When User enter Username as "student" and Password as "Password123"
And Click on Submit button
Then Verify Title should be "Logged In Successfully | Practice Test Automation"
And Close the browser