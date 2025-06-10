package stepDefinitions;

import Drivers.DriverFactory;
import PageFactory.Home_Page;
import PageFactory.Tree_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;

import java.io.IOException;

import static org.testng.Assert.assertEquals;


public class Tree_Steps {

    WebDriver driver;
    Tree_Page treePage;
    Home_Page homePage;
    Utility_Methods util=new Utility_Methods();

    public Tree_Steps(){
        driver = DriverFactory.getDriver();
        treePage = new Tree_Page();
        homePage = new Home_Page();
    }

    @Given("The user is on the DS Algo SignIn Page")
    public void the_user_is_on_the_ds_algo_sign_in_page() {
        homePage.clickSignIn();
        LoggerLoad.info("User landed on SignIn page!");
    }

    @When("The user clicks login button after entering valid {string} and valid {string}")
    public void the_user_clicks_login_button_after_entering_valid_and_valid(String username, String password) {
        homePage.clickSignIn();
        treePage.login(username, password);
       LoggerLoad.info("User logged in with valid credentials");
    }

    @Then("The user should land on Home Page")
    public void the_user_should_land_on_home_page() {
        homePage.homepage();
        LoggerLoad.info("User landed on Home Page");
    }

    @When("User clicks the Get Started button in the Tree page")
    public void user_clicks_the_get_started_button_in_the_tree_page() {
        homePage.clickGetStartedOnHomePage("Tree");
        LoggerLoad.info("Clicked Get Started on Tree page");
    }

    @Then("User should be redirected to the {string} page")
    public void user_should_be_redirected_to_the_page(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LoggerLoad.info("Page title verified: " + actualTitle);
    }

    @Given("The  user is on the Tree page after logged in")
    public void the_user_is_on_the_tree_page_after_logged_in() {
        boolean isOnTreePage = treePage.getTitleOfPage("Tree");
        Assert.assertTrue(isOnTreePage, "User is not on the Tree page");
        LoggerLoad.info("User is successfully on the Tree page after login.");
    }

    @When("The user clicks Overview of Trees link")
    public void the_user_clicks_overview_of_trees_link() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyOverviewOfTreeLink();
        LoggerLoad.info("Clicked Overview of Trees");
    }

    @Then("The user should be redirected to the Overview of Trees page")
    public void the_user_should_be_redirected_to_the_Overview_of_Trees_page(String pageName) {
        String Tittle = driver.getTitle();
        assertEquals(Tittle, pageName);
    }

    @Given("The user is in the Overview of Trees Page")
    public void the_user_is_in_the_overview_of_trees_page() {
        treePage.navigateToTreeTopic("overviewOfTrees");
        LoggerLoad.info("User is on the Overview of Trees page.");
    }

//    @When("The user clicks Try Here button in Tree page")
//    public void the_user_clicks_try_here_button_in_tree_page() {
//
//    }

    @Then("The user should be redirected to a Tree page having an tryEditor with a Run button to test")
    public void the_user_should_be_redirected_to_a_tree_page_having_an_try_editor_with_a_run_button_to_test() {
        Assert.assertEquals(driver.getTitle(), "Assessment");
        LoggerLoad.info("User is in tryEditor page");
    }

    @Given("The user is on the Tree tryEditor page")
    public void the_user_is_on_the_tree_try_editor_page() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyOverviewOfTreeLink();
        treePage.verifyEditorOutput();
    }

    @When("The user writes valid python code in tryEditor page")
    public void the_user_writes_valid_python_code_in_try_editor_page() throws IOException, InvalidFormatException {
        String sheetName = "Tree";  // adjust if different
        int rowNum = 0;

        Utility_Methods util = new Utility_Methods();
        Tree_Page treePage = new Tree_Page();

        // Fetch code from Excel
        String pythonCode = util.getCodefromExcel(sheetName, rowNum);

        // Use Utility_Methods to send the code to the Try Editor
        WebElement editor = treePage.getTextEditor();
        util.enterPythonCodeForPractice(pythonCode, editor);
        LoggerLoad.info("Valid Python code from Excel entered into the editor.");
    }

    @Then("User is able to see the output in console of Tree Page")
    public void user_is_able_to_see_the_output_in_console_of_tree_page() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyOverviewOfTreeLink();
        treePage.verifyTryHereLink();
        treePage.outputConsole();
        LoggerLoad.info("user validated valid code in Tree page");
    }

    @Given("The user is on the tryEditor page")
    public void the_user_is_on_the_try_editor_page() {
        treePage.verifyOverviewOfTreeLink();
        treePage.verifyTryHereLink();
        LoggerLoad.info("User navigated to Try Editor page.");

        // Optionally, validate the URL
        boolean isCorrectPage = treePage.isOnExpectedURL(ConfigReader.tryEditorURL());
        Assert.assertTrue(isCorrectPage, "User is not on Try Editor page");
    }

    @When("The user writes invalid python code in tryEditor page")
    public void the_user_writes_invalid_python_code_in_try_editor_page() {
        String error = treePage.getErrorMessage();
        LoggerLoad.info("Captured Error Message: " + error);
    }

    @Then("User is able to see the error message in Tree Page pop up window")
    public void user_is_able_to_see_the_error_message_in_tree_page_pop_up_window() {
        treePage.getErrorMessage();
    }

    @When("The user clicks Terminologies link in tree page")
    public void the_user_clicks_terminologies_link_in_tree_page() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyTerminologyLink();
    }

    @Then("The user should be redirected to {string} Page")
    public void the_user_should_be_redirected_to_page(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LoggerLoad.info("Page title verified: " + actualTitle);
    }

    @Given("The user is in the Terminologies page")
    public void the_user_is_in_the_terminologies_page() {
        treePage.navigateToTreeTopic("terminologies");
        LoggerLoad.info("User is on the terminologies page.");
    }

    @When("The user clicks Try Here button in Tree Page")
    public void the_user_clicks_try_here_button_in_tree_page() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyTerminologyLink();
        treePage.verifyTryHereLink();

    }

//    @When("The user writes valid python code in Tree Page")
//    public void the_user_writes_valid_python_code_in_tree_page() {
//
//    }

    @When("The user writes invalid python code in Tree Page")
    public void the_user_writes_invalid_python_code_in_tree_page() throws IOException, InvalidFormatException {
        String sheetName = "Tree";
        int rowNum = 1;

        String invalidCode = util.getCodefromExcel(sheetName, rowNum);
        util.enterPythonCodeForPractice(invalidCode, treePage.getTextEditor());
        LoggerLoad.info("Invalid Python code from Excel entered into the editor.");
    }

    @Then("User is able to see the error msg in  Tree Page pop up window")
    public void user_is_able_to_see_the_error_msg_in_tree_page_pop_up_window() {
        treePage.getErrorMessage();
    }

    @When("The user clicks Types of Trees link")
    public void the_user_clicks_types_of_trees_link() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyTypesOfTreeLink();
    }

    @Then("The user should be redirected to the Types of Trees Page")
    public void the_user_should_be_redirected_to_the_types_of_trees_page(String pageName) {
        String Tittle = driver.getTitle();
        assertEquals(Tittle, pageName);
    }

    @Given("The user is in the Types of Trees Page")
    public void the_user_is_in_the_types_of_trees_page() {
        treePage.navigateToTreeTopic("typesOfTrees");
        LoggerLoad.info("User is on the types Of Trees page.");
    }

    @When("The User writes valid python code in Tree Page")
    public void the_user_writes_valid_python_code_in_tree_page() throws IOException, InvalidFormatException {
        String sheetName = "Tree";  // adjust if different
        int rowNum = 0;

        Utility_Methods util = new Utility_Methods();
        Tree_Page treePage = new Tree_Page();

        // Fetch code from Excel
        String pythonCode = util.getCodefromExcel(sheetName, rowNum);

        // Use Utility_Methods to send the code to the Try Editor
        WebElement editor = treePage.getTextEditor();
        util.enterPythonCodeForPractice(pythonCode, editor);
        LoggerLoad.info("Valid Python code from Excel entered into the editor.");
    }

    @When("The user clicks Tree Traversals link")
    public void the_user_clicks_tree_traversals_link() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyBinaryTreeTraversalsLink();
    }

    @Then("The user should be redirected to the Tree Traversals Page")
    public void the_user_should_be_redirected_to_the_tree_traversals_page(String pageName) {
        String Tittle = driver.getTitle();
        assertEquals(Tittle, pageName);
    }

    @Given("The user is in the Tree Traversals Page")
    public void the_user_is_in_the_tree_traversals_page() {
        treePage.navigateToTreeTopic("treeTraversals");
        LoggerLoad.info("User is on the tree traversals page.");
    }

    @When("The user clicks Traversals-Illustration link")
    public void the_user_clicks_traversals_illustration_link() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyTravelIllustrateLink();
    }

    @Then("The user should be redirected to the Traversals-Illustration Page")
    public void the_user_should_be_redirected_to_the_traversals_illustration_page(String pageName) {
        String Tittle = driver.getTitle();
        assertEquals(Tittle, pageName);
    }

    @Given("The user is in the Traversals-Illustration Page")
    public void the_user_is_in_the_traversals_illustration_page() {
        treePage.navigateToTreeTopic("traversalsIllustration");
        LoggerLoad.info("User is on the traversals Illustration page.");
    }

    @When("The user clicks Binary Trees link")
    public void the_user_clicks_binary_trees_link() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyBinaryTreeLink();
    }

    @Then("The user should be redirected to the Binary Trees Page")
    public void the_user_should_be_redirected_to_the_binary_trees_page(String pageName) {
        String Tittle = driver.getTitle();
        assertEquals(Tittle, pageName);
    }

    @Given("The user is in the Binary Trees Page")
    public void the_user_is_in_the_binary_trees_page() {
        treePage.navigateToTreeTopic("binaryTrees");
        LoggerLoad.info("User is on the binary trees page.");
    }

    @When("The user clicks Types of Binary Trees link")
    public void the_user_clicks_types_of_binary_trees_link() {
        treePage.verifyBinaryTreeLink();
    }

    @Then("The user should be redirected to the Types of Binary Trees Page")
    public void the_user_should_be_redirected_to_the_types_of_binary_trees_page(String pageName) {
        String Tittle = driver.getTitle();
        assertEquals(Tittle, pageName);
    }

    @Given("The user is in the Types of Binary Trees Page")
    public void the_user_is_in_the_types_of_binary_trees_page() {
        treePage.navigateToTreeTopic("typesOfBinaryTrees");
        LoggerLoad.info("User is on the types Of Binary Trees page.");
    }

    @When("The user clicks Implementation in Python link")
    public void the_user_clicks_implementation_in_python_link() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyImplementPythonLink();
    }

    @Then("The user should be redirected to the Implementation in Python Page")
    public void the_user_should_be_redirected_to_the_implementation_in_python_page(String pageName) {
        String Tittle = driver.getTitle();
        assertEquals(Tittle, pageName);
    }

    @Given("The user is in the Implementation in Python Page")
    public void the_user_is_in_the_implementation_in_python_page() {
        treePage.navigateToTreeTopic("implementationInPython");
        LoggerLoad.info("User is on the types Of implementation in python page.");
    }

    @When("The user clicks Binary Tree Traversals link")
    public void the_user_clicks_binary_tree_traversals_link() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyBinaryTreeTraversalsLink();
    }

    @Then("The user should be redirected to the Binary Tree Traversals Page")
    public void the_user_should_be_redirected_to_the_binary_tree_traversals_page(String pageName) {
        String Tittle = driver.getTitle();
        assertEquals(Tittle, pageName);
    }

    @Given("The user is in the Binary Tree Traversals Page")
    public void the_user_is_in_the_binary_tree_traversals_page() {
        treePage.navigateToTreeTopic("binaryTreeTraversals");
        LoggerLoad.info("User is on the types Of binary Tree Traversals page.");
    }

    @When("The user clicks Implementation of Binary Trees link")
    public void the_user_clicks_implementation_of_binary_trees_link() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyImplementationOfBinaryTreesLink();
    }

    @Then("The user should be redirected to the Implementation of Binary Trees Page")
    public void the_user_should_be_redirected_to_the_implementation_of_binary_trees_page(String pageName) {
        String Tittle = driver.getTitle();
        assertEquals(Tittle, pageName);
    }

    @Given("The user is in the Implementation of Binary Trees Page")
    public void the_user_is_in_the_implementation_of_binary_trees_page() {
        treePage.navigateToTreeTopic("implementationOfBinaryTrees");
        LoggerLoad.info("User is on the types Of implementation Of Binary Trees page.");
    }

    @When("The user clicks Applications of Binary trees link")
    public void the_user_clicks_applications_of_binary_trees_link() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyApplicationsOfBinaryTreesLink();
    }

    @Then("The user should be redirected to the Applications of Binary trees Page")
    public void the_user_should_be_redirected_to_the_applications_of_binary_trees_page(String pageName) {
        String Tittle = driver.getTitle();
        assertEquals(Tittle, pageName);
    }

    @Given("The user is in the Applications of Binary trees Page")
    public void the_user_is_in_the_applications_of_binary_trees_page() {
        treePage.navigateToTreeTopic("applicationsOfBinaryTrees");
        LoggerLoad.info("User is on the types Of applications Of Binary Trees page.");
    }

    @When("The user clicks Binary Search Trees link")
    public void the_user_clicks_binary_search_trees_link() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyBinarySearchTreesLink();
    }

    @Then("The user should be redirected to the Binary Search Trees Page")
    public void the_user_should_be_redirected_to_the_binary_search_trees_page(String pageName) {
        String Tittle = driver.getTitle();
        assertEquals(Tittle, pageName);
    }

    @Given("The user is in the Binary Search Trees Page")
    public void the_user_is_in_the_binary_search_trees_page() {
        treePage.navigateToTreeTopic("binarySearchTrees");
        LoggerLoad.info("User is on the types Of binary Search Trees page.");
    }

    @When("The user clicks Implementation Of BST link")
    public void the_user_clicks_implementation_of_bst_link() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyImplementationOfBSTLink();
    }

    @Then("The user should be redirected to the Implementation Of BST Page")
    public void the_user_should_be_redirected_to_the_implementation_of_bst_page(String pageName) {
        String Tittle = driver.getTitle();
        assertEquals(Tittle, pageName);
    }

    @Given("The user is in the Implementation Of BST Page")
    public void the_user_is_in_the_implementation_of_bst_page() {
        treePage.navigateToTreeTopic("implementationOfBST");
        LoggerLoad.info("User is on the types Of implementation Of BST page.");
    }

    @When("The user clicks Trees Practice Questions link")
    public void the_user_clicks_trees_practice_questions_link() {
        homePage.clickGetStartedOnHomePage("Tree");
        treePage.verifyOverviewOfTreeLink();
        treePage.verifyPracticeQuestionsLink();
    }

    @Then("The user is redirected to Trees Practice Questions page")
    public void the_user_is_redirected_to_trees_practice_questions_page(String pageName) {
        String Tittle = driver.getTitle();
        assertEquals(Tittle, pageName);
    }
}
