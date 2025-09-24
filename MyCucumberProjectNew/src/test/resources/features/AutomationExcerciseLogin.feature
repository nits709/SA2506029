Feature: This feature file hold automation excercise functionality

#valid
#Scenario: To validate login functionality with valid credentails
#Given The user launch application URL "https://automationexercise.com/login"
#When The user enters username "nitingupta3005@gmail.com" and password "Smart@123"
#When The user submit the login credentails
#Then The User validates login successfully
#
#invalid
#Scenario: To validate login functionality with Invalid credentails
#Given The user launch application URL "https://automationexercise.com/login"
#When The user enters username "nitingupta300.com" and password "Smart@123"
#When The user submit the login credentails
#Then The User validates login successfully


# run same test for multiple times with different sets of data
Scenario Outline: To validate login functionality with mutliple testData credentails
Given The user launch application URL "<URL>"
When The user enters username "<username>" and password "<password>"
When The user submit the login credentails
Then The User validates login successfully

Examples:
|URL|username|password|
|https://automationexercise.com/login|nitingupta3005@gmail.com|Smart@123|
|https://automationexercise.com/login|nitingupta@gmail.com|Smart@123|
#|https://automationexercise.com/login|nitingupta3005@gmail.com|Smart@123|
#|https://automationexercise.com/login|nitingupta3005@gmail.com|Smart@123|
#|https://automationexercise.com/login|nitingupta3005@gmail.com|Smart@123|
#|https://automationexercise.com/login|nitingupta3005@gmail.com|Smart@123|
#|https://automationexercise.com/login|nitingupta3005@gmail.com|Smart@123|
#|https://automationexercise.com/login|nitingupta3005@gmail.com|Smart@123|
