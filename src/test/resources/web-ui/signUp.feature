
@web
Feature: SignUp (Registration userID to log in Application)
  Note : "Registration one userID only one time execute, after that user name already exist")

  @[Negative-Test]-SignUp-existing-username.(Alghazali)
  Scenario: [Negative-Test] SignUp / Registration with existing username.(Alghazali)
    Given user is on signUp page
    And user input username SignUp with "Alghazali"
    And user input password SignUp with "P@ssw0rd"
    When user click Sign Up button
    Then user able to see message "This user already exist."


  @[Negative-Test]-SignUp-existing-username.(scenario-outline)
  Scenario Outline: [Negative-Test] SignUp with existing username (Scenario Outline)
    Given user is on signUp page
    And user input username SignUp with <usernameSign>
    And user input password SignUp with <passwordSign>
    When user click Sign Up button
    Then user able to see message <message>
    Examples:
      | usernameSign          | passwordSign | message                    |
      | "Alghazali"           | "P@ssw0rd"   | "This user already exist." |
      | "Junaedih Alghazali"  | "P@ssw0rd"   | "This user already exist." |
      | "Junaedih"            | "P@ssw0rd"   | "This user already exist." |
      | "Junaedih1 Alghazali" | "P@ssw0rd"   | "This user already exist." |


  @[Negative-Test]-SignUp-(blank-username)-(blank-password)
  Scenario: [Negative-Test] SignUp with (blank username) and (blank password)
    Given user is on signUp page
    And user input username SignUp with ""
    And user input password SignUp with ""
    When user click Sign Up button
    Then user able to see message "Please fill out Username and Password."


  @[Negative-Test]-SignUp-(input-username)-(blank-password)
  Scenario: [Negative-Test] SignUp with (blank password)
    Given user is on signUp page
    And user input username SignUp with "Junaedih3"
    And user input password SignUp with ""
    When user click Sign Up button
    Then user able to see message "Please fill out Username and Password."


  @[Negative-Test]-SignUp-(blank-username)-(input-password)
  Scenario: [Negative-Test]SignUp with (blank username)
    Given user is on signUp page
    And user input username SignUp with ""
    And user input password SignUp with "P@ssw0rd"
    When user click Sign Up button
    Then user able to see message "Please fill out Username and Password."



  @[Negative-Test]-Cancel-SignUp-(input-username)-(input-password)-closed
  Scenario: [Negative-Test] Cancel SignUp with input username dan password
    Given user is on signUp page
    And user input username SignUp with "Junaedih3"
    And user input password SignUp with "P@ssw0rd"
    When user click close sign up button
    Then user is on first page



  @[Negative-Test]-Cancel-SignUp-(input-username)-(blank-password)-closed
  Scenario: [Negative-Test] Cancel SignUp with (input-username)-(blank-password)
    Given user is on signUp page
    And user input username SignUp with "Junaedih3"
    And user input password SignUp with ""
    When user click close sign up button
    Then user is on first page


  @[Negative-Test]-Cancel-SignUp-(blank-username)-(input-password)-closed
  Scenario: [Negative-Test] Cancel SignUp with (blank-username)-(input-password)
    Given user is on signUp page
    And user input username SignUp with ""
    And user input password SignUp with "P@ssw0rd"
    When user click close sign up button
    Then user is on first page

  @[Negative-Test]-Cancel-SignUp-(blank-username)-(blank-password)-closed
  Scenario: [Negative-Test] Cancel SignUp with (blank-username)-(blank-password)
    Given user is on signUp page
    And user input username SignUp with ""
    And user input password SignUp with ""
    When user click close sign up button
    Then user is on first page
