@ExistingEmail
Feature: I can create user with existing email
  Background: Common steps
    Given I am on application page

  Scenario: Verify account can not be created with existing email
    And I click on Sign in link text
    And I enter existing email address
    When I click the create an account button
    Then I should get an error message

      #ExistingEmail  ignore
