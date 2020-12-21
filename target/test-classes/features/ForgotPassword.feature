@ForgotPassword
Feature: Retrieve Forgotten Password _ForgotPassword

  Background: Common steps
    Given I am on application page

  Scenario: User should be able to recover forgotten password
    And I click on the Sign in link
    When I click on the Forgot your password link
    And I enter my email address in text field
    When I click on the retrieve password button
    Then I should get a success message
