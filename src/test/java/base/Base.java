package base;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;


public class Base {
    public static WebDriver driver;

    public static void navigate(String url) {

        driver.get(url);
    }

    public static void click(By locator) {

        driver.findElement(locator).click();
    }

    public static void sendKeys(By locator, String keys) {

        driver.findElement(locator).sendKeys(keys);
    }

    public static String getText(By locator) {

        String s = driver.findElement(locator).getText();
        return s;
    }

    public static boolean isDisplayedElement(By locator) {

        WebElement element = driver.findElement(locator);
        boolean b = element.isDisplayed();
        return b;
    }


    public static void clear(By locator) {

        driver.findElement(locator).clear();
    }

    public static void dropDownValue(By locator, String value) {

        Select select = new Select(driver.findElement(locator));
        select.selectByValue(value);
    }

    public static void dropDownText(By locator, String text) {

        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(text);
    }

    public static void dropDownIndex(By locator, int index) {

        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(index);

    }


    public static void mouseHover(By locator) {

        WebElement element = driver.findElement(locator);
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
        act.contextClick();

    }
    public static void screenShotName(WebDriver driver, String name) throws IOException {
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File(".\\screenShot\\"+name+".png"));
    }
}

//        actions class: used for keyboard and mouse functions
//        Actions act = new Actions(driver);
//        act.sendKeys(Keys.ESCAPE).build().perform();






