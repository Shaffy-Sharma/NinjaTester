
package PageFactory;

import Drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class SignIn_Page {

	
	
	//public static WebDriver driver = DriverFactory.getDriver();
	public  WebDriver driver = DriverFactory.getDriver();
	//String loginurl = ConfigReader.loginPage();
	//String registerurl = ConfigReader.registerPageURL();

	GetStarted_Page getStartedPage;

	public SignIn_Page() {
		PageFactory.initElements(driver, this);
		getStartedPage = new GetStarted_Page();
	}

	@FindBy(xpath = "//input[@id='id_username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbtn;
	@FindBy(xpath = "//div[contains(text(),'Invalid Username and Password')]")
	WebElement alertMsg;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[2]/a[1]")
	WebElement registerlink;
	@FindBy (xpath="//a[normalize-space()='Sign in']")
	private WebElement signInLink;
	@FindBy(xpath = "//div[contains(text(),'You are logged in')]")
	WebElement successLogin;

	//To get Log in URL
	public void getLoginurl() {
		//driver.get(loginurl);
		getStartedPage.dsAlgoPortal();
		getStartedPage.navigateToHomePage();
		LoggerLoad.info("User is on the Home Page" );
		signInLink.click();
		LoggerLoad.info("User is on login page" );
	}

	public void enterUsername(String userName) {
		username.sendKeys(userName);
	}

	public void enterPassword(String passWord) {
		password.sendKeys(passWord);
	}

	public void clickLogin() {
		loginbtn.click();
	}

	public String successAlert() {
		String successMsg = successLogin.getText();
		return successMsg;
	}

	public String invalidAlert() {
		String alertMessage = alertMsg.getText();
		return alertMessage;
	}

	public String validateUsernamefield(String validationMessge) {
		String message = username.getAttribute("validationMessage");
		System.out.println("message");
		return message;

	}

	public String validatePasswordfield(String validationMessge) {
		String message = password.getAttribute("validationMessage");
		System.out.println("message");
		return message;

	}

	public void register() {
		registerlink.click();
	}

	public String register_page() {
		String title = driver.getTitle();
		return title;
	}
	
}
