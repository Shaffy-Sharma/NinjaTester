package PageFactory;

import Drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;

import java.time.Duration;

public class GetStarted_Page {

    private WebDriver driver;
    private WebDriverWait wait;

    // initializing page objects
    public GetStarted_Page (){
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Locators
    @FindBy(xpath ="//button[@class='btn']")
    private WebElement getStartedBtn;


    public void dsAlgoPortal() {
        driver.get(ConfigReader.baseUrl());   // <‑‑ picked up from properties
    }

    public void navigateToHomePage(){
        getStartedBtn.click();
    }

}
