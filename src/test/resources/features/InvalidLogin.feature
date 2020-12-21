@InvalidLogin
Feature: Create an Invalid Login

  Background: Common steps
    Given I am on application page


  Scenario: Login with invalid credentials should return error
    When I click the Sign in button
    And I enter Invalid credentials
    When I click on login button
   Then error message should be displayed
