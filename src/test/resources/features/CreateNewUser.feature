@CreateNewUser
Feature: create new automation test _CreateNewUser

  Background: Common steps
    Given I am on application page

  Scenario: user should be able to register account
    And I click on Sign in button
    And I enter valid email address
    And I click on create account button
    When I entered all mandatory details
    And I click on the register button
    Then My account should be registered successfully

