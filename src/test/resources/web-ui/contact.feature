@web
Feature: Contact

  @[Positive-Test]-send-contact-message
  Scenario: [Positive Test] Send Contact Message
    Given user on contact page
    And input email address "junaedih.alghazali1@gmail.com"
    And input name "Junaedih"
    And input message text "input message text in here"
    When user click send message button
    Then user get message box "Thanks for the message!!"



  @[Negative-Test]-send-contact-message-(blank-email)
  Scenario: [Negative-Test]-send-contact-message-(blank-email)
    Note: assumed requirement scenario ("contact email" is mandatory field)

    Expected : User get alert message "Please fill out Contact Email !!"
    Actual   : User get alert message "Thanks for the message!!"

    Given user on contact page
    And input email address ""
    And input name "Junaedih"
    And input message text "input message text in here"
    When user click send message button
    Then user get message box "Thanks for the message!!"



  @[Negative-Test]-send-contact-message-(blank-name)
  Scenario: [Negative-Test]-send-contact-message-(blank-name)
    Note: assumed requirement scenario ("contact name" is mandatory field)

    Expected : User get alert message "Please fill out Contact Name !!"
    Actual   : User get alert message "Thanks for the message!!"

    Given user on contact page
    And input email address "junaedih.alghazali1@gmail.com"
    And input name ""
    And input message text "input message text in here"
    When user click send message button
    Then user get message box "Thanks for the message!!"




  @[Negative-Test]-send-contact-message-(blank-email)-(blank-message)
  Scenario: [Negative-Test]-send-contact-message-(blank-email)-(blank-message)
    Note: assumed requirement scenario ("email" & "message" is mandatory field)

    Expected : User get alert message "Please fill out Contact Email !!"
    Actual   : User get alert message "Thanks for the message!!"

    Given user on contact page
    And input email address ""
    And input name "Junaedih"
    And input message text ""
    When user click send message button
    Then user get message box "Thanks for the message!!"



  @[Negative-Test]-send-contact-message-(blank-email)-(blank-name)-(blank-message)
  Scenario: [Negative-Test]-send-contact-message-(blank-email)-(blank-name)-(blank-message)
    Note: assumed requirement scenario ("email", "name" & "message" is mandatory field)

    Expected : User get alert message "Please fill out Contact Email !!"
    Actual   : User get alert message "Thanks for the message!!"


    Given user on contact page
    And input email address ""
    And input name ""
    And input message text ""
    When user click send message button
    Then user get message box "Thanks for the message!!"



  @cancel-send-contact-message
  Scenario: Cancel Send Contact Message
    Given user on contact page
    And input email address "junaedih.alghazali1@gmail.com"
    And input name "Junaedih"
    And input message text "input message text in here"
    When user click close message button
    Then user is on home-page



  @cancel-send-contact-(blank-email)
  Scenario: cancel-send-contact-(blank-email)
    Given user on contact page
    And input email address ""
    And input name "Junaedih"
    And input message text "input message text in here"
    When user click close message button
    Then user is on home-page


  @cancel-send-contact-(blank-name)
  Scenario: cancel-send-contact-(blank-name)
    Given user on contact page
    And input email address "junaedih.alghazali1@gmail.com"
    And input name ""
    And input message text "input message text in here"
    When user click close message button
    Then user is on home-page


  @cancel-send-contact-(blank-message)
  Scenario: cancel-send-contact-(blank-message)
    Given user on contact page
    And input email address "junaedih.alghazali1@gmail.com"
    And input name "Junaedih"
    And input message text ""
    When user click close message button
    Then user is on home-page


  @cancel-send-contact-(blank-name)-(blank-message)
  Scenario: cancel-send-contact-(blank-name)-(blank-message)
    Given user on contact page
    And input email address "junaedih.alghazali1@gmail.com"
    And input name ""
    And input message text ""
    When user click close message button
    Then user is on home-page


  @cancel-send-contact-(blank-email)-(blank-message)
  Scenario: cancel-send-contact-(blank-email)-(blank-message)
    Given user on contact page
    And input email address ""
    And input name "Junaedih"
    And input message text ""
    When user click close message button
    Then user is on home-page


  @cancel-send-contact-(blank-email)-(blank-name)
  Scenario: cancel-send-contact-(blank-email)-(blank-name)
    Given user on contact page
    And input email address ""
    And input name ""
    And input message text "input message text in here"
    When user click close message button
    Then user is on home-page


  @cancel-send-contact-(blank-email)-(blank-name)-(blank-message)
  Scenario: cancel-send-contact-(blank-email)-(blank-name)-(blank-message)
    Given user on contact page
    And input email address ""
    And input name ""
    And input message text ""
    When user click close message button
    Then user is on home-page
