@api
Feature: Get User By ID

  @[Positive-Test]-Verify-successfully-Get-User-By-ID-01
  Scenario: [Positive Test] Verify successfully Get User By ID -01
    Given url dummy-api.io can accessed
    When send request get by ID "60d0fe4f5311236168a10a01"
    Then get response code 200 OK, ID: "01",  firstname: "Jesus" , lastname: "Riley"


  @[Positive-Test]-Verify-successfully-Get-User-By-ID-02
  Scenario: [Positive Test] Verify successfully Get User By ID -02
    Given url dummy-api.io can accessed
    When send request get by ID "60d0fe4f5311236168a10a02"
    Then get response code 200 OK, ID: "02",  firstname: "Cristobal" , lastname: "Soler"


  @[Positive-Test]-Verify-successfully-Get-User-By-ID-(Scenario-Outline)
  Scenario Outline: [Positive Test] Verify successfully Get User By ID (Scenario Outline)
    Given url dummy-api.io can accessed
    When send request get by ID <listID>
    Then get response code 200 OK, ID: <textListID>,  firstname: <firstName> , lastname: <lastName>
    Examples:
      | listID                     | textListID | firstName     | lastName    |
      | "60d0fe4f5311236168a10a03" | "03"       | "Andri"       | "Leclerc"   |
      | "60d0fe4f5311236168a10a04" | "04"       | "Konsta"      | "Manninen"  |
      | "60d0fe4f5311236168a10a05" | "05"       | "Ane"         | "Frafjord"  |
      | "60d0fe4f5311236168a10a07" | "07"       | "Sigmund"     | "Myran"     |
      | "60d0fe4f5311236168a10a08" | "08"       | "Lilja"       | "Lampinen"  |


  @[Negative-Test]-Verify-can't-Get-User-By-(invalid-ID-01)
  Scenario: [Negative Test] Verify can't Get User By (invalid ID 01)
    Given url dummy-api.io can accessed
    When send request get by invalid ID "invalid ID 01"
    Then get response code 400 Bad Request, ID: "invalid ID 01", error: "PARAMS_NOT_VALID"


  @[Negative-Test]-Verify-can't-Get-User-By-(invalid-ID-02)
  Scenario: [Negative Test] Verify can't Get User By (invalid ID 02)
    Given url dummy-api.io can accessed
    When send request get by invalid ID "invalid ID 02"
    Then get response code 400 Bad Request, ID: "invalid ID 02", error: "PARAMS_NOT_VALID"


  @[Negative-Test]-Verify-can't-Get-User-By-invalid-ID-(Scenario-Outline)
  Scenario Outline: [Negative Test] Verify can't Get User By invalid ID (Scenario Outline)
    Given url dummy-api.io can accessed
    When send request get by invalid ID
    Then get response code <responseCode> Bad Request, ID: <invalidID>, error: <messageError>
    Examples:
      | invalidID                     | responseCode | messageError         |
      | "invalid ID 03"               | 400          | "PARAMS_NOT_VALID"   |
      | "invalid-ID-04"               | 400          | "PARAMS_NOT_VALID"   |
      | "60d0fe4f5311236168a10a30"    | 404          | "RESOURCE_NOT_FOUND" |
      | "60d0fe4f5311236168a10a31"    | 404          | "RESOURCE_NOT_FOUND" |



