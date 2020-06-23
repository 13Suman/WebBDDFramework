Feature: Flipkart Home PAge 

Scenario: Flipkart Home Page TestScenario 

	Given Users is already present on Login Page 
	When Title of Login Page is Flipkart Login 
	Then User enters username and password 
		|username| password|
		| test | test@123 | 
	Then User clicks on Login Button 
	Then User is in Home Page 
	Then Close the browser