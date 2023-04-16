package stepdefinitions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import java.util.Date;
public class CommonStepDefinitions {
    @Given("I set Configuration.screenshot to false")
    public void i_set_configuration_screenshot_to_false() {
        // will not take the screenshot even if the test case fails
        Configuration.screenshots = false;
    }
    @Given("I capture the screenshot of the page")
    public void i_capture_the_screenshot_of_the_page() {
        Selenide.screenshot("images");// Or simply
        // screenshot(new Date().toString());// giving a dynamic name
    }
    @Given("I open the {string} browser")
    public void iOpenTheBrowser(String browserType) {
        switch (browserType){
            case "headless":
                Configuration.headless = true;
                break;
            case "firefox":
                Configuration.browser = "firefox";
                break;
            case "safari":
                Configuration.browser = "safari";
                break;
            case "edge":
                Configuration.browser = "edge";
                break;
            default:
                Configuration.browser= "chrome";
                break;
        }
    }
}
