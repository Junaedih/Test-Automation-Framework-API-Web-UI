@Update-User
Feature: Update User

  @[Positive-Test]Verify-successfully-Update-User-(firstName)
  Scenario: [Positive Test] Verify successfully Update User-(firstName)
    Given url dummy-api.io can accessed
    When send request put update user with id: "22" , newFirstName: "Junaedih", get response code 200
    Then get response code 200 OK, firstName already updated


  @[Positive-Test]Verify-successfully-Update-User-(firstName)-(Scenario-Outline)
  Scenario Outline: [Positive Test] Verify successfully Update User-(firstName) (Scenario Outline)
    Given url dummy-api.io can accessed
    When send request put update user with id: <listID> , newFirstName: <newFirstName>, get response code <valueResponseCode>
    Then get response code 200 OK, firstName already updated
    Examples:
      | listID | newFirstName | valueResponseCode |
      | "23"   | "Junaedih"   | 200               |
      | "24"   | "Prabu"      | 200               |



  @[Positive-Test]Verify-successfully-Update-User-(lastName)
  Scenario: [Positive Test] Verify successfully Update User-(lastName)
    Given url dummy-api.io can accessed
    When send request put update user with id: "22" , newLastName: "Alghazali", get response code 200
    Then get response code 200 OK, firstName already updated


  @[Positive-Test]Verify-successfully-Update-User-(lastName)-(Scenario-Outline)
  Scenario Outline: [Positive Test] Verify successfully Update User-(lastName) (Scenario Outline)
    Given url dummy-api.io can accessed
    When send request put update user with id: <listID> , newLastName: <newlastName>, get response code <valueResponseCode>
    Then get response code 200 OK, firstName already updated
    Examples:
      | listID | newlastName | valueResponseCode |
      | "23"   | "Alghazali" | 200               |
      | "24"   | "Siliwangi" | 200               |



  @[Positive-Test]Verify-successfully-Update-User-(firstName-and-lastName)
  Scenario: [Positive Test] Verify successfully Update User (firstName-and-lastName)
    Given url dummy-api.io can accessed
    When send request put update user with id: "28" , newFirstName: "Junaedih", newLastName: "Alghazali", get response code 200
    Then get response code 200 OK, firstName already updated



  @[Positive-Test]Verify-successfully-Update-User-(firstName-and-lastName)-(Scenario-Outline)
  Scenario Outline: [Positive Test] Verify successfully Update User (firstName-and-lastName) (Scenario Outline)
    Given url dummy-api.io can accessed
    When send request put update user with id: <listID> , newFirstName: <newfirstName>, newLastName: <newlastName>, get response code <valueResponseCode>
    Then get response code 200 OK, firstName already updated
    Examples:
      | listID | newfirstName | newlastName | valueResponseCode |
      | "11"   | "Junaedih"   | "Alghazali" | 200               |
      | "12"   | "Andika"     | "Ramadhan"  | 200               |



  @[Negative-Test]Verify-can't-Update-User-(Invalid-ID)
  Scenario: [Positive Test] Verify successfully Update User-(InvalidID)
    Given url dummy-api.io can accessed
    When send request put update user with id: "invalid-22" , newLastName: "Alghazali", get response code 400 get message error "PARAMS_NOT_VALID"
    Then get response code 404 Not Found, firstName already updated


  @[Negative-Test]Verify-can't-Update-User-(Invalid-ID)
  Scenario Outline: [Positive Test] Verify successfully Update User-(InvalidID) (Scenario Outline)
    Given url dummy-api.io can accessed
    When send request put update user with id: <listID> , newLastName: <newlastName>, get response code <valueResponseCode> get message error <messageError>
    Then get response code 404 Not Found, firstName already updated
    Examples:
      | listID       | newlastName | valueResponseCode | messageError           |
      | "invalid-22" | "Alghazali" | 400               | "PARAMS_NOT_VALID"     |
      | "30"         | "Alghazali" | 400               | "BODY_NOT_VALID"       |
