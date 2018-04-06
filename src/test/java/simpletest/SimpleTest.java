package simpletest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class SimpleTest {


    private WebDriver driver;

    @Test
    public void TestOpenGoogle() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        GoogleMainPage openPage =
                new GoogleMainPage(driver)
                        .openGoogleMain()
                        .checkIfGoogle();
        driver.quit();
    }

    @Test
    public void TestOpenYahoo() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();

        GoogleMainPage openPage =
                new GoogleMainPage(driver)
                        .openGoogleMain()
                        .checkIfYahoo();
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
    }
}

