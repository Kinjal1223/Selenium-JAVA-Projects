#Feature: Facebook Login Functionality Feature
#Scenario: Login Functionality Test Scenario
#
#Given User on facebook login page	
#Then User Enters email_id and Password
#Then User Click for login 
#Then User clicks on profile button
#Then close the browser
#
#Without Example Keyword
#Feature: Facebook Login Functionality Feature
#Scenario: Login Functionality Test Scenario
#
#Given User on facebook login page	
#Then User Enters "kinju_patel23@yahoo.in" and "Ilove2ashu"
#Then User Click for login 
#Then User clicks on profile button
#Then The display message for user is in profile
#Then close the browser
#
Feature: Facebook Login Functionality Feature
Scenario Outline: Login Functionality Test Scenario

Given User on facebook login page	
Then User Enters "<username>" and "<password>"
Then User Click for login 
Then User clicks on profile button
Then The display message for user is in profile
Then close the browser

Examples:
 
    | username | password |
    | kinju_Patel23@yahoo.in | Ilove2ashu |
    | abc@gmail.com | Ilove2kia |
    | kinju_patel23@yahoo.in | Ilove2ashu |
