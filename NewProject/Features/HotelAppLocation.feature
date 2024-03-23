
Feature: Hotel App2 Login
@SmokeTest 
Scenario: Login Successful
Given I am on Hotel App Login Page
When I enter username as "vasuvespag"
And I enter password as "vasu1234"
And I click Login
Then I am Logged in Successfully
@E2ETest
Scenario: Select the location
Given I am on Hotel App Login Page
When I enter username as "vasuvespag"
And I enter password as "vasu1234"
And I click Login
Then I am Logged in Successfully
When I select the location as "Sydney" 
And I click Search 
Then I can go to hotel page