
Feature: facebook webapplication
 	
  Scenario: login
    Given valid url
    When  i enter valid usernames as "kanakaratnam n" and password as"ratnam" 
    Then validate login
    
   Scenario: click message
    Given valid url
    And login to facebook 
    Then validate login  
    And  send message

