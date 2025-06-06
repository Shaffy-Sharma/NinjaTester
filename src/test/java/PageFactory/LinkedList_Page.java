package PageFactory;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Drivers.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;

public class LinkedList_Page
{
	public WebDriver driver=DriverFactory.getDriver();
	String tryEditorURL = ConfigReader.tryEditorURL();

	//whatever reusable methods we have we are keeping those methods in Utility_Methods class
	Utility_Methods util=new Utility_Methods();
	JavascriptExecutor js;   
        
  
        //locators for clicking the GetStarted_Linkedlist
      @FindBy(xpath="//div[contains(@class,'card')]//h5[text()='Linked List']/following-sibling::a")
        WebElement GetStarted_Linkedlist;
      
      //locators for selecting dropdown
      @FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
      WebElement dropDown;
        
      //locators for selecting the linkedlistoprtion from the dropdown
      @FindBy(xpath = "//a[@class='dropdown-item' and text()='Linked List']")
      WebElement dropdown_linkedlist;
      
     //selecting the introduction link
        @FindBy(xpath="//a[contains(text(),'Introduction')]")
        WebElement introductionLink;
        
        
        //selecting second linkedlistlink option
        @FindBy(xpath="//a[contains(text(),'Creating Linked LIst')]")
        WebElement CreatingLinkedListLink;
        
        //Selecting third link from the menu
        @FindBy(xpath="//a[contains(text(),'Types of Linked List')]")
        WebElement Types_of_LinkedListLink;
        
      //Selecting forth link from the menu
        @FindBy(xpath="//a[contains(text(),'Implement Linked List in Python')]")
        WebElement Implement_Linked_List_in_PythonLink;
        
        
        //selecting fifth link from the menu
        @FindBy(xpath="//a[contains(text(),'Traversal')]")
        WebElement TraversalLink;
        
        
      //Selecting Sixth link from the menu
        @FindBy(xpath="//a[contains(text(),'Insertion')]")
        WebElement InsertionLink;
        
        
        
        //Selecting seventh link from the menu
        @FindBy(xpath="//a[contains(text(),'Deletion')]")
        WebElement DeletionLink;
        
        
        //selecting practice question from the deletion 
        @FindBy(xpath="//a[contains(text(),'Practice Questions')]")
        WebElement PracticeQuestionsLink; 
        
      
        @FindBy (id="answer_form") 
        WebElement answerform;
        
        
       @FindBy(css="a.btn.btn-info")
       WebElement tryhere_btn_Link;
     
       @FindBy (xpath ="//form/div/div/div/textarea")
       WebElement tryEditorInput;
       
      @FindBy(xpath="//button[text()='Run']")
       WebElement run_btn;
      
      
      @FindBy(id = "output")
      WebElement output; 
      
      
      
     //This is the Constructor of the LinkedListPage page factory
        public LinkedList_Page()
        {
        
   		  PageFactory.initElements(driver,this);
   		 
        }
        //uses a logger utility—LoggerLoad—is a custom or wrapper logging class -to log information during test execution.
        public void dropdown_linkedlist()
        {
            LoggerLoad.info("Click" + dropDown.getText() + "on drop down");
            dropDown.click();
            LoggerLoad.info("Click" + dropdown_linkedlist.getText() + " From the drop down");
            dropdown_linkedlist.click();
        }
        
     //we are using this method to confirm that from the dropdown it selected the correct option
        public String getLinkedListPagetitle()
        {
        	 String title = driver.getTitle();
             return title;
        }
        
         public void Clickon_introductionLink()
        {
        	LoggerLoad.info("Click On " + introductionLink.getText() + "On Linked List Page");
            introductionLink.click();
            LoggerLoad.info("Title of the Page" + driver.getTitle());

        }
         
         public void clicking_tryhere_btn_Intoduction(String Btname,String DsName)
         {
        	 tryhere_btn_Link.click();
             LoggerLoad.info("User Clicked on" + Btname+ " Button" + DsName );
         }
         
         public void Enter_PythonCode(String pythonCode)throws InterruptedException
         {
        	 util.waitForElement(answerform);
        	 answerform.click();
        	 LoggerLoad.info("Title of the Page" + driver.getTitle());
        	 tryEditorInput.sendKeys(pythonCode);
         }
         
         public void Clickon_runButton() throws InterruptedException 
         {
        	 run_btn.click();
        	 LoggerLoad.info("User Clicked on Run button");
         }
         
         public String Get_OutputString() 
         {
        	 util.waitForElement(output);
			return output.getText();
        	 
         }
         
         public String Get_Errormsg()
         {
        	String errormessage= driver.switchTo().alert().getText();
        	LoggerLoad.info("The Error Message is:"+ errormessage);
        	driver.switchTo().alert().accept();
        	 
			return errormessage;
        	 
         }
         public void navigateTotryEditor()
         {
             driver.get(tryEditorURL);
             LoggerLoad.info("User is in editor page");

         }
         
         
         //the flow of first link-indruction link is done now want to go back one step
         
         
         public void navigateTo(String pagename)
         {
             String urlName = ConfigReader.geturl(pagename);
             driver.get(urlName);

         }
         
           
      //second link
        public void Clickon_CreatingLinkedList()
        {
        	LoggerLoad.info("click"+CreatingLinkedListLink.getText()+"On Linked List Page");
        	CreatingLinkedListLink.click();
        	LoggerLoad.info("Title of the Page" + driver.getTitle());
        }
        //Third link
        public void Clickon_Types_of_LinkedListLink()
        {
        	LoggerLoad.info("click"+Types_of_LinkedListLink.getText()+"On Linked List Page");
        	Types_of_LinkedListLink.click();
        	LoggerLoad.info("Title of the Page" + driver.getTitle());
        }
        //Forth link
        
        public void Clickon_Implement_Linked_List_in_PythonLink()
        {
        	LoggerLoad.info("click"+Implement_Linked_List_in_PythonLink.getText()+"On Linked List Page");
        	Implement_Linked_List_in_PythonLink.click();
        	LoggerLoad.info("Title of the Page" + driver.getTitle());
        	
        }
        //Fifth link
        public void Clickon_TraversalLink()
        {
        	LoggerLoad.info("click"+TraversalLink.getText()+"On Linked List Page");
        	TraversalLink.click();
        	LoggerLoad.info("Title of the Page" + driver.getTitle());
        	
        }
        
        //Sixth link
        
        public void Clickon_InsertionLink()
        {
        	LoggerLoad.info("click"+InsertionLink.getText()+"On Linked List Page");
        	InsertionLink.click();
        	LoggerLoad.info("Title of the Page" + driver.getTitle());
        	
        }
       
        //Seventh link
	
        public void Clickon_DeletionLink()
        {
        	LoggerLoad.info("click"+DeletionLink.getText()+"On Linked List Page");
        	DeletionLink.click();
        	LoggerLoad.info("Title of the Page" + driver.getTitle());
        	
        	
        }
        
        //eighth link
        public void Clickon_PracticeQuestionsLink()
        {
        	LoggerLoad.info("click"+PracticeQuestionsLink.getText()+"On Linked List Page");
        	PracticeQuestionsLink.click();
        	LoggerLoad.info("Title of the Page" + driver.getTitle());
        	
        }
        
        
        
        
        
        
        
        
        
        
        
        
}

