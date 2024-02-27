
Feature: Login Functionality

Scenario : Check the login functionality with valid credentials
Given user is on login page
When user enter the <username> and <password>
And user click on login button
Then user navigated to the home page


Scenario Outline: Check the login functionality with valid credentials
Given user is on login page
When user enter the <username> and <password>
And user click on login button
Then user navigated to the home page
Examples:
|username|password|
|vinayit|vin71625|
|vinay|vin71625|
|vani|vani123|



Scenario Outline: Check the login functionality with valid credentials
Given user is on login page
When user enter the <username> and <password>
And user click on login button
Then user navigated to the home page
Examples:
|username|password|
|vinayit49|vin71625|
|vinay234|vin71625|
|vani879|vani123|




