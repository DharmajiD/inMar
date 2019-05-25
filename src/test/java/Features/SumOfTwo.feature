@SumOfTwoNumbers
Feature: Addition of two numbers 

In order to display Sum of two numbers
As a user
I want to pass two numbers as parameters

Scenario Outline:Sum of Two numbers
Given two numbers
When entered "<number1>" and entered "<number2>"
And performed addition
Then user should see sum of two numbers

Examples:
|number1|number2|
|109|120|
|23|19|