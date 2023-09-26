@Customer @Employee
Feature: CustomerLoginFunctionality

  Description:
  As a Customer
  I Want to login as Customer
  So that I can see Customer Home Page


  Scenario: Verify Customer Login Functionality
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Customer Login Menu
    And I Enter Customer User Id
    And I Enter Customer User Password
    When I click on Customer Login Button
    Then Verify I am In Customer Home Page
    And I Logout from Customer Home Page




      #Gherkin Language -
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, *
#Given - Precondition
#called Test Step




