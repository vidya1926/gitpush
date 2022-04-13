Feature: CreateLead functionality in LeafTaps

#Background:
#Given Open the chrome browser
#And Load the application url

@Regression @Smoke
Scenario: CreateLead with manadatory informations
#Given Enter the username as <usename> and enter the password as <password>
Given Enter Username as 'DemoSalesManager'
And Enter password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then My Home Page should be displayed
When Click on Leads link
Then My Leads Page should be displayed
When Click on Create Lead link
When Enter the cname
When Enter the fname
Then Enter the lname
Then Click on Createlead
Then Create Lead Page should be displayed