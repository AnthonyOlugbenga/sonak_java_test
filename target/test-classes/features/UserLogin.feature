@UserLogin
Feature: Creating a valid login _UserLogin

  Background: Common steps
    Given I am on application page

  Scenario: I want to login with valid credentials
    And I click sign in button
    And I input valid credentials to text boxes
    When I click on the login button
    Then I should be logged in successfully