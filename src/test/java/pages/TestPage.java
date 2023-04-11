package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class TestPage {
    // This is my TestCenter page class
    // All objects TestCenter page will go here

    // Locating the element using function
    // public SelenideElement username(){
    //    return $(By.id("exampleInputEmail1"));
    //}

    // Alternative Way
    // WebElement -> SelenideElement
    public SelenideElement username = $(By.id("exampleInputEmail1"));
    public SelenideElement password = $(By.id("exampleInputPassword1"));
    public SelenideElement submitButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement logOutLink = $(By.partialLinkText("Logout"));

    // Locating Checkboxes
    public SelenideElement checkbox1 = $(By.id("box1"));
    public SelenideElement checkbox2 = $(By.id("box2"));

    // Locating Radios
    public SelenideElement red =  $(By.id("red"));
    public SelenideElement yellow = $(By.id("yellow"));
    public SelenideElement football = $(By.id("football"));

    // Locating Dropdown Elements
    public SelenideElement year = $(By.id("year"));
    public SelenideElement month = $(By.id("month"));
    public SelenideElement day = $(By.id("day"));

    public ElementsCollection allStates = $$(By.xpath("//select[@id='state']//option"));

    // Alert Elements
    public SelenideElement jsPromptButton = $(By.xpath("//button[@onclick='jsPrompt()']"));
    public SelenideElement result = $(By.id("result"));

    public SelenideElement pageHeader = $(By.xpath("//h3"));
    public SelenideElement backToTechpro = $(By.xpath("//a[@type='button']"));

    // Actions
    public SelenideElement source = $(By.id("draggable"));
    public SelenideElement target = $(By.id("droppable"));

    // Explicit Wait
    public SelenideElement startButton = $(By.xpath("//div[@id='start']//button"));
    public SelenideElement helloWorld = $(By.xpath("//div[@id='finish']//h4"));

    // Screenshot
    public SelenideElement upcomingProgram = $(By.id("MjI4NDoxMDk1-1"));
}
