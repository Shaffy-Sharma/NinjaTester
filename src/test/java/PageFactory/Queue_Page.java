package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Queue_Page {
	public Queue_Page(WebDriver webDriver ) {
        PageFactory.initElements(webDriver, this);
	}
	
	@FindBy (linkText="Sign in") WebElement signin;
	@FindBy (name="username") WebElement username;
	@FindBy (name="password") WebElement password;
	@FindBy (xpath="//input[@type='submit']") WebElement login;
	@FindBy(xpath = "//a[@href='queue']") WebElement getStartedQueue;
    @FindBy(xpath = "//a[text()='Implementation of Queue in Python']") WebElement implementationPython;
    @FindBy(xpath = "//a[text()='Implementation using collections.deque']") WebElement collectionDeque;
    @FindBy(xpath = "//a[text()='Implementation using array']") WebElement arrayImpl;
    @FindBy(xpath = "//a[text()='Queue Operations']") WebElement queueOperations;
    @FindBy(xpath = "//a[text()='Practice Questions']") WebElement practiceQuestions;
    @FindBy(xpath = "//a[text()='Try here>>>']") WebElement tryHere;
    @FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement editorTextArea;
    @FindBy(xpath = "//button[text()='Run']") WebElement runButton;
	
	
	
	public void homepage(String uname, String pwd) {
		//PageFactory.initElements(driver,this);
		signin.click();
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();
	}
	
	public void clickGetStartedQueue() {
        getStartedQueue.click();
    }

    public void clickImplementationPython() {
        implementationPython.click();
    }

    public void clickCollectionDeque() {
        collectionDeque.click();
    }

    public void clickArrayImplementation() {
        arrayImpl.click();
    }

    public void clickQueueOperations() {
        queueOperations.click();
    }

    public void clickPracticeQuestions() {
        practiceQuestions.click();
    }

    public void clickTryHere() {
        tryHere.click();
    }

    public void enterCode(String code) {
        editorTextArea.clear();
        editorTextArea.sendKeys(code);
    }

    public void clickRun() {
        runButton.click();
    }
}