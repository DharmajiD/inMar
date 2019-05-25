@Login
Feature: Login to the NewTours Application using multiple details
In order to Login to Application
As a Customer
I want to enter user name , password and click on Login button

Scenario Outline:Login as Customer
Given Newtours Application Url is available
When entered "<username>" and entered "<password>"
And clicked on Submit button
Then customer should login successfully

Examples:
|username|password|
|test1   |test1   |
|testuser1|testuser1|