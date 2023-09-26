package stepDefinitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Employee_LoginPage;

import static org.junit.Assert.assertEquals;

public class Verify_Invalid_EmployeeLoginFunctionality extends Base {

    @Then("I Enter Invalid Employee User Id")
    public void i_Enter_Invalid_Employee_User_Id() throws InterruptedException {

        sendKeys(Employee_LoginPage.invalidEmployeeUserId,"asdfg@hotmail.com");
        Thread.sleep(1000);
    }

    @And("I Enter Invalid Employee Password")
    public void i_Enter_Invalid_Employee_Password() throws InterruptedException {
       sendKeys(Employee_LoginPage.invalidEmployeePassword,"8989");
       Thread.sleep(1000);
    }

    @When("I click on with Invalid Id or Password Employee Login Button")
    public void i_click_on_with_Invalid_Id_or_Password_Employee_Login_Button() throws InterruptedException {
        click(Employee_LoginPage.employeeLoginButton);
        Thread.sleep(1000);

    }

    @And("I can See Error Employee Login Message")
    public void i_can_See_Error_Employee_Login_Message() {
       String errorText = getText(Employee_LoginPage.invalidEmployeeLoginMessage);
       assertEquals("Invalid username or password!", errorText);
    }


}
