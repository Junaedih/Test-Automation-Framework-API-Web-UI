@Add-Product-To-Cart
Feature: Add Product to Cart

  @[Positive-Test]-Add-Product-To-Cart-Samsung-galaxy-s6
  Scenario: [Positive Test] Verify, user can added Product Phone "Samsung galaxy s6" to Cart
    Given user is on detail product page "Samsung galaxy s6"
    When user click button add to cart
    Then Product "Samsung galaxy s6" added to Cart


  @[Positive-Test]-Add-Product-To-Cart-Iphone-6-32gb
  Scenario: [Positive Test] Verify, user can added Product Phone "Iphone 6 32gb" to Cart
    Given user is on detail product page "Iphone 6 32gb"
    When user click button add to cart
    Then Product "Iphone 6 32gb" added to Cart



  @[Positive-Test]-Add-Product-To-Cart-(Scenario-Outline)
  Scenario Outline: [Positive Test] Verify, user can added Product to Cart (Scenario Outline)
    Given user is on detail product page <product_name>
    When user click button add to cart
    Then Product <product_name_added> added to Cart
    Examples:
      | product_name          | product_name_added        |
      | "Nokia lumia 1520"    | "Nokia lumia 1520"        |
      | "Samsung galaxy s7"   | "Samsung galaxy s7"       |
      | "Sony xperia z5"      | "Sony xperia z5"          |
