@Employee
Feature: InvalidEmployeeLoginFunctionality

  Description:
  As a Employee
  I Want to login as Employee
  So that I can see Invalid Employee Error Message


  Scenario: Verify Invalid Employee Login Functionality
    Given I See Landing Page
    Then I Press on Login Menu
    Then I click Employee Login Menu
    Then I Enter Invalid Employee User Id
    And I Enter Invalid Employee Password
    When I click on with Invalid Id or Password Employee Login Button
    And I can See Error Employee Login Message

       #Gherkin Language -
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, *
#Given - Precondition
#called Test Step