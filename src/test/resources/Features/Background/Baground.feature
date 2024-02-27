Feature: Check the Home page functionality

Background:user is logged in
Given user is on login page
When user enter the username and password
And user click on login button
Then user navigated to the home page

Scenario:Check logout link
When User clicks on welcome link
Then logout link is displayed

Scenario: Check quick lunch toolbar is present

When User clicks on dashboard link
Then quick lunch toolbar  is displayed