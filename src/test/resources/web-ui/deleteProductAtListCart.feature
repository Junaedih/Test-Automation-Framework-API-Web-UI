@web
Feature: Delete Product At List Cart

  @[Positive-Test]-delete-product-phone-Samsung-galaxy-s6-at-list-cart
  Scenario: [Positive Test] Delete Product Phone "Samsung galaxy s6" At List Cart
    Given product "Samsung galaxy s6" already added to list cart
    When user click link-text deleted product
    Then product deleted from list cart


  @[Positive-Test]-delete-product-at-list-cart-(scenario-outline)
  Scenario Outline: [Positive Test] Delete Product At List Cart (Scenario Outline)
    Given product <listProductName2> already added to list cart
    When user click link-text deleted product
    Then product deleted from list cart
    Examples:
      | listProductName2      |
      | "Nokia lumia 1520"    |
      | "Sony vaio i5"        |
      | "HTC One M9"          |





