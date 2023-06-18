Feature: Purchase Ticket

  Scenario Outline: Verify Ticket Purchase Confirmation Message
    Given User navigates to Register Page "https://blazedemo.com/purchase.php"
    When User enters Full Name "<firstName>"
    And User enters Address "<address>"
    And User enters City "<city>"
    And User enters State "<state>"
    And User selects Zip Code "<zipCode>"
    And User selects cardType "<cardType>"
    And User selects Credit Card Number "<creditCardNumber>"
    And Selects month and year "<month>" "<year>"
    And User enters name on Carde "<nameOnCard>"
    And User clicks Remember me button
    And User clicks Purchase Flight button
    Then User verifies success message "<message>"

    Examples: 
      | firstName | address      | city        | state      | zipCode | cardType         | creditCardNumber | month    | year | nameOnCard | message                            |
      | John      | 123 drive st | Miami       | Florida    |   33174 | Visa             |     456653252123 | March    | 2028 | John       | Thank you for your purchase today! |
      | Hamza     | 345 drive st | Orlando     | Florida    |   35750 | American Express |     654325278551 | January  | 2026 | Hamza      | Thank you for your purchase today! |
      | Gary      | 678 drive st | New York    | New York   |   20568 | Visa             |     754212325358 | July     | 2025 | Yuliya     | Thank you for your purchase today! |
      | Meridian  | 912 drive st | LA          | California |   75058 | American Express |     895665424378 | December | 2030 | Gary       | Thank you for your purchase today! |
      | Yuliya    | 454 drive st | New Orleans | Lousiana   |   45898 | Visa             |     545865854584 | August   | 2029 | Fahim      | Thank you for your purchase today! |
     