Feature: Login
@Test 
Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome broswer
    When User opens URL "https://tutorialsninja.com/demo/"
    Then User opens Loginpage
    And User enters Email as "pavanoltraining@gmail.com" and Password as "test@123"
    And Click on Login
    Then Page Title should be as "My Account"
    When User click on Log out link
    Then Page title should be "Account Logout"
    And close broswer
   
@Test2   
Scenario Outline: Login Data Driven
	Given User Launch Chrome broswer
    When User opens URL "https://tutorialsninja.com/demo/"
    Then User opens Loginpage
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login
    Then Page Title should be as "My Account"
    When User click on Log out link
    Then Page title should be "Account Logout"
    And close broswer
	
	Examples:
				| email | password |
				|pavanoltraining@gmail.com |test@123|
				|laks@yahoo.com |xyz|
