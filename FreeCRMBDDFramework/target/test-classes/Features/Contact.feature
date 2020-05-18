Feature: Create new contact
Scenario Outline: Create new contacts scenario

Given user on login page
Then user enters "<username>" and "<password>"
Then user clicks on Login button
Then user mouse hover on Contacts
Then Enters on contact page "<Firstname>" and "<LastName>"
Then Save button
Then Close the browser 

Examples:
| username	 | password | Firstname | LastName |
| apatel | Pulsure | Tracy | NON |
| apatel | Pulsure | Jamie | NON |
| kpatel | Pulsure | Kin | Patel |
