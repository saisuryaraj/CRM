Feature: Customers
  @Test1
  Scenario: Add new customer
    Given User Launch Chrome broswer
    When User opens URL "https://tutorialsninja.com/demo/"
    Then User opens Resgistration Page
    And User enters First Name as "<First Name>" and Last Name as "<Last Name>" and Email as "<email>" and Telephone as "<1234567890>"
    And User enters password as "<Password>" and Confirm Password as "<confirm Password>"
    Then agree the privacy policy
    And Click on continue
    Then close broswer

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
      #| First Name  | Last Name | email 						|Telephone |Password |confirm Password|
      #| Rama 				|    krishna| abc.123@gmail.com |1234567890|test@1234|test@1234				|
      #| sita 				|     devi  | xyz.456@gmail.com |9876543210|test@5678|test@5678				|
