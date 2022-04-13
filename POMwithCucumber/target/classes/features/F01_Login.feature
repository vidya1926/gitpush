Feature: Leaftaps Login fuctionality

#Background:
#Given Launch the Browser
#And Load the application url

@Functional
Scenario Outline: TC001_Login to application - Positive

Given Enter Username as <userName>
And Enter password as <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|userName|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|
