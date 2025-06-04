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
import utilities.ReusableWait;

public class LinkedList_Page
{
	public WebDriver driver=DriverFactory.getDriver();

	ReusableWait wait=new ReusableWait();
	JavascriptExecutor js;
    
        public LinkedList_Page()
        {
        
   		  PageFactory.initElements(driver,this);
   		 
        }
        
        @FindBy(css=("button.btn"))
       WebElement GetStatrd_btn;
        
        
        @FindBy(xpath="//a[text()='Sign in']")
        WebElement Sign_btn;
        
        @FindBy(xpath="//input[contains(@name,'username')]")
        WebElement Username;
        
        @FindBy(xpath="//input[contains(@name,'password')]")
        WebElement Password;
        
        @FindBy(xpath="//input[contains(@value,'Login')]")
        WebElement Login;
        
        @FindBy(xpath="//div[contains(@class,'card')]//h5[text()='Linked List']/following-sibling::a")
        WebElement GetStarted;
        
        @FindBy(xpath="//a[contains(text(),'Introduction')]")
        WebElement Introduction;
        
        @FindBy(css="a.btn.btn-info")
        WebElement tryhere_btn;
        
        @FindBy(className="CodeMirror")
        WebElement tryEditor;
        
        @FindBy(xpath="//button[text()='Run']")
        WebElement run_btn;
        
        @FindBy(xpath="//a[contains(text(),'Creating Linked LIst')]")
        WebElement CreatingLinkedList;
        
        @FindBy(css="a.btn.btn-info")
        WebElement tryhere_btn_creatingLinkedList;
        
        @FindBy(className="CodeMirror")
        WebElement tryEditor_creatingLinkedList;
        
        @FindBy(xpath="//button[text()='Run']")
        WebElement Run_btn_creatingLinkedList;
        
      //Selecting third link from the menu
        @FindBy(xpath="//a[contains(text(),'Types of Linked List')]")
        WebElement Types_of_LinkedList;
        
        @FindBy(css="a.btn.btn-info")
        WebElement tryhere_btn_typesofLinkedList;
        
        @FindBy(className="CodeMirror")
        WebElement try_Editor_typesofLinkedList;
        
        @FindBy(xpath="//button[text()='Run']")
        WebElement Run_btn_typesofLinkedList;
        
    	//Selecting forth link from the menu
        @FindBy(xpath="//a[contains(text(),'Implement Linked List in Python')]")
        WebElement Implement_Linked_List_in_Python;
        
        @FindBy(css="a.btn.btn-info")
        WebElement tryhere_btn_Implement_Linked_List_in_Python;
        
        @FindBy(className="CodeMirror")
        WebElement try_editor_Implement_Linked_List_in_Python;
        
        @FindBy(xpath="//button[text()='Run']")
        WebElement Run_btn_Implement_Linked_List_in_Python;
        
      //selecting fifth link from the menu
        @FindBy(xpath="//a[contains(text(),'Traversal')]")
        WebElement Traversal;
        
        @FindBy(css="a.btn.btn-info")
        WebElement tryhere_btn_Traversal;
        
        @FindBy(className="CodeMirror")
        WebElement try_editor_Traversal;
        
        @FindBy(xpath="//button[text()='Run']")
        WebElement Run_btn_try_Traversal;
     
		//Selecting Sixth link from the menu
        @FindBy(xpath="//a[contains(text(),'Insertion')]")
        WebElement Insertion;
        
        @FindBy(css="a.btn.btn-info")
        WebElement tryhere_btn_Insertion;
        
        @FindBy(className="CodeMirror")
        WebElement try_editor_Insertion;
        
        @FindBy(xpath="//button[text()='Run']")
        WebElement Run_btn_Insertion;
        
      //Selecting seventh link from the menu
        @FindBy(xpath="//a[contains(text(),'Deletion')]")
        WebElement Deletion;
        
        @FindBy(css="a.btn.btn-info")
        WebElement tryhere_btn_Deletion;
        
        @FindBy(className="CodeMirror")
        WebElement try_editor_Deletion;
        
        @FindBy(xpath="//button[text()='Run']")
        WebElement Run_btn_Deletion;
        
      //selecting practice question from the deletion 
        @FindBy(xpath="//a[contains(text(),'Practice Questions')]")
        WebElement PracticeQuestions;
        
        public void openLoginPage()
        {
        	driver.get("https://dsportalapp.herokuapp.com");
        }
        public void click_getStartedbtn()
        {
        	// wait.until(ExpectedConditions.elementToBeClickable(GetStatrd_btn )).click();
			  
        }
        public void Click_SignIn_button()
        {
        	 //Wait.until(ExpectedConditions.elementToBeClickable(Sign_btn )).click();
        }
        public void Enter_Username(String username)
  	  {
  		  //wait.until(ExpectedConditions.visibilityOf(Username)).sendKeys(username);
  	  }
        public void Enter_Password(String password)
    	  {
    		  //wait.until(ExpectedConditions.visibilityOf(Password)).sendKeys(password);
    	  }
        public void Click_Login()
        {
        //	wait.until(ExpectedConditions.elementToBeClickable(Login)).click();
        }
        public void click_GetStarted()
        {
        	//wait.until(ExpectedConditions.elementToBeClickable(GetStarted)).click();
        }
        public void select_Indruction()
        {
        	//wait.until(ExpectedConditions.elementToBeClickable(Introduction)).click();
        }
        public void clicking_tryhere_btn_Intoduction()
        {
        	js.executeScript("window.scrollBy(0,500)");
        	//wait.until(ExpectedConditions.elementToBeClickable(tryhere_btn)).click();
        }
        public void Clicking_tryEditor()
        {
        	js.executeScript("arguments[0].CodeMirror.setValue('print(\"Hello\")');", tryEditor);
        	run_btn.click();
        	
    		//execute JavaScript to go back multiple steps at once:
    		js.executeScript("window.history.go(-2)");
    		js.executeScript("window.scrollBy(0,500)");
        }
        
      //second link
        public void select_CreatingLinkedList()
        {
        	//wait.until(ExpectedConditions.elementToBeClickable(CreatingLinkedList)).click();
        }
        public void  Clicking_tryhere_btn_CreatingLinkedList()
        {
        	js.executeScript("window.scrollBy(0,500)");
        	//wait.until(ExpectedConditions.elementToBeClickable(tryhere_btn_creatingLinkedList)).click();
        }
        public void Clicking_tryEditor_creatingLinkedList()
        {
        	js.executeScript("arguments[0].CodeMirror.setValue('print(\"Hello\")');", try_editor_Insertion);
        	Run_btn_Insertion.click();
        	
    		//execute JavaScript to go back multiple steps at once:
    		js.executeScript("window.history.go(-2)");
    		js.executeScript("window.scrollBy(0,500)");
        }
        //thirdLink
        public void Select_Types_of_LinkedList()
        {
        	//wait.until(ExpectedConditions.elementToBeClickable(Types_of_LinkedList)).click();
        }
        public void Clicking_tryhere_btn_typesofLinkedList()
        {
        	js.executeScript("window.scrollBy(0,500)");
        //	wait.until(ExpectedConditions.elementToBeClickable(tryhere_btn_typesofLinkedList)).click();
        }
        public void Clicking_tryEditor_typesofLinkedList()
        {
        	js.executeScript("arguments[0].CodeMirror.setValue('print(\"Hello\")');", tryhere_btn_typesofLinkedList);
        	Run_btn_typesofLinkedList.click();
        	
    		//execute JavaScript to go back multiple steps at once:
    		js.executeScript("window.history.go(-2)");
    		js.executeScript("window.scrollBy(0,500)");
        }
        //forthLink
        public void Select_Implement_Linked_List_in_Python()
        {
        	//wait.until(ExpectedConditions.elementToBeClickable(Implement_Linked_List_in_Python)).click();
        	
        }
        public void Clicking_tryhere_btn_Implement_Linked_List_in_Python()
        {
        	js.executeScript("window.scrollBy(0,500)");
        	//wait.until(ExpectedConditions.elementToBeClickable(tryhere_btn_Implement_Linked_List_in_Python)).click();
        }
        public void Clicking_try_editor_Implement_Linked_List_in_Python()
        {
        	js.executeScript("arguments[0].CodeMirror.setValue('print(\"Hello\")');", try_editor_Implement_Linked_List_in_Python);
        	Run_btn_Implement_Linked_List_in_Python.click();
        	
    		//execute JavaScript to go back multiple steps at once:
    		js.executeScript("window.history.go(-2)");
    		js.executeScript("window.scrollBy(0,500)");
        }
        //FifthLink
        public void Select_Traversal()
        {
        	//wait.until(ExpectedConditions.elementToBeClickable(Traversal)).click();
        }
        public void clicking_tryhere_btn_Traversal()
        {
        	js.executeScript("window.scrollBy(0,500)");
        	//wait.until(ExpectedConditions.elementToBeClickable(tryhere_btn_Traversal)).click();
        }
        public void Clicking_try_editor_Traversal()
        {
        	js.executeScript("arguments[0].CodeMirror.setValue('print(\"Hello\")');", try_editor_Traversal);
        	Run_btn_try_Traversal.click();
    	
		//execute JavaScript to go back multiple steps at once:
		js.executeScript("window.history.go(-2)");
		js.executeScript("window.scrollBy(0,500)");
        	
        }
        //Sixth link
        public void Select_Insertion()
        {
        	//wait.until(ExpectedConditions.elementToBeClickable(Insertion)).click();
        }
        public void Clicking_tryhere_btn_Insertion()
        {
        	js.executeScript("window.scrollBy(0,500)");
        	//wait.until(ExpectedConditions.elementToBeClickable(tryhere_btn_Insertion)).click();
        	
        }
        public void clicking_try_editor_Insertion()
        {
        	js.executeScript("arguments[0].CodeMirror.setValue('print(\"Hello\")');", try_editor_Insertion);
        	Run_btn_Insertion.click();
    	
		//execute JavaScript to go back multiple steps at once:
		js.executeScript("window.history.go(-2)");
		js.executeScript("window.scrollBy(0,500)");
        	
        }
        //seventh link
        public void Select_Deletion()
        {
        	//wait.until(ExpectedConditions.elementToBeClickable(Deletion)).click();
        }
        public void Clicking_tryhere_btn_Deletion()
        {
        	js.executeScript("window.scrollBy(0,500)");
        	//wait.until(ExpectedConditions.elementToBeClickable(tryhere_btn_Deletion)).click();
        }
        public void Clicking_try_editor_Deletion()
        {
        	js.executeScript("arguments[0].CodeMirror.setValue('print(\"Hello\")');", try_editor_Deletion);
        	Run_btn_Deletion.click();
    	
		//execute JavaScript to go back multiple steps at once:
		js.executeScript("window.history.go(-2)");
		js.executeScript("window.scrollBy(0,500)");
        	
        }
        public void Select_PracticeQuestions()
        {
        	//wait.until(ExpectedConditions.elementToBeClickable(PracticeQuestions)).click();
        }
}

