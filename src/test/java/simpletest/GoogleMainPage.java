package simpletest;

import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GoogleMainPage {


    private final WebDriver driver;

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public GoogleMainPage openGoogleMain() {
        driver.get("http://google.com");
        return this;
    }

    public GoogleMainPage checkIfGoogle() {
        assertThat(driver.getTitle(), equalTo("Google"));
        return this;
    }

    public GoogleMainPage checkIfYahoo() {
        assertThat(driver.getTitle(), equalTo("Yahoo"));
        return this;
    }


}
