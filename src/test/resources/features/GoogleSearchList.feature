Feature: Feature to test google search functionality 

Scenario: Validate google search is working 

	Given Browsers is open 
	And User is in google search page 
	When use enters the text in search box 
		|username|
		|sai     |
		|SSK     |
	#And hit enter 
	Then user is navigates to the search results page 
		|username|password|
		|sai     |23456|
		|SSK     |1234|
