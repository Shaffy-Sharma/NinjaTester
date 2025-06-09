package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import PageFactory.Queue_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class Queue_Steps {

	private Queue_Page qpf;
	String pagetitle;
	boolean practicequestioncontent;
	
	@Given("Queue-User is in the Home page after logging in using credentials from Excel {int}")
	public void queue_user_is_in_the_home_page_after_logging_in_using_credentials_from_excel(Integer int1) throws IOException {
		LoggerLoad.info("Launched browser from hooks !!");
		LoggerLoad.info("Signing in..");
		qpf=new Queue_Page();
		ExcelReader read = new ExcelReader();
		String username = read.getusername(int1);
		String password = read.getpassword(int1);	
		qpf.homepage(username, password); 
	}

	@When("User clicks on Get Started button under the section Queue")
	public void user_clicks_on_get_started_button_under_the_section_queue() {
		LoggerLoad.info("Moving to Queue page..");
		pagetitle = qpf.Queuepage();
	}

	@Then("User lands on the Queue page")
	public void user_lands_on_the_queue_page() {
		assertEquals(pagetitle, "Queue", "Not on the Queue page");
		LoggerLoad.info("Current page: "+pagetitle);
		LoggerLoad.info("Hooks called to close the browser.....");
	}

	@Given("User is in the Queue page after logging in using credentials from Excel {int}")
	public void user_is_in_the_queue_page_after_logging_in_using_credentials_from_excel(Integer int1) throws IOException {
		LoggerLoad.info("Launched browser from hooks !!");
		LoggerLoad.info("Signing in..");
		qpf=new Queue_Page();
		ExcelReader read = new ExcelReader();
		String username = read.getusername(int1);
		String password = read.getpassword(int1);	
		qpf.homepage(username, password);
		LoggerLoad.info("Moving to Queue page..");
		pagetitle = qpf.Queuepage();
	}

	@When("User clicks on the hyperlink Implementation of Queue in Python")
	public void user_clicks_on_the_hyperlink_implementation_of_queue_in_python() {
		pagetitle = qpf.implementationofqueueinpython();
	}

	@Then("User lands on the Implementation of Queue in Python page")
	public void user_lands_on_the_implementation_of_queue_in_python_page() {
		assertEquals(pagetitle, "Implementation of Queue in Python", "Not on the Implementation of Queue in Python page");
		LoggerLoad.info("Current page: "+pagetitle);
	}

	@Given("User is in the Implementation of Queue in Python page")
	public void user_is_in_the_implementation_of_queue_in_python_page() throws IOException {
		LoggerLoad.info("Launched browser from hooks !!");
		LoggerLoad.info("Signing in..");
		qpf=new Queue_Page();
		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		qpf.homepage(username, password);
		LoggerLoad.info("Moving to Queue page..");
		pagetitle = qpf.Queuepage();
		pagetitle = qpf.implementationofqueueinpython();
	}

	@When("Queue - User clicks on the Practice Questions from the side navigation bar")
	public void queue_user_clicks_on_the_practice_questions_from_the_side_navigation_bar() {
		qpf.PracticeQuestion(); 
	}

	@Then("Queue - User lands on the Practice Questions page and is able to view the content successfully")
	public void queue_user_lands_on_the_practice_questions_page_and_is_able_to_view_the_content_successfully() {
		practicequestioncontent = qpf.PracticeQuestioncontentcheck();
	    assertEquals(practicequestioncontent, true);
	}

	@When("Queue - User clicks on the Try here>>> button")
	public void queue_user_clicks_on_the_try_here_button() {
		pagetitle = qpf.tryhere();
	}

	@Then("Queue - User lands on the Try Editor page.")
	public void queue_user_lands_on_the_try_editor_page() {
		assertEquals(pagetitle, "Assessment", "Not on the Try Editor page");
		LoggerLoad.info("Current page: "+pagetitle);  
	}

	@Given("Queue - User is in Try Editor page from Implementation of Queue in Python page")
	public void queue_user_is_in_try_editor_page_from_implementation_of_queue_in_python_page() throws IOException {
		LoggerLoad.info("Launched browser from hooks !!");
		LoggerLoad.info("Signing in..");
		qpf=new Queue_Page();
		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		qpf.homepage(username, password);
		LoggerLoad.info("Moving to Queue page..");
		pagetitle = qpf.Queuepage();
		pagetitle = qpf.implementationofqueueinpython();
		pagetitle=qpf.tryhere();
	}

	@When("Queue - User clicks on Run Button without entering the code")
	public void queue_user_clicks_on_run_button_without_entering_the_code() {
		qpf.clickrun();
	}

	@Then("Queue - An Alert window with the error message is displayed.")
	public void queue_an_alert_window_with_the_error_message_is_displayed() {
		String alertmessage = qpf.handlealert();
		LoggerLoad.info(alertmessage);
	}

	@When("User clicks on Run Button after entering a invalid python code from Excel {int} for Queue Module")
	public void user_clicks_on_run_button_after_entering_a_invalid_python_code_from_excel_for_queue_module(Integer int1) throws IOException {
		ExcelReader read = new ExcelReader();
		String tryherecode = read.gettryherecode(int1);
		System.out.println(tryherecode);
		qpf.entercode(tryherecode);
		qpf.clickrun();  
	}

	@Then("An Alert window with the error message from Excel {int} for Queue Module is displayed")
	public void an_alert_window_with_the_error_message_from_excel_for_queue_module_is_displayed(Integer int1) throws IOException {
		String alertmessage = qpf.handlealert();
		LoggerLoad.info("Alert Message received:"+alertmessage);
		ExcelReader read = new ExcelReader();
		String outputmessage = read.gettryherecode(int1);	
		assertEquals(alertmessage, outputmessage, "Incorrect output");
	}

	@When("User clicks on Run Button after entering a valid python code from Excel {int} for Queue Module")
	public void user_clicks_on_run_button_after_entering_a_valid_python_code_from_excel_for_queue_module(Integer int1) throws IOException {
		ExcelReader read = new ExcelReader();
		String tryherecode = read.gettryherecode(int1);
		System.out.println(tryherecode);
		qpf.entercode(tryherecode);
		qpf.clickrun();
	}

	@Then("Correct output is displayed in the console from Excel {int} for Queue Module")
	public void correct_output_is_displayed_in_the_console_from_excel_for_queue_module(Integer int1) throws IOException {
		ExcelReader read = new ExcelReader();
		String outputmessage = read.gettryherecode(int1);
		String actualoutput=qpf.getoutput();
		assertEquals(actualoutput, outputmessage, "Incorrect output");
		LoggerLoad.info(actualoutput);
	}

	@When("User clicks on the hyperlink Implementation using collections deque")
	public void user_clicks_on_the_hyperlink_implementation_using_collections_deque() {
		pagetitle = qpf.implementationusingcollcdeque();
	}

	@Then("User lands on the Implementation using collections deque page")
	public void user_lands_on_the_implementation_using_collections_deque_page() {
		assertEquals(pagetitle, "Implementation using collections.deque", "Not on the Implementation using collections.deque page");
		LoggerLoad.info("Current page: "+pagetitle);
	}

	@Given("Queue - User is in Try Editor page from Implementation using collections deque page")
	public void queue_user_is_in_try_editor_page_from_implementation_using_collections_deque_page() throws IOException {
		LoggerLoad.info("Launched browser from hooks !!");
		LoggerLoad.info("Signing in..");
		qpf=new Queue_Page();
		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		qpf.homepage(username, password);
		LoggerLoad.info("Moving to Queue page..");
		pagetitle = qpf.Queuepage();
		pagetitle=qpf.implementationusingcollcdeque();
		pagetitle=qpf.tryhere();
	}

	@When("User clicks on the hyperlink Implementation using array")
	public void user_clicks_on_the_hyperlink_implementation_using_array() {
		pagetitle = qpf.implementationusingarray();
	}

	@Then("User lands on the Implementation using array page")
	public void user_lands_on_the_implementation_using_array_page() {
		assertEquals(pagetitle, "Implementation using array", "Not on the Implementation using array page");
		LoggerLoad.info("Current page: "+pagetitle);
	}

	@Given("Queue - User is in Try Editor page from Implementation using array page")
	public void queue_user_is_in_try_editor_page_from_implementation_using_array_page() throws IOException {
		LoggerLoad.info("Launched browser from hooks !!");
		LoggerLoad.info("Signing in..");
		qpf=new Queue_Page();
		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		qpf.homepage(username, password);
		LoggerLoad.info("Moving to Queue page..");
		pagetitle = qpf.Queuepage();
		pagetitle = qpf.implementationusingarray();
		pagetitle = qpf.tryhere();   
	}

	@When("User clicks on the hyperlink Queue Operations")
	public void user_clicks_on_the_hyperlink_queue_operations() {
		pagetitle = qpf.queueoperations();
	}

	@Then("User lands on the Queue Operations page")
	public void user_lands_on_the_queue_operations_page() {
		assertEquals(pagetitle, "Queue Operations", "Not on the Queue Operations page");
		LoggerLoad.info("Current page: "+pagetitle);
	}

	@Given("Queue - User is in Try Editor page from Queue Operations page")
	public void queue_user_is_in_try_editor_page_from_queue_operations_page() throws IOException {
		LoggerLoad.info("Launched browser from hooks !!");
		LoggerLoad.info("Signing in..");
		qpf=new Queue_Page();
		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		qpf.homepage(username, password);
		LoggerLoad.info("Moving to Queue page..");
		pagetitle = qpf.Queuepage();
		pagetitle=qpf.queueoperations();
		pagetitle=qpf.tryhere();
	}

	@Given("Queue - User signed in dsAlgo Portal and is on the home page")
	public void queue_user_signed_in_ds_algo_portal_and_is_on_the_home_page() throws IOException {
		LoggerLoad.info("Launched browser from hooks !!");
		LoggerLoad.info("Signing in..");
		qpf=new Queue_Page();
		ConfigReader config = new ConfigReader();
		String username = config.getusername();
		String password = config.getpassword();
		qpf.homepage(username, password);
	}

	@When("User clicks on Queue from the drop down above and navigate to Implementation of Queue in Python page")
	public void user_clicks_on_queue_from_the_drop_down_above_and_navigate_to_implementation_of_queue_in_python_page() {
		LoggerLoad.info("Moving to Queue page from dropdown..");
		pagetitle = qpf.QueuepagefromDD();
		pagetitle = qpf.implementationofqueueinpython();
	}

	@Then("User navigates to Queue page after clicking on the dropdown above and further navigates to Implementation of Queue in Python page successfully.")
	public void user_navigates_to_queue_page_after_clicking_on_the_dropdown_above_and_further_navigates_to_implementation_of_queue_in_python_page_successfully() {
		assertEquals(pagetitle, "Implementation of Queue in Python", "Not on the Implementation of Queue in Python page");
		LoggerLoad.info("Current page: "+pagetitle);
	}
}