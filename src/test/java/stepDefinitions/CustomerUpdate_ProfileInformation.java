package stepDefinitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Customer_HomePage;
import pages.Customer_ProfilePage;
import pages.Customer_UpdateInfoPage;

public class CustomerUpdate_ProfileInformation extends Base {

    @When("I Click Customer Profile Menu")
    public void i_Click_Customer_Profile_Menu() throws InterruptedException {
       click(Customer_HomePage.customerProfileMenu);
       Thread.sleep(1000);
    }

    @Then("I click Profile Update Button")
    public void i_click_Profile_Update_Button() throws InterruptedException {
        click(Customer_ProfilePage.updateInfoButton);
        Thread.sleep(1000);
    }

    @Then("I Change Customer Contact Number")
    public void i_Change_Customer_Contact_Number() throws InterruptedException {
        clear(Customer_UpdateInfoPage.updateContactNum);
        sendKeys(Customer_UpdateInfoPage.updateContactNum,"1234567890");
        Thread.sleep(1000);
    }

    @Then("I Change Customer Address")
    public void i_Change_Customer_Address() throws InterruptedException {
        clear(Customer_UpdateInfoPage.updateAddress);
        sendKeys(Customer_UpdateInfoPage.updateAddress,"123 Norfolk rd, Minneapolis");
        Thread.sleep(1000);
    }

    @And("I click Customer Submit Button")
    public void i_click_Customer_Submit_Button() {

        click(Customer_UpdateInfoPage.updateButton);
    }

}
