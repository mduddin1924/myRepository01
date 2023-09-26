package stepDefinitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Employee_HomePage;
import pages.Employee_ProfilePage;
import pages.Employee_UpdateInfoPage;

public class EmployeeUpdate_ProfileInformation extends Base {

    @Then("I click on Employee Profile Menu")
    public void i_click_on_Employee_Profile_Menu() throws InterruptedException {
        click(Employee_HomePage.myProfileMenu);
        Thread.sleep(1000);
    }

    @Then("I click Update Info button")
    public void i_click_Update_Info_button() throws InterruptedException {
        click(Employee_ProfilePage.updateInfoButton);
        Thread.sleep(1000);
    }

    @Then("I Change Employee Contact Number")
    public void i_Change_Employee_Contact_Number() throws InterruptedException {
        clear(Employee_UpdateInfoPage.updateContact);
        sendKeys(Employee_UpdateInfoPage.updateContact, "9999966666");
        Thread.sleep(1000);
    }

    @Then("I Change Employee Address")
    public void i_Change_Employee_Address() throws InterruptedException {
        clear(Employee_UpdateInfoPage.updateAddress);
        sendKeys(Employee_UpdateInfoPage.updateAddress, "369 Jersey St, NYC 10001");
        Thread.sleep(1000);
    }

    @Then("I click on Submit Button")
    public void i_click_on_Submit_Button() throws InterruptedException {
        click(Employee_UpdateInfoPage.submitButton);
        Thread.sleep(1000);
    }

    @And("I click logout from Employee profile Page")
    public void i_click_logout_from_Employee_profile_Page() {
        click(Employee_ProfilePage.logOut);
    }


}
