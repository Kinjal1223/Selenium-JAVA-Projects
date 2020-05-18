Feature: Deal Data Creation

Scenario: Free CRM Login Test Scenario

Given User on Login Page
#When title of login page is Free CRM
Then User enters username and password

#Ctrl+shift+f for formation bottom lines
		| username | password |
		| apatel | Pulsure |
		
Then user clicks on login button
#Then user is on home page
Then user moves to new deal page
Then user enters deal deatils

| title | amount | probability | commition |
	|test deal1 | 1000 | 50 | 10 |
	|test deal2| 4000 | 60 | 5 |
	|test deal3 | 5000 | 70 | 20 |

Then user close the browser
