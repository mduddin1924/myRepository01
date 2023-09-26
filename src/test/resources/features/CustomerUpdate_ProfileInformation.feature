@Customer @Employee
Feature: CustomerUpdateProfileInformation

  Description:
  As a Customer
  I Want to login as Customer
  So that I can see Customer Home Page and Profile menu


  Scenario: Verify Customer Update Profile Information
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Customer Login Menu
    And I Enter Customer User Id
    And I Enter Customer User Password
    When I click on Customer Login Button
    Then Verify I am In Customer Home Page
    When I Click Customer Profile Menu
    Then I click Profile Update Button
    Then I Change Customer Contact Number
    Then I Change Customer Address
    And I click Customer Submit Button

         #Gherkin Language -
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, *
#Given - Precondition
#called Test Step






