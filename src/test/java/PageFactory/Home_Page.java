package PageFactory;

import Drivers.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.LoggerLoad;

import java.time.Duration;
import java.util.List;

public class Home_Page {

    private  WebDriver driver;
    private WebDriverWait wait;

    // initializing page objects
    public Home_Page(){
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    //Registration, SignIn, SignOut
    @FindBy (xpath="//a[@href ='/register']")
    private WebElement registerLink;
    @FindBy (xpath="//a[normalize-space()='Sign in']")
    private WebElement signInLink;
    @FindBy(xpath ="//ul/a[3]" )
    private WebElement signOutLink;

    @FindBy(linkText ="NumpyNinja")
    WebElement NumpyNinjaLink;

    //Error and success text
    @FindBy (xpath = "//div[@role='alert']")
    private WebElement userNotLoggedInWarning;
    @FindBy(xpath ="//div[@class='alert alert-primary']" )
    private WebElement loginSuccessMsg;
    @FindBy(xpath ="//div[@class='alert alert-primary']" )
    private WebElement registerSuccessMsg;
    @FindBy(xpath ="//div[@class='alert alert-primary']" )
    private WebElement logoutSuccessMsg;

    //dropdown
    @FindBy(xpath = "//div[@class='dropdown-menu show']")
    private List<WebElement> dropDownDataStructuresOptions;

    @FindBy(xpath="//a[@class='nav-link dropdown-toggle']")
    private WebElement dropDownDataStructure;
    @FindBy (xpath="//div[@class='dropdown-menu show']/a[1]")
    private WebElement dropDownArray;
    @FindBy (xpath="//div[@class='dropdown-menu show']/a[2]")
    private WebElement dropDownLinkedList;
    @FindBy (xpath="//div[@class='dropdown-menu show']/a[3]")
    private WebElement dropDownStack;
    @FindBy (xpath="//div[@class='dropdown-menu show']/a[4]")
    private WebElement dropDownQueue;
    @FindBy (xpath="//div[@class='dropdown-menu show']/a[5]")
    private WebElement dropDownTree;
    @FindBy (xpath="//div[@class='dropdown-menu show']/a[6]")
    private WebElement dropDownGraph;

    //Home Page
    @FindBy (xpath = "//a[@href ='data-structures-introduction']")
    private WebElement getStartedDataStrIntro;
    @FindBy (xpath = "//a[@href ='array']")
    private WebElement getStartedArray;
    @FindBy (xpath = "//a[@href ='linked-list']")
    private WebElement getStartedLinkedList;
    @FindBy (xpath = "//a[@href ='stack']")
    private WebElement getStartedStack;
    @FindBy (xpath = "//a[@href ='tree']")
    private WebElement getStartedTree;
    @FindBy (xpath = "//a[@href ='graph']")
    private WebElement getStartedGraph;
    @FindBy (xpath = "//a[@href ='queue']")
    private WebElement getStartedQueue;

    //login page
    @FindBy(xpath="//input[@value='Login']")
    private WebElement loginBtn;
    @FindBy(xpath="//input[@id='id_username']")
    private WebElement username;
    @FindBy(xpath="//input[@id='id_password']")
    private WebElement password;


    //Home Page URL
    public void homePageWithSignIn(String uname, String pwd) {
        signInLink.click();
        username.sendKeys(uname);
        password.sendKeys(pwd);
        loginBtn.click();
    }

    public void validateUserLandedOnHomePage() {
        driver.getPageSource().contains("NumpyNinja");
    }

    public boolean getTitleOfPage(String expectedTitle) {
        String actualTitle = driver.getTitle();
        LoggerLoad.info("Validating page title");
        return actualTitle.equals(expectedTitle);
    }

    public boolean validateWarningUserNotLoggedIn() {
        getStartedDataStrIntro.click();
        boolean errorDisplayed = userNotLoggedInWarning.isDisplayed();
        LoggerLoad.info("Error message displayed: ");
        return errorDisplayed;
    }

    //Register & SignIn
    public boolean isSignInAndRegisterVisible() {
        boolean signInVisible = signInLink.isDisplayed();
        boolean registerVisible = registerLink.isDisplayed();
        LoggerLoad.info("Sign In visible: {}, Register visible: ");
        return signInVisible && registerVisible;
    }

    public void clickRegister() {
        registerLink.click();
        Assert.assertEquals(driver.getTitle(),"Registration");
        LoggerLoad.info("User landed on Register page!");
    }

    public void clickSignIn(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(signInLink)).click();

        Assert.assertEquals(driver.getTitle(),"Login");
        LoggerLoad.info("User landed on Login page!");
    }

    public String loginPage() {
        String title = driver.getTitle();
        return title;
    }

    public String registerPage() {
        String title = driver.getTitle();
        return title;
    }

    public void validateMsgAfterLoginIn(String expectedLogInMsg){
        String actualLogInMsg = loginSuccessMsg.getText();
        Assert.assertEquals(actualLogInMsg,expectedLogInMsg, "Logged In message does not match");
        LoggerLoad.info("Validating Login message.");
    }

    public void validateMsgAfterRegistration(String message, String username) {
        String actualMsg = registerSuccessMsg.getText();
        String expectedMsg = String.format("%s %s", message.trim(), username.trim());

        Assert.assertEquals(actualMsg , expectedMsg);
        LoggerLoad.info("Validating registration message.");
    }

    public void validateMsgAfterLogout(String expectedLogoutMsg){
        String actualLogoutMsg = logoutSuccessMsg.getText().trim();
        Assert.assertEquals(actualLogoutMsg, expectedLogoutMsg, "Logout message does not match.");
        LoggerLoad.info("Validating Login message. Expected: ");
    }


    //Drop down
    public boolean isDropdownVisible() {
        dropDownDataStructure.click();
        boolean visible = dropDownArray.isDisplayed();
        LoggerLoad.info("Dropdown options visible: ");
        return visible;
    }

    public void validateDataStructuresDropdown() {
        dropDownDataStructure.click();
    }

    public void validateDropdownInHomePage(String option) {
        dropDownDataStructure.click();

        switch(option.toLowerCase()) {
            case "arrays":
                dropDownArray.click();
                Assert.assertEquals(driver.getTitle(), "Array", "User is not on the Array page.");
                break;
            case "linkedlist":
                dropDownLinkedList.click();
                Assert.assertEquals(driver.getTitle(), "Linked List", "User is not on the Linked List page.");
                break;
            case "stack":
                dropDownStack.click();
                Assert.assertEquals(driver.getTitle(), "Stack", "User is not on the Stack page.");
                break;
            default:
                throw new IllegalArgumentException("Invalid option: " + option);
        }
    }

    public void selectDataStructure(){
        LoggerLoad.info("Click '{}' link on Data Structures" + getStartedDataStrIntro.getText());
        getStartedDataStrIntro.click();
    }

    public void selectArray(){
        LoggerLoad.info("Click '{}' link on Data Structures" + getStartedArray.getText());
        getStartedArray.click();
    }

    public void selectLinkedList() {
        LoggerLoad.info("Click '{}' link on Data Structures" + getStartedLinkedList.getText());
        getStartedLinkedList.click();
    }

    public void selectStack() {
        LoggerLoad.info("Click '{}' link on Data Structures" + getStartedStack.getText());
        getStartedStack.click();
    }

    public void selectTree() {
        LoggerLoad.info("Click '{}' link on Data Structures" + getStartedTree.getText());
        getStartedTree.click();
    }

    public void selectQueue() {
        LoggerLoad.info("Click '{}' link on Data Structures" + getStartedQueue.getText());
        getStartedQueue.click();
    }

    public void selectGraph(){
        LoggerLoad.info("Click '{}' link on Data Structures" + getStartedGraph.getText());
        getStartedGraph.click();
    }

}
