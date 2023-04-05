@Delete-User
Feature: Delete User

  @[Positive-Test]Verify-successfully-Delete-User
  Scenario: [Positive Test] Verify successfully Delete User
    Given url dummy-api.io can accessed
    When send request deleted user with id: "6428f2c742fa6b7f7b44e3c9" get response code 204 No Content
    Then get response code 204 No Content, user already deleted


  @[Positive-Test]Verify-successfully-Delete-User
  Scenario Outline: [Positive Test] Verify successfully Delete User
    Given url dummy-api.io can accessed
    When send request deleted user with id: <listID> get response code <valueResponseCode> No Content
    Then get response code 204 No Content, user already deleted
    Examples:
      | listID                     | valueResponseCode |
      | "60d0fe4f5311236168a10a03" | 204               |
      | "60d0fe4f5311236168a10a04" | 204               |
      | "60d0fe4f5311236168a10a05" | 204               |
      | "60d0fe4f5311236168a10a06" | 204               |
      | "60d0fe4f5311236168a10a07" | 204               |