Feature: Free CRM Login Feature

//To comment ctrl+/ OR Ctrl+K,C

#Without Example Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given User on Login Page
#When title of login page is Free CRM
#Then Enter username and password
#Then user clicks on login button
#Then user is on home page



Scenario Outline: Free CRM Login Test Scenario

Given User on Login Page
#When title of login page is Free CRM
Then User will enter Enter "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters "<firstname>" and "<lastname>" and "<department>"
Then user clicks on save

Examples:

   | username | password | firstname | lastname | department |
   |apatel  | Pulsure | kinjal | patel | HR |
   |apatel  | Pulsure | Ashish | patel | Manager |
    

