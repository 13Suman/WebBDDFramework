Feature: Flipkart Add Items

Scenario Outline: Flipkart Add Items Test Scenario
  
Given Users is already present on Login Page 
When Title of Login Page is Flipkart Login 
Then User enters "<username>" and "<password>" 
Then User clicks on Login Button 
Then User is in Home Page
Then user adds "<painting>" 
Then Close the browser

Examples:  
    |username  | password| painting | 
    |test| test@123| paintings| 