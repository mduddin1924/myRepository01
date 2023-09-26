package stepDefinitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

import static org.junit.Assert.assertEquals;

//used whole Employee login functionality after HomePage
public class Employee_LoginFunctionality extends Base {


    @Given("I See Landing Page")
    public void i_see_landing_page() {

        navigate("http://it.microtechlimited.com");
    }

    @Then("I Press on Login Menu")
    public void i_press_on_login_menu() {

        click(Landing_Page.menuLoginButton);
    }

    @Then("I click Employee Login Menu")
    public void i_click_employee_login_menu() {

        click(Employee_LoginPage.employeeLoginMenu);
    }

    @Then("I Enter Employee User Id")
    public void i_enter_employee_user_id() throws InterruptedException {

        sendKeys(Employee_LoginPage.employeeUserId, "testpilot@gmail.com");
        Thread.sleep(1000);
    }

    @Then("I Enter Employee Password")
    public void i_enter_employee_password() throws InterruptedException {

        sendKeys(Employee_LoginPage.employeePassword, "1234");
        Thread.sleep(1000);
    }

    @When("I click on Employee Login Button")
    public void i_click_on_employee_login_button() {

        click(Employee_LoginPage.employeeLoginButton);

    }

    @Then("Verify I am In Employee Home Page")
    public void verify_i_am_in_employee_home_page() {
        String welcomeMsg = getText(Employee_HomePage.employeeWelcomeMsg);
        assertEquals("Welcome Test", welcomeMsg);

    }

    @And("I Logout from Employee Home Page")
    public void i_Logout_from_Employee_Home_Page() {
        click(Employee_HomePage.logOut);

    }
}
