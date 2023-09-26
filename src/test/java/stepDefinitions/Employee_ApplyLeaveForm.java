package stepDefinitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employee_ApplyLeavePage;
import pages.Employee_HomePage;

import static org.junit.Assert.assertEquals;

public class Employee_ApplyLeaveForm extends Base {

    @Then("I click Apply Leave Menu")
    public void i_click_Apply_Leave_Menu() throws InterruptedException {
        click(Employee_HomePage.applyLeaveMenu);
        Thread.sleep(1000);
    }

    @When("I pick the vacation")
    public void i_pick_the_vacation() {

        sendKeys(Employee_ApplyLeavePage.reasonVacation, "The World Tour");
    }

    @Then("I put Start date")
    public void i_put_Start_date() throws InterruptedException {

        sendKeys(Employee_ApplyLeavePage.startDate, "07/10/2023");
        Thread.sleep(1000);
    }

    @Then("I filled End date")
    public void i_filled_End_date() throws InterruptedException {

        sendKeys(Employee_ApplyLeavePage.endDate, "08/29/2023");
        Thread.sleep(1000);
    }

    @And("I click Submit Button")
    public void i_click_Submit_Button() throws InterruptedException {

        click(Employee_ApplyLeavePage.submitButton);
        Thread.sleep(1000);
    }

    @And("I Verify The Status Text")
    public void i_Verify_The_Status_Text() {

        String getStatus = getText(Employee_HomePage.leaveStatusText);
        assertEquals("Leave Satus", getStatus);
    }

}



