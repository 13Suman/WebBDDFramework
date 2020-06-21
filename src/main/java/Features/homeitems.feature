Feature: Flipkart Home Decor Items

Scenario: Flipkart Add Home Decor Items Test Scenario
  
Given Users is already present on Login Page 
When Title of Login Page is Flipkart Login 
Then User enters username and password
| test | test@123 | 
Then User clicks on Login Button 
Then User is in Home Page
Then User navigates to Home & Furniture Page
Then Close the browser
