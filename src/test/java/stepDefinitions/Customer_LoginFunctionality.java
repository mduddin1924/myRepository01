package stepDefinitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

import java.io.IOException;

import static org.junit.Assert.*;// for all Assert methods by * sign...

//used whole Customer login functionality after HomePage
public class Customer_LoginFunctionality extends Base {


    @Given("I am in Landing Page")
    public void i_am_in_landing_page() {
        navigate("http://it.microtechlimited.com");
    }

    @Then("I click on Login Menu")
    public void i_click_on_login_menu() throws IOException {

        click(Landing_Page.menuLoginButton);
        screenShotName(driver,"Landing Page");
    }

    @And("I click on Customer Login Menu")
    public void i_click_on_customer_login_menu() {

        click(Customer_LoginPage.customerLogin);
    }

    @And("I Enter Customer User Id")
    public void i_enter_user_id() {

        sendKeys(Customer_LoginPage.customerUserId, "david@gmail.com");
    }

    @And("I Enter Customer User Password")
    public void i_enter_Customer_user_password() {

        sendKeys(Customer_LoginPage.customerUserPwd, "1234");
    }

    @When("I click on Customer Login Button")
    public void i_click_on_Customer_login_button() {

        click(Customer_LoginPage.customerLoginBtn);
    }

    @Then("Verify I am In Customer Home Page")
    public void verify_i_am_in_customer_home_page() {
        String idStatus = getText(Customer_HomePage.customerIdStatus);
        assertEquals("Customer Id: 4", idStatus);
    }

    @And("I Logout from Customer Home Page")
    public void i_Logout_from_Customer_Home_Page() {
        click(Customer_HomePage.logOut);
    }


}
