package stepDefinitions;

import PageFactory.Graph_Page;
import PageFactory.Home_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class graphSteps
{
	Graph_Page graph=new Graph_Page();
	 Home_Page home = new Home_Page();

	 @Given("The user is on Home page after logged in")
	    public void the_user_is_on_home_page_after_logged_in() 
	 {
	        home.homepage(); // Implement this in Home_Page if not done yet
	        LoggerLoad.info("User is on Home page after logged in");
	    }
	 
	@When("user clicks on Graph getstarted")
	public void user_clicks_on_graph_getstarted() 
	{
		graph .getStarted();
        LoggerLoad.info("User Clicked on Graph Get Started link");
	}
	
	
	@Given("User is on the Graph page")
	public void user_is_on_the_graph_page()
	{
		graph.navigateToGraphPage();
        LoggerLoad.info("User is on the Graph Page");
	}
	@When("User clicks on Graph Link in Graph Page")
	public void user_clicks_on_graph_link_in_graph_page()
	{
		 graph.clickOnGraphLink();
	}
	
	
	@Given("User navigates to the Graph Graph page")
	public void user_navigates_to_the_graph_graph_page()
	{
		graph.navigateToGraphGraphPage();
	}

	
    @Given("User is on the try editor page")
    public void user_is_on_the_try_editor_page1()
    {
        LoggerLoad.info("User is on Try Editor Page");
        // Assuming navigation done in previous step
    }
	
	@When("User clicks on Graph Representation in Graph Page")
	public void user_clicks_on_graph_representation_in_graph_page() 
	{
		graph.clickOnGraphRepresentationsLink();
	}
	
	

	@Given("User navigates to the Graph Representations page")
	public void user_navigates_to_the_graph_representations_page() 
	{
	    graph.navigateToGraphRepresentationsPage();
	}
	
	

	@When("User clicks on Graph Practice Questions link")
	public void user_clicks_on_graph_practice_questions_link()
	{
		graph.clickOnGraphPracQuesLink();
	}
	
	
	
	@Then("User redirected to  {string} page")
	public void user_redirected_to_page(String string)
	{
		LoggerLoad.info("The User redirected to " + string + "Page");
        String title = graph.getGraphPageTitle();
        LoggerLoad.info("Title of the Current Page is " + title);
        assertEquals(title, string);
	}
	
	@When("User clicks on signout")
	public void user_clicks_on_signout()
	{
		 graph.logout();
	}
	
	@Then("Message displayed LoggedOut Successfully")
	public void message_displayed_logged_out_successfully()
	{
		graph.successLogout();
	}
	@When("User click on try here link")
    public void user_click_on_try_here_link() {
        graph.clickOnGraphTryhereLink();
        LoggerLoad.info("User clicked on Try Here link");
    }

    @Given("User is on the try editor page")
    public void user_is_on_the_try_editor_page() {
        LoggerLoad.info("User is on Try Editor Page");
        // Assume previous step (clickTryHereLink) has navigated to this page
    }

    @When("User enters the Python Code")
    public void user_enters_the_python_code(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        String pythonCode = dataTable.cell(0, 0);
        graph.enterCode(pythonCode);
        LoggerLoad.info("User entered Python code: " + pythonCode);
    }

    @When("User clicks on run button")
    public void user_clicks_on_run_button() {
    	graph.clickRunButton();

    }

    @Then("User is presented with Result")
    public void user_is_presented_with_result() {
        String output = graph.getOutput();
        LoggerLoad.info("Output from Python code: " + output);
        assertTrue(!output.isEmpty(), "Output is empty!");

    }
	
	}