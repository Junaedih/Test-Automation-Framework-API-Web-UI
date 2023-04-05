@Purchase-Product
Feature: Purchase Product


  @[Positive-Test]-verify-user-can-purchase-product
  Scenario: [Positive Test] Verify, user can purchase product
    Given user is on place order page
    And user input name place order with "Junaedih"
    And user input country place order with "Indonesia"
    And user input city place order with "Tangerang Selatan"
    And user input credit card place order with "Master Card 10101110911203"
    And user input month place order with "January"
    And user input year place order with "2023"
    When user click purchase button
    Then product already process place order Purchase


  @[Positive-Test]-verify-user-can-purchase-product-(only-fill-out-name-and-creditcard)
  Scenario: [Positive Test] Verify, user can purchase product (only fill out Name and Creditcard)
    Given user is on place order page
    And user input name place order with "Junaedih"
    And user input country place order with ""
    And user input city place order with ""
    And user input credit card place order with "Master Card 10101110911203"
    And user input month place order with ""
    And user input year place order with ""
    When user click purchase button
    Then product already process place order Purchase


  @[Positive-Test]-verify-user-can-cancel-purchase-product
  Scenario: [Positive Test] Verify, user can cancel purchase product
    Given user is on place order page
    And user input name place order with "Junaedih"
    And user input country place order with "Indonesia"
    And user input city place order with "Tangerang Selatan"
    And user input credit card place order with "Master Card 10101110911203"
    And user input month place order with "January"
    And user input year place order with "2023"
    When user click closed button
    Then user is stay on cart page



  @[Negative-Test]-verify-user-can't-purchase-product-(blank-input-name)
  Scenario: [Negative Test] Verify, user can't purchase product (blank-input-name)
    Given user is on place order page
    And user input name place order with ""
    And user input country place order with "Indonesia"
    And user input city place order with "Tangerang Selatan"
    And user input credit card place order with "Master Card 10101110911203"
    And user input month place order with "January"
    And user input year place order with "2023"
    When user click purchase button
    Then user get message alert "Please fill out Name and Creditcard."


  @[Negative-Test]-verify-user-can't-purchase-product-(blank-input-credit-card)
  Scenario: [Negative Test] Verify, user can't purchase product (blank-input-credit-card)
    Given user is on place order page
    And user input name place order with "Junaedih"
    And user input country place order with "Indonesia"
    And user input city place order with "Tangerang Selatan"
    And user input credit card place order with ""
    And user input month place order with "January"
    And user input year place order with "2023"
    When user click purchase button
    Then user get message alert "Please fill out Name and Creditcard."