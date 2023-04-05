@Create-User
Feature: Create User

  @[Positive-Test]Verify-successfully-Create-User
   Scenario: [Positive Test] Verify successfully Create User

  "Create User" process only one time execute, after that user already exist"
   value email is primary key

    Given url dummy-api.io can accessed
    When send request post create user with firstName: "Junaedih" , lastName: "Alghazali" email:"jun_x5@gmail.com"
    Then get response code 200 OK, user already created



  @[Negative-Test]Verify-Can't-Create-User-(email)
  Scenario Outline: [Negative Test] Verify Can't Create User (email)
    Given url dummy-api.io can accessed
    When create user with firstName: <valuefirstName>,lastName: <valuelastName> email existing:<valueEmail> response code <responseCode>, error:<textError>,  detail error: <textDetailError>
    Then get response code 400 Bad Request
    Examples:
      | valuefirstName | valuelastName  | valueEmail               | responseCode | textError        | textDetailError                            |
      | "Junaedih"     | "Alghazali"    | "hermawan.aan@gmail.com" | 400          | "BODY_NOT_VALID" | "Email already used"                       |
      | "Junaedih"     | "Alghazali"    | ""                       | 400          | "BODY_NOT_VALID" | "Path `email` is required."                |
      | "Junaedih"     | "Alghazali"    | "hermawan.aan"           | 400          | "BODY_NOT_VALID" | "Path `email` is invalid (hermawan.aan)."  |
      | "Junaedih"     | "Alghazali"    | "jun"                    | 400          | "BODY_NOT_VALID" | "Path `email` is invalid (jun)."           |



  @[Negative-Test]Verify-Can't-Create-User-(firstName)
  Scenario Outline: [Negative Test] Verify Can't Create User (firstName)
    Given url dummy-api.io can accessed
    When create user with blank firstName: <valuefirstName>, lastName: <valuelastName> email: <valueEmail> response code <responseCode>, error: <textError>,  detail error: <textDetailError>
    Then get response code 400 Bad Request
    Examples:
      | valuefirstName | valuelastName | valueEmail      | responseCode | textError        | textDetailError                  |
      | ""             | "alghazali"   | "jun@gmail.com" | 400          | "BODY_NOT_VALID" | "Path `firstName` is required."  |



  @[Negative-Test]Verify-Can't-Create-User-(lastName)
  Scenario Outline: [Negative Test] Verify Can't Create User (lastName)
    Given url dummy-api.io can accessed
    When create user with firstName: <valuefirstName>, blank lastName: <valuelastName> email: <valueEmail> response code <responseCode>, error: <textError>,  detail error: <textDetailError>
    Then get response code 400 Bad Request
    Examples:
      | valuefirstName | valuelastName | valueEmail      | responseCode | textError        | textDetailError      |
      | "junaedih"     | ""            | "jun@gmail.com" | 400          | "BODY_NOT_VALID" | "Path `lastName` is required." |

