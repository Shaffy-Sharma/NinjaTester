package stepDefinitions;

import PageFactory.Home_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import utilities.LoggerLoad;

import static org.testng.Assert.assertEquals;

public class Home_Steps {

    private final static Logger logger = LogManager.getLogger(Home_Steps.class);

    Home_Page homePage = new Home_Page();

    @Given("The user is on the DS Algo portal")
    public void the_user_is_on_the_ds_algo_portal() {
        logger.info("DSAlgo Portal");
        homePage.dsAlgoPortal();
    }

    @When("The user clicks the Get Started button")
    public void the_user_clicks_the_get_started_button() {
        homePage.clickGetStartedBtn();
    }

    @Then("The user should be navigated to the Data Structure Introduction page, which displays the Register and Sign in links.")
    public void the_user_should_be_navigated_to_the_data_structure_introduction_page_which_displays_the_register_and_sign_in_links() {
        Assert.assertTrue(homePage.isSignInAndRegisterVisible(), "Register and Sign In links are not visible.");
    }

    @Given("The user is on the Home page")
    public void the_user_is_on_the_home_page() {
        logger.info("User is on the Home Page");
        homePage.homepage();
    }

    @When("The user clicks datastructures dropdown and select")
    public void the_user_clicks_datastructures_dropdown_and_select() {
        homePage.isDropdownVisible();
    }

    @Then("The error message You are not logged in appears in homepage")
    public void the_error_message_you_are_not_logged_in_appears_in_homepage() {
        Assert.assertTrue(homePage.validateWarningUserNotLoggedIn(), "Warning message not shown.");
    }

    @When("The user clicks on Data Structure Get Started button on homepage")
    public void the_user_clicks_on_data_structure_get_started_button_on_homepage() {
        homePage.clickGetStartedOnHomePage("Data Structures-Introduction");
    }

    @When("The user clicks on signin link")
    public void the_user_clicks_on_signin_link() {
        logger.info("User Clicks on SignIn link");
        homePage.clickSignIn();
    }

    @Then("The user is redirected to login page")
    public void the_user_is_redirected_to_login_page() {
        logger.info("User redirected to Login page ");
        String Title = homePage.loginPage();
        logger.info("Title of current page is : " + Title);
        assertEquals(Title, "Login");
    }

    @When("The user clicks on register link")
    public void the_user_clicks_on_register_link() {
        logger.info("User Clicks on Register link");
        homePage.clickRegister();
    }

    @Then("The user redirected to Registration page")
    public void the_user_redirected_to_registration_page() {
        LoggerLoad.info("User redirected to Registraion page ");
        String Title = homePage.registerPage();
        LoggerLoad.info("Title of current page is : " + Title);
        assertEquals(Title, "Registration");
    }

    @When("The user clicks the Data Structures dropdown")
    public void the_user_clicks_the_data_structures_dropdown() {
        Assert.assertTrue(homePage.isDropdownVisible());
    }

    @Then("The user should able to see {int} options Arrays, Linked,List, Stack, Queue, Tree, Graph in dropdown menu")
    public void the_user_should_able_to_see_options_arrays_linked_list_stack_queue_tree_graph_in_dropdown_menu(Integer int1) {
        homePage.validateDataStructuresDropdown(); // Already asserts the count and content
    }

    @When("The user clicks datastructures dropdown and select {string}")
    public void the_user_clicks_datastructures_dropdown_and_select(String option) {
        homePage.validateEachDropdownInHomePage(option);
    }

    @Then("The user should redirected to Array page")
    public void the_user_should_redirected_to_array_page() {

    }

    @When("The user clicks on Arrays {string} button on homepage")
    public void the_user_clicks_on_arrays_button_on_homepage(String string) {

    }

}
