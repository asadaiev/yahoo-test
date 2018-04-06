package simpletest;

import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class GoogleMainPage {


    private final WebDriver driver;

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public GoogleMainPage openGoogleMain(){
        driver.get("http://google.com");
        return this;
    }

    public GoogleMainPage checkIfGoogle(){
        assertTrue(driver.getTitle().equals("Google"));
        return this;
    }


}
