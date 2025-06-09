package stepDefinitions;

import PageFactory.Tree_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class Tree_Steps {

    private final static Logger logger = LogManager.getLogger(Tree_Steps.class);

    Tree_Page treePage = new Tree_Page();


    @Given("The user is on the DS Algo SignIn Page")
    public void the_user_is_on_the_ds_algo_sign_in_page() {

    }

    @When("The user clicks login button after entering valid {string} and valid {string}")
    public void the_user_clicks_login_button_after_entering_valid_and_valid(String string, String string2) {

    }

    @Then("The user should land in Data Structure Home Page")
    public void the_user_should_land_in_data_structure_home_page() {

    }

    @When("User clicks the Get Started button in the Tree page")
    public void user_clicks_the_get_started_button_in_the_tree_page() {
        treePage.clickTreeGetStarted();
        logger.info("Clicked Get Started on Tree page");
    }

    @Then("User should be redirected to the {string} page")
    public void user_should_be_redirected_to_the_page(String expectedTitle) {

    }

    @Given("The  user is on the Tree page after logged in")
    public void the_user_is_on_the_tree_page_after_logged_in() {

    }

    @When("The user clicks Overview of Trees link")
    public void the_user_clicks_overview_of_trees_link() {
        treePage.verifyOverviewOfTreeLink();
        logger.info("Clicked Overview of Trees");
    }

    @Then("The user should be redirected to Overview of Trees page")
    public void the_user_should_be_redirected_to_overview_of_trees_page() {

    }

    @Given("The user is in the Overview of Trees Page")
    public void the_user_is_in_the_overview_of_trees_page() {

    }

//    @When("The user clicks Try Here button in Tree page")
//    public void the_user_clicks_try_here_button_in_tree_page() {
//
//    }

    @Then("The user should be redirected to a Tree page having an tryEditor with a Run button to test")
    public void the_user_should_be_redirected_to_a_tree_page_having_an_try_editor_with_a_run_button_to_test() {

    }

    @Given("The user is on the Tree tryEditor page")
    public void the_user_is_on_the_tree_try_editor_page() {

    }

    @When("The user writes valid python code in tryEditor page")
    public void the_user_writes_valid_python_code_in_try_editor_page() {
        try {
            treePage.enterCode("print('Hello, Tree!')");
            treePage.clickRunButton();
        } catch (Exception e) {
            logger.error("Error writing valid Python code", e);
        }
    }

    @Then("User is able to see the output in console of Tree Page")
    public void user_is_able_to_see_the_output_in_console_of_tree_page() {
        treePage.verifyEditorOutput(); // This handles both success and alert
    }

    @Given("The user is on the tryEditor page")
    public void the_user_is_on_the_try_editor_page() {
        try {
            treePage.enterCode("print('Hello Tree'");
            treePage.clickRunButton();
        } catch (Exception e) {
            logger.error("Error writing invalid Python code", e);
        }
    }

    @When("The user writes invalid python code in tryEditor page")
    public void the_user_writes_invalid_python_code_in_try_editor_page() {
        String error = treePage.getErrorMessage();
        logger.info("Captured Error Message: " + error);
    }

    @Then("User is able to see the error message in Tree Page pop up window")
    public void user_is_able_to_see_the_error_message_in_tree_page_pop_up_window() {
        treePage.getErrorMessage();
    }

    @When("The user clicks Terminologies link in tree page")
    public void the_user_clicks_terminologies_link_in_tree_page() {
      treePage.verifyTerminologyLink();
    }

    @Then("The user should be redirected to Terminologies Page")
    public void the_user_should_be_redirected_to_terminologies_page() {

    }

    @Given("The user is in the Terminologies page")
    public void the_user_is_in_the_terminologies_page() {

    }

    @When("The user clicks Try Here button in Tree Page")
    public void the_user_clicks_try_here_button_in_tree_page() {

    }

//    @When("The user writes valid python code in Tree Page")
//    public void the_user_writes_valid_python_code_in_tree_page() {
//
//    }

    @When("The user writes invalid python code in Tree Page")
    public void the_user_writes_invalid_python_code_in_tree_page() {

    }

    @Then("User is able to see the error msg in  Tree Page pop up window")
    public void user_is_able_to_see_the_error_msg_in_tree_page_pop_up_window() {

    }

    @When("The user clicks Types of Trees link")
    public void the_user_clicks_types_of_trees_link() {

    }

    @Then("The user should be redirected to Types of Trees Page")
    public void the_user_should_be_redirected_to_types_of_trees_page() {

    }

    @Given("The user is in the Types of Trees Page")
    public void the_user_is_in_the_types_of_trees_page() {

    }

    @When("The User writes valid python code in Tree Page")
    public void the_user_writes_valid_python_code_in_tree_page() {

    }

    @When("The user clicks Tree Traversals link")
    public void the_user_clicks_tree_traversals_link() {

    }

    @Then("The user should be redirected to Tree Traversals Page")
    public void the_user_should_be_redirected_to_tree_traversals_page() {

    }

    @Given("The user is in the Tree Traversals Page")
    public void the_user_is_in_the_tree_traversals_page() {

    }

    @When("The user clicks Traversals-Illustration link")
    public void the_user_clicks_traversals_illustration_link() {

    }

    @Then("The user should be redirected to Traversals-Illustration Page")
    public void the_user_should_be_redirected_to_traversals_illustration_page() {

    }

    @Given("The user is in the Traversals-Illustration Page")
    public void the_user_is_in_the_traversals_illustration_page() {

    }

    @When("The user clicks Binary Trees link")
    public void the_user_clicks_binary_trees_link() {

    }

    @Then("The user should be redirected to Binary Trees Page")
    public void the_user_should_be_redirected_to_binary_trees_page() {

    }

    @Given("The user is in the Binary Trees Page")
    public void the_user_is_in_the_binary_trees_page() {

    }

    @When("The user clicks Types of Binary Trees link")
    public void the_user_clicks_types_of_binary_trees_link() {

    }

    @Then("The user should be redirected to Types of Binary Trees Page")
    public void the_user_should_be_redirected_to_types_of_binary_trees_page() {

    }

    @Given("The user is in the Types of Binary Trees Page")
    public void the_user_is_in_the_types_of_binary_trees_page() {

    }

    @When("The user clicks Implementation in Python link")
    public void the_user_clicks_implementation_in_python_link() {

    }

    @Then("The user should be redirected to Implementation in Python Page")
    public void the_user_should_be_redirected_to_implementation_in_python_page() {

    }

    @Given("The user is in the Implementation in Python Page")
    public void the_user_is_in_the_implementation_in_python_page() {

    }

    @When("The user clicks Binary Tree Traversals link")
    public void the_user_clicks_binary_tree_traversals_link() {

    }

    @Then("The user should be redirected to Binary Tree Traversals Page")
    public void the_user_should_be_redirected_to_binary_tree_traversals_page() {

    }

    @Given("The user is in the Binary Tree Traversals Page")
    public void the_user_is_in_the_binary_tree_traversals_page() {

    }

    @When("The user clicks Implementation of Binary Trees link")
    public void the_user_clicks_implementation_of_binary_trees_link() {

    }

    @Then("The user should be redirected to Implementation of Binary Trees Page")
    public void the_user_should_be_redirected_to_implementation_of_binary_trees_page() {

    }

    @Given("The user is in the Implementation of Binary Trees Page")
    public void the_user_is_in_the_implementation_of_binary_trees_page() {

    }

    @When("The user clicks Applications of Binary trees link")
    public void the_user_clicks_applications_of_binary_trees_link() {

    }

    @Then("The user should be redirected to Applications of Binary trees Page")
    public void the_user_should_be_redirected_to_applications_of_binary_trees_page() {

    }

    @Given("The user is in the Applications of Binary trees Page")
    public void the_user_is_in_the_applications_of_binary_trees_page() {

    }

    @When("The user clicks Binary Search Trees link")
    public void the_user_clicks_binary_search_trees_link() {

    }

    @Then("The user should be redirected to Binary Search Trees Page")
    public void the_user_should_be_redirected_to_binary_search_trees_page() {

    }

    @Given("The user is in the Binary Search Trees Page")
    public void the_user_is_in_the_binary_search_trees_page() {

    }

    @When("The user clicks Implementation Of BST link")
    public void the_user_clicks_implementation_of_bst_link() {

    }

    @Then("The user should be redirected to Implementation Of BST Page")
    public void the_user_should_be_redirected_to_implementation_of_bst_page() {

    }

    @Given("The user is in the Implementation Of BST Page")
    public void the_user_is_in_the_implementation_of_bst_page() {

    }

    @When("The user clicks Trees Practice Questions link")
    public void the_user_clicks_trees_practice_questions_link() {

    }

    @Then("The user is redirected to Trees Practice Questions page")
    public void the_user_is_redirected_to_trees_practice_questions_page() {

    }


}
