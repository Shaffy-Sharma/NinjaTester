package stepDefinitions;

import Drivers.DriverFactory;
import PageFactory.GetStarted_Page;
import PageFactory.Home_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.LoggerLoad;

public class GetStartedPage_Steps {

    WebDriver driver;
    GetStarted_Page getStartedPage;

    public GetStartedPage_Steps () {
        driver = DriverFactory.getDriver();
        getStartedPage = new GetStarted_Page();
    }

    @Given("The user is on the DS Algo portal")
    public void the_user_is_on_the_ds_algo_portal() {
        LoggerLoad.info("DSAlgo Portal");
        getStartedPage.dsAlgoPortal();
    }

    @When("The user clicks the Get Started button")
    public void the_user_clicks_the_get_started_button() {
        getStartedPage.navigateToHomePage();
    }

    @Then("The user should land on DSAlgo Homepage.")
    public void the_user_should_land_on_ds_algo_homepage() {
        String expectedTitle = "NumpyNinja";
        String actualTitle = driver.getTitle();
        LoggerLoad.info("User is on the Home Page. Title: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "User is not on the Home Page.");
    }
}
