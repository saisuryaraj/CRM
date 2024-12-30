@SCRUM-T1
Feature: Login

Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome broswer
    When User opens URL "URL"
    And I wait for 3000 milli Seconds
    And User enters Username as "Kumar12" and Password as "123456"
    And click on Login
    And Page Title should be as "CRMPRO"
    And close broswer
  

Scenario: Successful Login with InValid Credentials
    Given User Launch Chrome broswer
    When User opens URL "URL"
    And I wait for 3000 milli Seconds
    And User enters Username as "Kumar12" and Password as "1234567"
    And click on Login
    And Page Title should be as "CRMPRO"
    And close broswer
