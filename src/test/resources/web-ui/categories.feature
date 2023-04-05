@web
Feature: Display Product by Categories

  @[Positive-Test]-product-by-categories-phones
  Scenario: [Positive Test] Display Product by Categories Phones
    Given user is on Home-page
    When user click link-text categories Phones
    Then user see display list product categories phone


  @[Positive-Test]-display-product-by-categories-monitors
  Scenario: [Positive Test] Display Product by Categories Monitors
    Given user is on Home-page
    When user click link-text categories Monitor
    Then user see display list product categories monitor



  @[Positive-Test]-Display-Product-By-Categories-Laptops
  Scenario: [Positive Test] Verify (User Can) Display Product by Categories Laptops
    Given user is on Home-page
    When user click link-text categories "Laptops"
    Then user see display list product base category "Laptops"


  @[Positive-Test]-Display-Product-By-Categories-Monitors
  Scenario: [Positive Test] Verify (User Can) Display Product by Categories Monitors
    Given user is on Home-page
    When user click link-text categories "Monitors"
    Then user see display list product base category "Monitors"


  @[Positive-Test]-Display-Product-By-Categories-Phones
  Scenario: [Positive Test] Verify (User Can) Display Product by Categories Phones
    Given user is on Home-page
    When user click link-text categories "Phones"
    Then user see display list product base category "Phones"


  @[Positive-Test]-Display-Product-By-Categories-(scenario-outline)
  Scenario Outline: [Positive Test] Verify (User Can) Display Product by Categories (Scenario Outline)
    Given user is on Home-page
    When user click link-text categories <productCategory>
    Then user see display list product base category <productCategoryName>
    Examples:
      | productCategory | productCategoryName |
      | "Phones"        | "Phones"            |
      | "Monitors"      | "Monitors"          |
      | "Laptops"       | "Laptops"           |




