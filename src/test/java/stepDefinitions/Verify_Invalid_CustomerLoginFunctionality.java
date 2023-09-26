package stepDefinitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Customer_LoginPage;

import static org.junit.Assert.assertEquals;

public class Verify_Invalid_CustomerLoginFunctionality extends Base {

    @Then("I Enter Invalid Customer User Id")
    public void i_Enter_Invalid_Customer_User_Id() throws InterruptedException {

        sendKeys(Customer_LoginPage.invalidCustomerUserId, "abcd@yahoo.com");
        Thread.sleep(1000);
    }

    @And("I Enter Invalid Customer User Password")
    public void i_Enter_Invalid_Customer_User_Password() throws InterruptedException {

        sendKeys(Customer_LoginPage.invalidCustomerPassword, "2345");
        Thread.sleep(1000);
    }

    @When("I click on with Invalid Id or Password Customer Login Button")
    public void i_click_on_with_Invalid_Id_or_Password_Customer_Login_Button() throws InterruptedException {

        click(Customer_LoginPage.customerLoginBtn);
        Thread.sleep(1000);
    }

    @And("I can see Customer Error Login Message")
    public void i_can_see_Customer_Error_Login_Message() {

        String errorMsg = getText(Customer_LoginPage.customerErrorLoginMessage);
        assertEquals("Invalid username or password!", errorMsg);
    }


}
