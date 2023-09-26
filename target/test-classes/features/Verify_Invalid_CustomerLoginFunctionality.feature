@Customer
Feature: InvalidCustomerLoginFunctionality

  Description:
  As a Customer
  I Want to login as Customer
  So that I can see Invalid Error Message


  Scenario: Verify Invalid Customer Login Functionality
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Customer Login Menu
    Then I Enter Invalid Customer User Id
    And I Enter Invalid Customer User Password
    When I click on with Invalid Id or Password Customer Login Button
    And  I can see Customer Error Login Message

         #Gherkin Language -
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, *
#Given - Precondition
#called Test Step