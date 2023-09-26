@Employee
Feature: Employee_ApplyLeaveForm

  Description:
  As a Employee
  I Want to login as Employee
  So that I can see Employee Home Page Leave Menu


  Scenario: Verify Employee Apply Leave Form
    * I See Landing Page
    * I Press on Login Menu
    * I click Employee Login Menu
    * I Enter Employee User Id
    * I Enter Employee Password
    * I click on Employee Login Button
    * Verify I am In Employee Home Page
    * I click Apply Leave Menu
    * I pick the vacation
    * I put Start date
    * I filled End date
    * I click Submit Button
    * I Verify The Status Text

         #Gherkin Language -
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, *
#Given - Precondition
#called Test Step
