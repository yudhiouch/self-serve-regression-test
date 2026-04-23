@login
Feature: Login
  Background:
    Given User open browser

  @Login-1
  Scenario: StraitsX page should be displayed
    When user open "https://www.straitsx.com/" url
    Then straitsx page should be displayed

  @Login-2
  Scenario: Google page should be displayed
    When user open "https://www.google.com/" url
    Then straitsx page should be displayed

  @Login-3
  Scenario: Google page should be displayed
    When user open "https://www.detik.com/" url
    Then straitsx page should be displayed