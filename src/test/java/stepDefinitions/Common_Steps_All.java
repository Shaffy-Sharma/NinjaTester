package stepDefinitions;

import Drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageFactory.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.LoggerLoad;

import static org.testng.Assert.assertEquals;

public class Common_Steps_All {

    WebDriver driver;
    SignIn_Page signin = new SignIn_Page();
    GetStarted_Page getStartedPage = new GetStarted_Page();
    Home_Page homePage = new Home_Page();
    Array_Page arrayPage = new Array_Page();
    Queue_Page qpage = new Queue_Page();
    Tree_Page treePage = new Tree_Page();

    //Graph_Page graph = new Graph_Page();


    public Common_Steps_All() {
        driver = DriverFactory.getDriver();
    }


    @Given("The user is on Signin page of DS Algo portal")
    public void the_user_is_on_signin_page_of_ds_algo_portal() {
        LoggerLoad.info("User Is on Login Page");
        signin.getLoginurl();
    }

    @When("The user enters valid {string} and {string} and clicks on login button")
    public void the_user_enter_valid_and_and_clicks_on_login_button(String username, String password) {
        LoggerLoad.info("User Enters username and password");
        signin.enterUsername(username);
        signin.enterPassword(password);
        signin.clickLogin();
    }

    @Then("The user redirected to homepage")
    public void the_user_redirected_to_homepage() {
        String expectedTitle = "NumpyNinja"; // Or actual title of Home page
        String actualTitle = driver.getTitle();
        LoggerLoad.info("User is on the Home Page. Title: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "User is not on the Home Page.");
    }

//    @Given("The user is on Home page after logged in")
//    public void the_user_is_on_home_page_after_logged_in() {
//        String Title = home.getTitleofPage();
//        LoggerLoad.info("Title of current page is " + Title);
//
//    }

//    @Then("User redirected to {string} page")
//    public void user_redirected_to_page(String string) {
//        LoggerLoad.info("The User redirected to " + string + "Page");
//        String title = qpage.getPageTitle();
//        LoggerLoad.info("Title of the Current Page is " + title);
//        assertEquals(title, string);
//    }

}