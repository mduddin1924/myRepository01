package pages;

import base.Base;
import org.openqa.selenium.By;

public class Employee_UpdateInfoPage extends Base {
    public static By updateContact = By.xpath("//input[@name='contact']");

    public static By updateAddress = By.xpath("//input[@name='address']");

    public static By submitButton = By.xpath("//button[text()='Submit']");


}
