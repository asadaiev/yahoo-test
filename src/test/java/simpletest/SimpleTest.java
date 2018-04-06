package simpletest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import simpletest.pages.GoogleMainPage;


public class SimpleTest {


    private WebDriver driver;

    @BeforeClass
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");

    }

    @Test
    public void TestOpenGoogle() {
        driver = new ChromeDriver();
        GoogleMainPage openPage =
                new GoogleMainPage(driver)
                        .openGoogleMain()
                        .checkIfGoogle();
        driver.quit();
    }

    @Test
    public void TestOpenYahoo() {
        driver = new ChromeDriver();

        GoogleMainPage openPage =
                new GoogleMainPage(driver)
                        .openGoogleMain()
                        .checkIfYahoo();
        driver.quit();
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}

