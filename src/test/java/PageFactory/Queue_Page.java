package PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivers.DriverFactory;

public class Queue_Page {
	WebDriver driver = DriverFactory.getDriver();
	String pagetitle;
	
	@FindBy (linkText="Sign in") WebElement signin;
	@FindBy (name="username") WebElement username;
	@FindBy (name="password") WebElement password;
	@FindBy (xpath="//input[@type='submit']") WebElement login;
	@FindBy (xpath="//h5[text()='Queue']/../a") WebElement Queuegetstarted;
	@FindBy (linkText="Implementation of Queue in Python") WebElement queueinpython;
	@FindBy (linkText="Implementation using collections.deque") WebElement implementationusingcollcdeque;
	@FindBy (linkText="Implementation using array") WebElement implementationusingarray;
	@FindBy (linkText="Queue Operations") WebElement queueoperations;
	@FindBy (linkText="Practice Questions") WebElement practiceques;	
	@FindBy (linkText="Search the Queue") WebElement practicequescontent;
	@FindBy (linkText="Try here>>>") WebElement Tryhere;
	@FindBy (xpath="//div[@class='input']//textarea") WebElement codetextarea;
	@FindBy (xpath="//button[@type='button']") WebElement runbutton;
	@FindBy (xpath="//pre[@id='output']") WebElement consoleoutput;
	@FindBy (xpath="//a[contains(text(),' Data Structures')]") WebElement Datastructuredd;
	@FindBy (xpath="//a[text()='Queue']") WebElement Queuedd;
	
	public void homepage(String uname, String pwd) {
		PageFactory.initElements(driver,this);
		signin.click();
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
	}
	
	public String Queuepage() {
		Queuegetstarted.click();
	    pagetitle = driver.getTitle();
		return pagetitle;
		}
	
	public String QueuepagefromDD() {
		Datastructuredd.click();
		Queuedd.click();
	    pagetitle = driver.getTitle();
		return pagetitle;
		}
	
	public String checkpageTitle() {
		String currentpagetitle = driver.getTitle();
			return currentpagetitle;
	}
	
    public String implementationofqueueinpython() {
    	queueinpython.click();
    	 pagetitle = driver.getTitle();
    	return pagetitle;
    }
    public String implementationusingcollcdeque() {
    	implementationusingcollcdeque.click();
    	 pagetitle = driver.getTitle();
    	return pagetitle;
    }
    public String implementationusingarray() {
    	implementationusingarray.click();
    	 pagetitle = driver.getTitle();
    	return pagetitle;
    }
    public String queueoperations() {
    	queueoperations.click();
    	 pagetitle = driver.getTitle();
    	return pagetitle;
    }    
    
    public void PracticeQuestion() {
    	practiceques.click();
    }
    
    public boolean PracticeQuestioncontentcheck() {
    	boolean iscontentpresent = practicequescontent.isDisplayed();
    	return iscontentpresent;
    }
    
    public String tryhere() {
    	Tryhere.click();
    	pagetitle = driver.getTitle();
    	return pagetitle;
    }
    
    public void clickrun() {
    	runbutton.click();
    }
    
    public void entercode(String code) {    	
    	Actions actions = new Actions(driver);
		actions.sendKeys(code).perform();
    }
    public String handlealert() {
    	Alert alert = driver.switchTo().alert();
    	String alertmessage = alert.getText();
    	alert.accept();
    	return alertmessage;
    }
    public String getoutput() {
    	String output = consoleoutput.getText();
    	return output;
    }

}