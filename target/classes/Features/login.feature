Feature: Flipkart Login Feature

#Scenario: Flipkart Login Test Scenario

#Given Users is already present on Login Page 
#When Title of Login Page is Flipkart Login 
#Then User enters username and password 
#Then User clicks on Login Button 
#Then User is in Home Page

#Defining username and password in feature file without examples keyword
#Scenario: Flipkart Login Test Scenario
#Given Users is already present on Login Page 
#When Title of Login Page is Flipkart Login 
#Then User enters "test" and "test@123" 
#Then User clicks on Login Button 
#Then User is in Home Page

#With examples keyword
Scenario Outline: Flipkart Login Test Scenario
  
Given Users is already present on Login Page 
When Title of Login Page is Flipkart Login 
Then User enters "<username>" and "<password>" 
Then User clicks on Login Button 
Then User is in Home Page
Then Close the browser
  
Examples:  
    |username  | password| 
    |test      | test@123| 