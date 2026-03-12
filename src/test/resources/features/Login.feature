Feature: Login
  Background:
    Given User open browser

  @Login
  Scenario: StraitsX page should be displayed
    When user open "https://www.straitsx.com/" url
    Then straitsx page should be displayed