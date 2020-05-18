Feature: Deal Data Creation

Scenario: Free CRM Login Test Scenario
#DataTable
Given User on Login Page
#When title of login page is Free CRM
Then User enters username and password
| apatel | Pulsure |
Then user clicks on login button
#Then user is on home page
Then user moves to new deal page
Then user enters deal deatils
|test deal | 1000 | 50 | 10 |
Then user clicks on save
Then user close the browser
