@FunctionalTest
Feature: Tagging for all the scenario 

@SmokeTest  @RegressionTest
Scenario: Login with correct username and password 
	Given This is valid login test 

@RegressionTest	
Scenario: Login with incorrect username and  password 
	Given This is invalid login test
	 
@RegressionTest	
Scenario: Navigate to Home & Furniture tab 
	Given This is home decor page 

@SmokeTest	
Scenario: Navigate to Add item 
	Given This is a add item to cart page 

@RegressionTest	
Scenario: Navigate to Save for Later 
	Given This is a save to later tab 
	
@SmokeTest	@End2End
Scenario: Navigate to search panel 
	Given This is a search tab panel 

@End2End	
Scenario: Logout the user 
	Given This is a logout page