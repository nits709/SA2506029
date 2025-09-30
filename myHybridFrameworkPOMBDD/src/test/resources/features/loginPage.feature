Feature: file holds login page scenario

Scenario: test login functionality with valid credentials
Given The user launch application "https://automationexercise.com/login"
When The user enter valid credentials "nitingupta3005@gmail.com" and "Smart@123"
Then The user validate the login page with title "Automation Excercise"