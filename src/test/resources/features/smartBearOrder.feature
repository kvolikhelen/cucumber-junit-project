Feature:


  Scenario: Smart Bear Log in
    Given User is on the SmartBearSoftware page
    When User enters username
    And User enters password
    And User clicks login Button
    And User should see Web Orders

    And User goes to Order page

    #User fills out the form as followed:

    And User selects "FamilyAlbum" from product dropdown
    And User enters "4" to quantity
    And User enters "John Wick" to customer name
    And User enters "Kinzie Ave" to street
    And User enters "Chicago" to city
    And User enters "IL" to state
    And User enters "60056"
    And User selects "Visa" as card type
    And User enters "1111222233334444" to card number
    And User enters "12/22" to expiration date
    And User clicks process button
    Then User verifies "John Wick" is in the list



