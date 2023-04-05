@api
Feature: Get List of Tags

  @[Positive-Test]-Get-List-Of-Tags
  Scenario: [Positive Test] Verify successfully Get List of Tags
    Given url dummy-api.io can accessed
    When send request get list of Tags
    Then get response code 200 OK

