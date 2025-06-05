package stepDefinitions;

import PageFactory.Graph_Page;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

import static org.testng.Assert.assertEquals;

public class graphSteps
{
	Graph_Page graph=new Graph_Page();

	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() 
	{
	    
	}

	@When("The user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String string, String string2)
	{
	    
	}

	@When("The user click on login button")
	public void the_user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on Home page after logged in")
	public void the_user_is_on_home_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Graph getstarted")
	public void user_clicks_on_graph_getstarted() 
	{
		graph .getStarted();
        LoggerLoad.info("User Clicked on Graph Get Started link");
	}

	@Then("User redirected to {string} page")
	public void user_redirected_to_page(String string) 
	{
	    
	}

	@Given("User is on the Graph page")
	public void user_is_on_the_graph_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Graph Link in Graph Page")
	public void user_clicks_on_graph_link_in_graph_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User navigates to the Graph Graph page")
	public void user_navigates_to_the_graph_graph_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click on try here link")
	public void user_click_on_try_here_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is on the try editor page")
	public void user_is_on_the_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters the Python Code")
	public void user_enters_the_python_code(io.cucumber.datatable.DataTable dataTable)
	{
	    
	}

	@When("User clicks on run button")
	public void user_clicks_on_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User is presented with Result")
	public void user_is_presented_with_result() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Graph Representation in Graph Page")
	public void user_clicks_on_graph_representation_in_graph_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User navigates to the Graph Representations page")
	public void user_navigates_to_the_graph_representations_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Graph Practice Questions link")
	public void user_clicks_on_graph_practice_questions_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User redirected to Graph {string} page")
	public void user_redirected_to_graph_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on signout")
	public void user_clicks_on_signout() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Message displayed LoggedOut Successfully")
	public void message_displayed_logged_out_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
}