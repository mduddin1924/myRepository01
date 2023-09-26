package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Then;
import pages.Landing_Page;

import static org.junit.Assert.assertEquals;

public class LandingPage_Functionality extends Base {

    @Then("I can see Homepage logo")
    public void i_can_see_Homepage_logo() {
        boolean text = isDisplayedElement(Landing_Page.homePageLogo);
        System.out.println("Home Page Logo is: Microtech NA = " + text);


    }

    @Then("I can see Welcome Message")
    public void i_can_see_Welcome_Message() throws InterruptedException {
        boolean welcomeText = isDisplayedElement(Landing_Page.welcomeText);
        System.out.println("Welcome Text: Welcome to MicroTech NA. = " + welcomeText);
        Thread.sleep(1000);
    }

    @Then("I can see Wrong Slogan")
    public void i_can_see_Wrong_Slogan() {
        String wrongSlogan = getText(Landing_Page.wrongSlogan);
        assertEquals("Your One Stop Soloution", wrongSlogan);
        System.out.println("Wrong Slogan: " + "Your One Stop Soloution");

    }

}