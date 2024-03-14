Feature: Login to the website 

Scenario: Verification of Login Step
  Given I open the browser
  And Open the web app
  When I enter the credentials
  Then I am able to login
  And check the home page