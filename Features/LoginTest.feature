Feature: Validate login functionalties 

@login
Scenario: Valid able loging the application. 

	Given User is able to open any browser 
	And User is able to enter the URL 
	When User is able to click on sign in BTN 
	And User is able to enter the user name 
	And User is able to enter the password 
	And User is able to click on log in BTN 
	Then User is able to verify the user info on the screen 
	
	
@logins
Scenario: Valid able loging the applications. 
	Given User able to open chrome browser 
	When User is able to click on sign in BTN and login the application
	Then User is able to verify the user info

	
