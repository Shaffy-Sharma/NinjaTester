package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import Drivers.DriverFactory;
import PageFactory.Stack_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class Stack_Steps {
	private Stack_Page stackPageFactory;
	
	@Given("User is in the Home Page after Logged in for Stack page {int}")
	public void user_is_in_the_home_page_after_logged_in_for_stack_page(Integer int1) throws IOException{
		initializeHomeScreen(int1);
	}

	@When("User clicks the Get Strated button in the Stack panel")
	public void user_clicks_the_get_strated_button_in_the_stack_panel() {
		stackPageFactory.clickGetStarted();
	}

	@Then("User should be directed to the Stack page")
	public void user_should_be_directed_to_the_stack_page() {
		Assert.assertTrue(stackPageFactory.isOnStackPage());
	}

	@Given("User is in the Home Page after logged in for Stack {int}")
	public void user_is_in_the_home_page_after_logged_in_for_stack(Integer int1) throws IOException{
		 initializeHomeScreen(int1);
	}

	@When("User clicks on Stack from the DS drop down")
	public void user_clicks_on_stack_from_the_ds_drop_down() {
		stackPageFactory.selectStackFromDsDropDown();
	}

	@Given("User is in the Stack page {int}")
	public void user_is_in_the_stack_page(Integer int1) throws IOException {
		initializeHomeScreen(int1);
		stackPageFactory.clickGetStarted();
	}

	@When("User clicks on the hyperlink Operations in Stack")
	public void user_clicks_on_the_hyperlink_operations_in_stack() {
		stackPageFactory.clickOperationsInStage();
	}

	@Then("User lands on the Operations in Stack page")
	public void user_lands_on_the_operations_in_stack_page() {
		Assert.assertTrue(stackPageFactory.isOnClickOperationsInStage());
	}

	@Given("User is in Introduction Page of Stack {int}")
	public void user_is_in_introduction_page_of_stack(Integer int1) throws IOException {
		initializeHomeScreen(int1);
		stackPageFactory.clickGetStarted();
		stackPageFactory.clickOperationsInStage();
	}

	@When("User clicks on Try here>>> button for Stack")
	public void user_clicks_on_try_here_button_for_stack() {
		stackPageFactory.clickTryHere();
	}

	@Then("User should be redirected to TryEditor page for Stack")
	public void user_should_be_redirected_to_try_editor_page_for_stack() {
		Assert.assertTrue(stackPageFactory.isOnTryEditorPage());
	}

	@Given("User is in TryEditor page of Operations in Stack and provided valid python code {int}")
	public void user_is_in_try_editor_page_of_operations_in_stack_and_provided_valid_python_code(Integer int1) throws IOException {
		user_is_in_stack_page(int1);
		stackPageFactory.clickOperationsInStage();
		navigateTryHereAndSendPythonCode(int1);
	}

	@When("User clicks on Run button for Stack")
	public void user_clicks_on_run_button_for_stack() {
		stackPageFactory.clickRun();
	}

	@Then("Python code should be successfully executed without any error for Stack")
	public void python_code_should_be_successfully_executed_without_any_error_for_stack() {
		 Assert.assertTrue(stackPageFactory.isRunSuccess());
	}

	@Given("User is in TryEditor page of Operations in Stack and provided invalid python code {int}")
	public void user_is_in_try_editor_page_of_operations_in_stack_and_provided_invalid_python_code(Integer int1) throws IOException {
		user_is_in_stack_page(int1);
		stackPageFactory.clickOperationsInStage();
		navigateTryHereAndSendPythonCode(int1);
	}

	@Then("Alert message should be popped up for Stack")
	public void alert_message_should_be_popped_up_for_stack() {
		Assert.assertNotNull(stackPageFactory.getAlertText(DriverFactory.getDriver()));
	}

	@When("User clicks on the hyperlink Implementation link in Stack")
	public void user_clicks_on_the_hyperlink_implementation_link_in_stack() {
		stackPageFactory.clickImplementationLink();
	}

	@Then("User lands on the Implementation Page in Stack")
	public void user_lands_on_the_implementation_page_in_stack() {
		 Assert.assertTrue(stackPageFactory.isOnImplementationPage());
	}

	@Given("User is in Implementation Page of Stack {int}")
	public void user_is_in_implementation_page_of_stack(Integer int1) throws IOException {
		user_is_in_stack_page(int1);
		stackPageFactory.clickImplementationLink();
	}

	@Given("User is in TryEditor page of Implementation in Stack and provided valid python code {int}")
	public void user_is_in_try_editor_page_of_implementation_in_stack_and_provided_valid_python_code(Integer int1) throws IOException {
		user_is_in_stack_page(int1);
		stackPageFactory.clickImplementationLink();
		navigateTryHereAndSendPythonCode(int1);
	}

	@Given("User is in TryEditor page of Implementation in Stack and provided invalid python code {int}")
	public void user_is_in_try_editor_page_of_implementation_in_stack_and_provided_invalid_python_code(Integer int1) throws IOException {
		user_is_in_stack_page(int1);
		stackPageFactory.clickImplementationLink();
		navigateTryHereAndSendPythonCode(int1);
	}

	@When("User clicks on the hyperlink Application link in Stack")
	public void user_clicks_on_the_hyperlink_application_link_in_stack() {
		stackPageFactory.clickApplicationLink();
	}

	@Then("User lands on the Application Page in Stack")
	public void user_lands_on_the_application_page_in_stack() {
		Assert.assertTrue(stackPageFactory.isOnApplicationPage());
	}

	@Given("User is in Application Page of Stack {int}")
	public void user_is_in_application_page_of_stack(Integer int1) throws IOException{
		user_is_in_stack_page(int1);
		stackPageFactory.clickApplicationLink();
	}

	@Given("User is in TryEditor page of Application in Stack and provided valid python code {int}")
	public void user_is_in_try_editor_page_of_application_in_stack_and_provided_valid_python_code(Integer int1) throws IOException {
		user_is_in_stack_page(int1);
		stackPageFactory.clickApplicationLink();
		navigateTryHereAndSendPythonCode(int1);
	}

	@Given("User is in TryEditor page of Application in Stack and provided invalid python code {int}")
	public void user_is_in_try_editor_page_of_application_in_stack_and_provided_invalid_python_code(Integer int1) throws IOException {
		user_is_in_stack_page(int1);
		stackPageFactory.clickApplicationLink();
		navigateTryHereAndSendPythonCode(int1);
	}

	@Given("User is in Stack Page {int}")
	public void user_is_in_stack_page(Integer int1) throws IOException {
		   initializeHomeScreen(int1);
		   stackPageFactory.clickGetStarted();
	}

	@When("User clicks Practice Questions link for Stack")
	public void user_clicks_practice_questions_link_for_stack() {
		stackPageFactory.clickOperationsInStage();
	    stackPageFactory.clickPracticeQuestions();
	}

	@Then("User should be able to navigate to Practice Questions page and page content should be displayed for Stack")
	public void user_should_be_able_to_navigate_to_practice_questions_page_and_page_content_should_be_displayed_for_stack() {
		 Assert.assertTrue(stackPageFactory.isOnPracticeQuestionsPage());
	}
	
	private void initializeHomeScreen(int rowNum) throws IOException {
		LoggerLoad.info("Initializing Home Screen for Stack Module");
		stackPageFactory = new Stack_Page(DriverFactory.getDriver());
		ExcelReader read = new ExcelReader();
		stackPageFactory.loginHome(read.getusername(rowNum), read.getpassword(rowNum));
	}
	
	private void navigateTryHereAndSendPythonCode(int rowNum) throws IOException {
		stackPageFactory.clickTryHere();
		stackPageFactory.sendCode(new ExcelReader().gettryherecode(rowNum), 
				DriverFactory.getDriver());
	}
}