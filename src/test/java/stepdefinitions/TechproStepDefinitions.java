package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.TestPage;
import static com.codeborne.selenide.Selenide.*;
public class TechproStepDefinitions {
    TestPage testPage = new TestPage();
    @Given("I get the title of the current page and verify if it contains {string}")
    public void i_get_the_title_of_the_current_page_and_verify_if_it_contains(String string) {

        // getting the title of the page
        Assert.assertTrue(title().contains(string));
    }

    // Screenshot of programs elements
    @And("I capture the screenshot of the program pop up")
    public void iCaptureTheScreenshotOfTheProgramPopUp() {
        try {
            testPage.upcomingProgram.screenshot();
        } catch (Exception e) {

        }
    }
}