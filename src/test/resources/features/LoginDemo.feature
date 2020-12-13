Feature: Feature to alidate login functionality 

Scenario Outline: Check login functionaly of gmail 

	Given user opens the browser 
	When user is on login page 
	And user enters valid <username> and <password>
	Then user should be on home page 
	
	Examples: 
		|username|password|
		|sai     |23456|
		|SSK     |1234|
		
	
