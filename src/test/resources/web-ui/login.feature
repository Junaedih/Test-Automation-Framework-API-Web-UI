@login
Feature: Login

  @[Positive-Test]-valid-login-successfully
  Scenario: [Positive Test] Login using valid username and valid password (Alghazali)
    Given user is on login page
    And user input username with "Alghazali"
    And user input password with "P@ssw0rd"
    When user click login button
    Then user is on homepage


  @[Positive-Test]-valid-login-successfully-(scenario-outline)
  Scenario Outline: [Positive Test] Login using valid username and valid password (Scenario Outline)
    Given user is on login page
    And user input username with <username>
    And user input password with <password>
    When user click login button
    Then user is on homepage
    Examples:
      | username                | password   |
      | "Alghazali"             | "P@ssw0rd" |
      | "Junaedih1 Alghazali"   | "P@ssw0rd" |
      | "Junaedih2"             | "P@ssw0rd" |



  @[Negative-Test]-invalid-login-(wrong-password)
  Scenario: [Negative Test] Login using valid username and invalid password ("Wrong password.")
    Given user is on login page
    And user input username with "Alghazali"
    And user input password with "incorrect password"
    When user click login button
    Then user able to see error message "Wrong password."



  @[Negative-Test]-invalid-login-(user-does-not-exist)
  Scenario: [Negative Test] Login using invalid username and valid password ("User does not exist.")
    Given user is on login page
    And user input username with "incorrect_username"
    And user input password with "P@ssw0rd"
    When user click login button
    Then user able to see error message "User does not exist."


  @[Negative-Test]-invalid-login-(blank-password)-(Please-fill-out-Username-and-Password.")
  Scenario: [Negative Test] Login using valid username and blank password ("Please fill out Username and Password.")
    Given user is on login page
    And user input username with "Junaedih"
    And user input password with ""
    When user click login button
    Then user able to see error message "Please fill out Username and Password."


  @[Negative-Test]-invalid-login-(blank-username)-(Please-fill-out-Username-and-Password.")
  Scenario: [Negative Test] Login using blank username ("Please fill out Username and Password.")
    Given user is on login page
    And user input username with ""
    And user input password with "P@ssw0rd"
    When user click login button
    Then user able to see error message "Please fill out Username and Password."


  @[Negative-Test]-invalid-login-(blank-username-and-blank-password)-(Please-fill-out-Username-and-Password.")
  Scenario: [Negative Test] Login using invalid username and blank password ("Please fill out Username and Password.")
    Given user is on login page
    And user input username with ""
    And user input password with ""
    When user click login button
    Then user able to see error message "Please fill out Username and Password."



  @[Negative-Test]-invalid-login-(negative-test-scenario-outline)
  Scenario Outline: [Negative-Test] Invalid login (negative-test-scenario-outline)
    Given user is on login page
    And user input username with <username>
    And user input password with <password>
    When user click login button
    Then user able to see error message <errorMessage>
    Examples:
      | username                 | password                 | errorMessage                             |
      | "Junaedih"               | "invalid password"       | "Wrong password."                        |
      | "ivalid username"        | "P@ssw0rd"               | "User does not exist."                   |
      | "Junaedih"               | ""                       | "Please fill out Username and Password." |
      | ""                       | "P@ssw0rd"               | "Please fill out Username and Password." |
      | ""                       | ""                       | "Please fill out Username and Password." |


  @[Negative-Test]-cancel-login-(input-username)-(input-password)-closed
  Scenario: [Cancel Login] input username and input password (closed)
    Given user is on login page
    And user input username with "Junaedih Alghazali"
    And user input password with "P@ssw0rd"
    When user click close button
    Then user is on first page

  @[Negative-Test]-cancel-login-(input-username)-(blank-password)-closed
  Scenario: [Cancel Login] input username and blank password (closed)
    Given user is on login page
    And user input username with "Junaedih Alghazali"
    And user input password with ""
    When user click close button
    Then user is on first page

  @[Negative-Test]-cancel-login-(input-password)-(blank-username)-closed
  Scenario: [Cancel Login] blank username and input password (closed)
    Given user is on login page
    And user input username with ""
    And user input password with "P@ssw0rd"
    When user click close button
    Then user is on first page


  @[Negative-Test]-cancel-login-(blank-username)-(blank-password)-close
  Scenario: [Cancel Login] blank username and blank password (closed)
    Given user is on login page
    And user input username with ""
    And user input password with ""
    When user click close button
    Then user is on first page