package stepDefinitions;

import Drivers.DriverFactory;
import PageFactory.Home_Page;
import PageFactory.Tree_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;

import java.io.IOException;
import java.time.Duration;

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

    // Scenario: Verify that user is able to navigate to "Tree" page
    @Given("The user is in the Home page after Sign in")
    public void the_user_is_in_the_home_page_after_sign_in() {
        String expectedTitle = "NumpyNinja";
        String actualTitle = driver.getTitle();
        LoggerLoad.info("Verifying home page. Current title: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "User is not on the Home Page.");
    }

    @When("User clicks the Get Started button in the Tree page")
    public void user_clicks_the_get_started_button_in_the_tree_page() {
        homePage.selectTree();
        LoggerLoad.info("Clicked Get Started on Tree page");
    }

    @Then("User should be redirected to the {string} page")
    public void user_should_be_redirected_to_the_page(String expectedTitle) {
        LoggerLoad.info("User should be redirected to the tree page");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LoggerLoad.info("Page title verified: " + actualTitle);
    }


    //Scenario: Verify if user able to navigate "Overview of Trees" page
    @Given("The  user is on the Tree page after logged in")
    public void the_user_is_on_the_tree_page_after_logged_in() {
        homePage.selectTree();
        LoggerLoad.info("User is on the Tree page.");
    }

    @When("The user clicks Overview of Trees link")
    public void the_user_clicks_overview_of_trees_link() {
        treePage.verifyOverviewOfTreeLink();
        LoggerLoad.info("Clicked Overview of Trees");
    }

    @Then("The user should be redirected to the {string} page")
    public void the_user_should_be_redirected_to_the_page(String expectedTitle) {
        LoggerLoad.info("User should be redirected to the Overview of Trees page");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        LoggerLoad.info("Page title verified: " + actualTitle);
    }

    // Scenario: Verify if user able to redirect to a "tryEditor" page from overview of trees page
    @Given("The user is in the Overview of Trees Page")
    public void the_user_is_in_the_overview_of_trees_page() {
        homePage.selectTree();
        treePage.verifyOverviewOfTreeLink();
        LoggerLoad.info("User is on the Overview of Trees page...");
        String expectedTitle = "Overview of Trees";
        String actualTitle = driver.getTitle();
        LoggerLoad.info("Current Page Title: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "User is not on the Overview of Trees page.");
    }

    @When("The user clicks Try Here button in Tree page")
    public void the_user_clicks_try_here_button_in_tree_page() {
        treePage.verifyTryHereLink();
    }

    @Then("The user should be redirected to a Tree page having an tryEditor with a Run button to test")
    public void the_user_should_be_redirected_to_a_tree_page_having_an_try_editor_with_a_run_button_to_test() {
        Assert.assertEquals(driver.getTitle(), "Assessment");
        LoggerLoad.info("User is in tryEditor page");
    }

    // Scenario: Verify if user able to see the output in console
    @Given("The user is on the Tree tryEditor page")
    public void the_user_is_on_the_tree_try_editor_page() {
        LoggerLoad.info("Navigating to Tree TryEditor page...");
        homePage.selectTree();
        treePage.verifyOverviewOfTreeLink();
        treePage.verifyTryHereLink();
        LoggerLoad.info("User is on the Tree TryEditor page.");
    }

    @When("The user writes valid python code from sheet {string} and row {int} in tryEditor page")
    public void the_user_writes_valid_python_code_from_sheet_and_row_in_try_editor_page(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException {
        // Fetch code from Excel
        String pythonCode = util.getCodeFromExcel(sheetName, rowNumber);

        // Send the code to the Try Editor using Utility_Methods
        WebElement editor = treePage.getTextEditor();
        util.enterPythonCodeForPractice(pythonCode, editor);
        LoggerLoad.info("Valid Python code from Excel entered into the editor: Sheet = " + sheetName + ", Row = " + rowNumber);
    }

    @Then("User is able to see the output in console of Tree Page")
    public void user_is_able_to_see_the_output_in_console_of_tree_page() {
        treePage.outputConsole();
        LoggerLoad.info("user validated valid code in Tree page");
    }

    //Scenario: Verify if user able to see the error message in pop up window
    @When("The user writes invalid python code from sheet {string} and row {int} in tryEditor page")
    public void the_user_writes_invalid_python_code_from_sheet_and_row_in_try_editor_page(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException {
        LoggerLoad.info("Captured Error Message in pop up window ");
        // Fetch code from Excel
        String pythonCode = util.getCodeFromExcel(sheetName, rowNumber);

        // Send the code to the Try Editor using Utility_Methods
        WebElement editor = treePage.getTextEditor();
        util.enterPythonCodeForPractice(pythonCode, editor);
        LoggerLoad.info("Valid Python code from Excel entered into the editor: Sheet = " + sheetName + ", Row = " + rowNumber);
    }

    @Then("User is able to see the error message in Tree Page pop up window")
    public void user_is_able_to_see_the_error_message_in_tree_page_pop_up_window() {
        //treePage.getErrorMessage();
        treePage.verifyEditorOutput();
    }


    //Scenario: Verify if user able to navigate to "Terminologies" page
    @When("The user clicks Terminologies link in tree page")
    public void the_user_clicks_terminologies_link_in_tree_page() {
        treePage.verifyTerminologyLink();
    }

    @Then("The user should be redirected to the Terminologies Page")
    public void the_user_should_be_redirected_to_the_Overview_of_Trees_page() {
        String expectedTitle = "Terminologies";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    // Scenario: Verify if user able to direct to "Types of Trees"
    @When("The user clicks Types of Trees link")
    public void the_user_clicks_types_of_trees_link() {
        treePage.verifyTypesOfTreeLink();
    }

    @Then("The user should be redirected to the Types of Trees Page")
    public void the_user_should_be_redirected_to_the_types_of_trees_page() {
        String expectedTitle = "Types of Trees";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    // Scenario: Verify if user able to direct to "Tree Traversals"
    @When("The user clicks Tree Traversals link")
    public void the_user_clicks_tree_traversals_link() {
        treePage.verifyTreeTraversalLink();
    }

    @Then("The user should be redirected to the Tree Traversals Page")
    public void the_user_should_be_redirected_to_the_tree_traversals_page() {
        String expectedTitle = "Tree Traversals";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    // Scenario: Verify if user able to direct to "Traversals-Illustration"
    @When("The user clicks Traversals-Illustration link")
    public void the_user_clicks_traversals_illustration_link() {
        treePage.verifyTravelIllustrateLink();
    }

    @Then("The user should be redirected to the Traversals-Illustration Page")
    public void the_user_should_be_redirected_to_the_tree_traversals_traversals_illustration_page() {
        String expectedTitle = "Traversals-Illustration";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    // Scenario: Verify if user able to direct to "Binary Trees"
    @When("The user clicks Binary Trees link")
    public void the_user_clicks_binary_trees_link() {
        treePage.verifyBinaryTreeLink();
    }

    @Then("The user should be redirected to the Binary Trees Page")
    public void the_user_should_be_redirected_to_the_binary_trees_page() {
        String expectedTitle = "Binary Trees";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    //Scenario: Verify if user able to direct to "Types of Binary Trees"
    @When("The user clicks Types of Binary Trees link")
    public void the_user_clicks_types_of_binary_trees_link() {
        treePage.verifyTypesOfBinaryLink();
    }

    @Then("The user should be redirected to the Types of Binary Trees Page")
    public void the_user_should_be_redirected_to_the_types_of_binary_trees_page() {
        String expectedTitle = "Types of Binary Trees";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


   // Scenario: Verify if user able to direct to "Implementation in Python"
    @When("The user clicks Implementation in Python link")
    public void the_user_clicks_implementation_in_python_link() {
        treePage.verifyImplementPythonLink();
    }

    @Then("The user should be redirected to the Implementation in Python Page")
    public void the_user_should_be_redirected_to_the_implementation_in_python_page() {
        String expectedTitle = "Implementation in Python";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    //Scenario: Verify if user able to direct to "Binary Tree Traversals"
    @When("The user clicks Binary Tree Traversals link")
    public void the_user_clicks_binary_tree_traversals_link() {
        treePage.verifyBinaryTreeTraversalsLink();
    }

    @Then("The user should be redirected to the Binary Tree Traversals Page")
    public void the_user_should_be_redirected_to_the_binary_tree_traversals_page() {
        String expectedTitle = "Binary Tree Traversals";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    //Scenario: Verify if user able to direct to "Implementation of Binary Trees"
    @When("The user clicks Implementation of Binary Trees link")
    public void the_user_clicks_implementation_of_binary_trees_link() {
        treePage.verifyImplementationOfBinaryTreesLink();
    }

    @Then("The user should be redirected to the Implementation of Binary Trees Page")
    public void the_user_should_be_redirected_to_the_implementation_of_binary_trees_page() {
        String expectedTitle = "Implementation of Binary Trees";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    //Scenario: Verify if user able to direct to "Applications of Binary trees"
    @When("The user clicks Applications of Binary trees link")
    public void the_user_clicks_applications_of_binary_trees_link() {
        treePage.verifyApplicationsOfBinaryTreesLink();
    }

    @Then("The user should be redirected to the Applications of Binary trees Page")
    public void the_user_should_be_redirected_to_the_applications_of_binary_trees_page() {
        String expectedTitle = "Applications of Binary trees";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    // Scenario: Verify if user able to direct to "Binary Search Trees"
    @When("The user clicks Binary Search Trees link")
    public void the_user_clicks_binary_search_trees_link() {
        treePage.verifyBinarySearchTreesLink();
    }

    @Then("The user should be redirected to the Binary Search Trees Page")
    public void the_user_should_be_redirected_to_the_binary_search_trees_page() {
        String expectedTitle = "Binary Search Trees";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    // Scenario: Verify if user able to direct to "Implementation Of BST"
    @When("The user clicks Implementation Of BST link")
    public void the_user_clicks_implementation_of_bst_link() {
        treePage.verifyImplementationOfBSTLink();
    }

    @Then("The user should be redirected to the Implementation Of BST Page")
    public void the_user_should_be_redirected_to_the_implementation_Of_bst_page() {
        String expectedTitle = "Implementation Of BST";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }



    //Scenario: The user is able to click and navigate to "Practice Questions"
    @Given("The user is in the Implementation Of BST Page")
    public void the_user_is_in_the_implementation_of_bst_page() {
        homePage.selectTree();
        treePage.verifyImplementationOfBSTLink();
        LoggerLoad.info("User is on the Implementation Of BST page...");
        String expectedTitle = "Implementation Of BST";
        String actualTitle = driver.getTitle();
        LoggerLoad.info("Current Page Title: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "User is not on the Implementation Of BST page.");
    }

    @When("The user clicks Trees Practice Questions link")
    public void the_user_clicks_trees_practice_questions_link() {
        treePage.verifyPracticeQuestionsLink();
    }

    @Then("The user is redirected to Trees Practice Questions page")
    public void the_user_is_redirected_to_trees_practice_questions_page() {
        LoggerLoad.info("User is on the Trees Practice Questions page...");
        String expectedTitle = "Practice Questions";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
