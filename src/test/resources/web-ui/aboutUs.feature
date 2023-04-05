@web
Feature: About Us
  @[Positive-Test]-about-us-video-running
  Scenario: [Positive Test] verify "about us" page is working fine play video
    Given User is On About Us Page
    When user click button Play Video
    Then About Us Video Displayed

  @[Cancel]-about-us-play-video-(closed)
  Scenario: [Cancel] play video at "about us" page
    Given User is On About Us Page
    When user click closed button Play Video
    Then user is on HomePage
