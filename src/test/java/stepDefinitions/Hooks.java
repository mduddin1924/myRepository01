package stepDefinitions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks extends Base {

    @Before
    public static void startUp() {

        WebDriverManager.chromedriver().setup();
        // ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        // driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Before Run");

    }

    @After
    public void tearDown() {
        //driver.close();// to close Current Browser Tab
        //driver.quit();// to close Browser Application or Windows
        System.out.println("After Run");

    }

}
