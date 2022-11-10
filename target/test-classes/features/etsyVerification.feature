
Feature: Etsy Search Functionality
  User Story: As a user I should be able to verify a title


  #TC#51: Etsy Title Verification
#1. User is on https://www.etsy.com
#2. User sees title is as expected.

#Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone
  #Note: Follow POM
  Background: User expected to be on the homepage
    Given User is on etsy homepage

  Scenario: Etsy Title Verification
  When User sees title is as expected
  #Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

Scenario: Etsy Search Functionality Title Verification (without parameterization)
  When User types Wooden Spoon in the search box
  And User clicks search button
  Then User sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    When User types "Lexus keychain" in the search box
    And User clicks search button
    Then User sees "Lexus keychain - Etsy" is in the title


#TC#52: Etsy Search Functionality Title Verification (without parameterization)
#1. User is on https://www.etsy.com
#2. User types Wooden Spoon in the search box
#3. User clicks search button
#4. User sees Wooden Spoon is in the title

#Note: Follow POM
#TC#53: Etsy Search Functionality Title Verification (with parameterization)
#1. User is on https://www.etsy.com
#2. User types Wooden Spoon in the search box
#3. User clicks search button
#4. User sees Wooden spoon - Etsy is in the title

#Note: Follow POM