Feature: OrangeHRM Application LogIn Functionalit Testing
Scenario Outline: LogIn Test of OrangeHRM

Given Open FireFox browser and navigate to OrangeHRM application
When User enters valid "<UserName>" and "<Password>" and click on LogIn button
Then User should be able to successfully logIn to the application and close the browser

Examples:
|  UserName   |   Password   |
|  admin      |   password   |
|  hello      |   Password   |