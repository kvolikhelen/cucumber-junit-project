Feature: User should be able to login

  Background:
    Given User is on the login page of web table app


  Scenario: Login scenario with 1 parameter
    #Given User is on the login page of web table app
    When User enters username "Test"
    And User enters password "Tester"
    And User clicks login button
    Then User should see url contains orders


  Scenario: Login scenario with 2 parameters
    When User enters username "Test" and password "Tester" and logins
    Then User should see url contains orders


  Scenario: Login scenario with data table
    When user enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then User should see url contains orders

