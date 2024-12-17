Feature: Login
@Test 
Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome broswer
<<<<<<< HEAD
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
=======
    When User opens URL "URL"
    And I wait for 3000 milli Seconds
    And User enters Username as "Kumar12" and Password as "123456"
    And click on Login
    And Page Title should be as "CRMPRO"
    And close broswer
  
 @Test 
Scenario: Successful Login with InValid Credentials
    Given User Launch Chrome broswer
    When User opens URL "URL"
    And I wait for 3000 milli Seconds
    And User enters Username as "Kumar12" and Password as "1234567"
    And click on Login
    And Page Title should be as "CRMPRO"
    And close broswer
>>>>>>> aeacb7c549ad5639b7317f5d8d098fd0654b23c4
