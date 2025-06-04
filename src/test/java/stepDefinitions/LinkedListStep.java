package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Hooks.hooks;
import PageFactory.LinkedList_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LinkedListStep
{
	//WebDriver driver = hooks.driver;
	LinkedList_Page LINKLISTPAGe = new LinkedList_Page();
   @Given("The user has successfully logged in and is on the Home page")
	public void the_user_has_successfully_logged_in_and_is_on_the_home_page()
   {
	   LINKLISTPAGe.openLoginPage();
	   
	   LINKLISTPAGe.Click_SignIn_button();
	   LINKLISTPAGe.Enter_Username("NinjaTester");
	   LINKLISTPAGe.Enter_Password("Welcome@123");
	   LINKLISTPAGe.Click_Login();
	   
	   
	}

	@When("The user clicks the {string} button in Linked List Panel OR selects Linked List from the dropdown menu")
	public void the_user_clicks_the_button_in_linked_list_panel_or_selects_linked_list_from_the_dropdown_menu(String string) {
		LINKLISTPAGe.click_getStartedbtn();
	   
	}

	@Then("The user should be directed to {string} Data Structure Page")
	public void the_user_should_be_directed_to_data_structure_page(String string)
	{
		
	    
	}

	@Given("The user has navigated to the Linked List main page")
	public void the_user_has_navigated_to_the_linked_list_main_page()
	{
	  
	}

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String string)
	{
	    
	   
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) 
	{
	   
	   
	}

	@Given("The user is viewing the Linked List - Introduction page")
	public void the_user_is_viewing_the_linked_list_introduction_page()
	{
	    
	   
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to try editor with Run button")
	public void the_user_should_be_redirected_to_try_editor_with_run_button() {
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user has accessed the tryEditor from the Introduction page")
	public void the_user_has_accessed_the_try_editor_from_the_introduction_page() {
	  
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Run without entering code")
	public void the_user_clicks_run_without_entering_code()
	{
	   
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Prevent code execution when editor is blank")
	public void prevent_code_execution_when_editor_is_blank() {
	   
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on the tryEditor with the editor opened")
	public void the_user_is_on_the_try_editor_with_the_editor_opened() {
	    
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user writes invalid code and clicks Run")
	public void the_user_writes_invalid_code_and_clicks_run() {
	   
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should see an error message in alert window")
	public void the_user_should_see_an_error_message_in_alert_window() {
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on the tryEditor page with editor open")
	public void the_user_is_on_the_try_editor_page_with_editor_open() {
	   
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user writes valid code and clicks Run")
	public void the_user_writes_valid_code_and_clicks_run() {
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should see output in the console")
	public void the_user_should_see_output_in_the_console() {
	   
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is at the Linked List main content page")
	public void the_user_is_at_the_linked_list_main_content_page() {
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user has opened the Creating Linked List topic page")
	public void the_user_has_opened_the_creating_linked_list_topic_page() {
	    
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks {string}, writes valid Python code, and clicks Run")
	public void the_user_clicks_writes_valid_python_code_and_clicks_run(String string) {
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output should show correct linked list structure")
	public void the_output_should_show_correct_linked_list_structure() {
	  
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is at the Linked List section overview page")
	public void the_user_is_at_the_linked_list_section_overview_page() {
	  
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user has accessed the Types of Linked List topic")
	public void the_user_has_accessed_the_types_of_linked_list_topic() {
	   
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks {string}, enters valid Python code, and clicks Run")
	public void the_user_clicks_enters_valid_python_code_and_clicks_run(String string) {
	   
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output should show correct linked list types")
	public void the_output_should_show_correct_linked_list_types() {
	  
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is viewing the Linked List overview page")
	public void the_user_is_viewing_the_linked_list_overview_page() {
	  
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user has accessed the Implement Linked List in Python topic")
	public void the_user_has_accessed_the_implement_linked_list_in_python_topic() {
	   
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output should show correct implementation")
	public void the_output_should_show_correct_implementation() {
	   
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on the Linked List landing page")
	public void the_user_is_on_the_linked_list_landing_page() {
	  
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user has opened the Traversal topic in Linked List")
	public void the_user_has_opened_the_traversal_topic_in_linked_list() {
	  
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output should show correct traversal sequence")
	public void the_output_should_show_correct_traversal_sequence() {
	   
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the Linked List overview section")
	public void the_user_is_in_the_linked_list_overview_section() {
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user has accessed the Insertion topic page")
	public void the_user_has_accessed_the_insertion_topic_page() {
	   
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output should show correct insertion results")
	public void the_output_should_show_correct_insertion_results() {
	   
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is viewing Linked List main topics")
	public void the_user_is_viewing_linked_list_main_topics() {
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user has opened the Deletion topic in Linked List")
	public void the_user_has_opened_the_deletion_topic_in_linked_list() {
	   
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The output should show correct deletion results")
	public void the_output_should_show_correct_deletion_results() {
	    
	    throw new io.cucumber.java.PendingException();
	}




}
