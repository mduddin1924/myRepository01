@Employee
Feature: EmployeeUpdateProfileInformation

  Description:
  As a Employee
  I Want to login as Employee
  So that I can see Employee Home Page and Update of Profile


  Scenario: Employee Update Profile Information
    Given I See Landing Page
    Then I Press on Login Menu
    Then I click Employee Login Menu
    And I Enter Employee User Id
    And I Enter Employee Password
    When I click on Employee Login Button
    Then Verify I am In Employee Home Page
    Then I click on Employee Profile Menu
    Then I click Update Info button
    Then I Change Employee Contact Number
    Then I Change Employee Address
    Then I click on Submit Button
    And I click logout from Employee profile Page

         #Gherkin Language -
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, *
#Given - Precondition
#called Test Step