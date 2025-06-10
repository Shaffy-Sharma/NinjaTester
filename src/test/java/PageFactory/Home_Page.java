package PageFactory;

import Drivers.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ConfigReader;

import java.time.Duration;
import java.util.List;

public class Home_Page {
    private final static Logger logger = LogManager.getLogger(Home_Page.class);

    private  WebDriver driver;
    private WebDriverWait wait;
    private String url = ConfigReader.applicationUrl();
    private String homePageUrl = ConfigReader.homePage();

    // initializing page objects
    public Home_Page(){
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Locators
    @FindBy(xpath ="//button[text()='Get Started']")
    private WebElement getStartedButton;

    //Registration, SignIn, SignOut
    @FindBy (xpath="//a[@href ='/register']")
    private WebElement register;
    @FindBy (xpath="//a[@href ='/login']")
    private WebElement signIn;
    @FindBy(xpath ="//ul/a[3]" )
    private WebElement signOut;

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
    @FindBy(xpath = "//div[@class='dropdown-menu']//a[@class='dropdown-item']")
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


    //Action methods
    public void dsAlgoPortal() { driver.get(url); }

    //Home Page URL
    public void homepage() {
        driver.get(homePageUrl);
    }

    public void validateUserLandedOnHomePage() {
        driver.getPageSource().contains("NumpyNinja");
        logger.info("User landed on Home page!");
    }

    public boolean getTitleOfPage(String expectedTitle) {
        String actualTitle = driver.getTitle();
        logger.info("Validating page title. Expected: '{}', Actual: '{}'", expectedTitle, actualTitle);
        return actualTitle.equals(expectedTitle);
    }

    public boolean validateWarningUserNotLoggedIn() {
        getStartedDataStrIntro.click();
        boolean errorDisplayed = userNotLoggedInWarning.isDisplayed();
        logger.info("Error message displayed: {}", errorDisplayed);
        return errorDisplayed;
    }

    //Register & SignIn
    public boolean isSignInAndRegisterVisible() {
        boolean signInVisible = signIn.isDisplayed();
        boolean registerVisible = register.isDisplayed();
        logger.info("Sign In visible: {}, Register visible: {}", signInVisible, registerVisible);
        return signInVisible && registerVisible;
    }

    public void clickRegister() {
        register.click();
        Assert.assertEquals(driver.getTitle(),"Registration");
        logger.info("User landed on Register page!");
    }

    public void clickSignIn(){
        signIn.click();
//        new WebDriverWait(driver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.elementToBeClickable(signIn)).click();
        Assert.assertEquals(driver.getTitle(),"Login");
        logger.info("User landed on Login page!");
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
        logger.info("Validating Login message. Expected: '{}', Actual: '{}'", expectedLogInMsg, actualLogInMsg);
    }

    public void validateMsgAfterRegistration(String message, String username) {
        String actualMsg = registerSuccessMsg.getText();
        String expectedMsg = String.format("%s %s", message.trim(), username.trim());

        Assert.assertEquals(actualMsg , expectedMsg);
        logger.info("Validating registration message. Expected: '{}', Actual: '{}'", expectedMsg, actualMsg);
    }

    public void validateMsgAfterLogout(String expectedLogoutMsg){
        String actualLogoutMsg = logoutSuccessMsg.getText().trim();
        Assert.assertEquals(actualLogoutMsg, expectedLogoutMsg, "Logout message does not match.");
        logger.info("Validating Login message. Expected: '{}', Actual: '{}'", expectedLogoutMsg, actualLogoutMsg);
    }


    //Drop down
    public boolean isGetStartedButtonDisplayed() {
        boolean displayed = getStartedButton.isDisplayed();
        logger.info("'Get Started' button displayed: {}", displayed);
        return displayed;
    }

    public boolean isDropdownVisible() {
        dropDownDataStructure.click();
        boolean visible = dropDownArray.isDisplayed();
        logger.info("Dropdown options visible: {}", visible);
        return visible;
    }

    public void validateDataStructuresDropdown() {
        dropDownDataStructure.click();

        List<WebElement> dataStructuresOptions = dropDownDataStructuresOptions;
        String[] expectedOptions = {"Arrays", "Linked List", "Stack", "Queue", "Tree", "Graph"};

        Assert.assertEquals(dataStructuresOptions.size(), expectedOptions.length,
                "Mismatch in number of dropdown options.");

        for (int i = 0; i < dataStructuresOptions.size(); i++) {
            String actualText = dataStructuresOptions.get(i).getText().trim();
            String expectedText = expectedOptions[i];

            logger.info("Validating dropdown option {}: Expected='{}', Actual='{}'", i + 1, expectedText, actualText);
            Assert.assertEquals(actualText, expectedText,
                    String.format("Dropdown option at index %d does not match. Expected='%s', Actual='%s'", i, expectedText, actualText));
        }

        logger.info("All Data Structures dropdown options validated successfully.");
    }

    public void validateEachDropdownInHomePage(String string) {
        dropDownDataStructure.click();

        switch (string) {
            case "Arrays":
                logger.info("User clicked on '{}'" + string);
                dropDownArray.click();
                break;
            case "Linked List":
                logger.info("User clicked on '{}'" + string);
                dropDownLinkedList.click();
                break;
            case "Stack":
                logger.info("User clicked on '{}'" + string);
                dropDownStack.click();
                break;
            case "Queue":
                logger.info("User clicked on '{}'" + string);
                dropDownQueue.click();
                break;
            case "Tree":
                logger.info("User clicked on '{}'" + string);
                dropDownTree.click();
                break;
            case "Graph":
                logger.info("User clicked on '{}'" + string);
                dropDownGraph.click();
                break;
            default:
                logger.warn("Invalid dropdown option: '{}'" + string);
                break;
        }
    }


    //Get started buttons
    public void clickGetStartedBtn() {
        getStartedButton.click();
    }

    public void  clickGetStartedOnHomePage(String string) {

        switch (string) {
            case "Data Structures-Introduction":
                logger.info("Click '{}' link on Data Structures" + getStartedDataStrIntro.getText());
                getStartedDataStrIntro.click();
                break;
            case "Arrays":
                logger.info("Click '{}' link on Data Structures" + getStartedArray.getText());
                getStartedArray.click();
                break;
            case "Linked List":
                logger.info("Click '{}' link on Data Structures" + getStartedLinkedList.getText());
                getStartedLinkedList.click();
                break;
            case "Stack":
                logger.info("Click '{}' link on Data Structures" + getStartedStack.getText());
                getStartedStack.click();
                break;
            case "Queue":
                logger.info("Click '{}' link on Data Structures" + getStartedQueue.getText());
                getStartedQueue.click();
                break;
            case "Tree":
                logger.info("Click '{}' link on Data Structures" + getStartedTree.getText());
                getStartedTree.click();
                break;
            case "Graph":
                logger.info("Click '{}' link on Data Structures" + getStartedGraph.getText());
                getStartedGraph.click();
                break;
        }
    }

    public void validateNavigationThroughDropdown(){
        // Click on the dropdown
        wait.until(ExpectedConditions.elementToBeClickable(dropDownDataStructure)).click();
        logger.info("Clicked on 'Data Structures' dropdown");

        // Find and click on the 'Arrays' option
        for (WebElement option : dropDownDataStructuresOptions) {
            if (option.getText().trim().equalsIgnoreCase("Arrays")) {
                wait.until(ExpectedConditions.elementToBeClickable(option)).click();
                logger.info("Clicked on 'Arrays' from dropdown");
                break;
            }
        }
        // Validate navigation to Array page
        String expectedUrl = ConfigReader.arrayPageURL();
        String actualUrl = driver.getCurrentUrl();
        logger.info("Validating Array page URL...");
        Assert.assertEquals("User not navigated to Arrays page!", expectedUrl, actualUrl);
        logger.info("Successfully navigated to Arrays page: " + actualUrl);
    }
}
