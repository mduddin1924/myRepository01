Feature: LandingPageFunctionality

  Description:
  As a Customer or Employer
  I want to search Webpage
  so that I can see the Web Page
@Sanity
  Scenario: Verify Landing Page Functionality
    Given I am in Landing Page
    Then I can see Homepage logo
    Then I can see Welcome Message
    Then I can see Wrong Slogan

       #Gherkin Language -
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, *
#Given - Precondition
#called Test Step