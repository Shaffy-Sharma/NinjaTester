package PageFactory;

import Drivers.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.LoggerLoad;

import java.time.Duration;

public class Tree_Page {

    private final static Logger logger = LogManager.getLogger(Tree_Page.class);

    public WebDriver driver = DriverFactory.getDriver();

    private String homepage = ConfigReader.homePage();
    private String  getTreeUrl = ConfigReader.getTreeUrl();
    private String tryEditorUrl = ConfigReader.tryEditorURL();
    private String  loginUrl = ConfigReader.loginPage();

    //Locators
    @FindBy(xpath= "//a[@href='tree']")
    private WebElement treeGetStartedBtn;
    @FindBy(xpath= "//a[text()='Tree']")
    private WebElement treeTitle;
    @FindBy(xpath="//a[text()='Overview of Trees']")
    private WebElement overviewOfTrees;
    @FindBy(xpath="//a[text()='Terminologies']")
    private WebElement terminologies;
    @FindBy(xpath="//a[text()='Types of Trees']")
    private WebElement typesOfTrees;
    @FindBy(xpath="//a[text()='Tree Traversals']")
    private WebElement treeTraversals;
    @FindBy(xpath="//a[text()='Traversals-Illustration']")
    private WebElement traversalsIllustration;
    @FindBy(xpath="//a[text()='Binary Trees']")
    private WebElement binaryTrees;
    @FindBy(xpath="//a[text()='Types of Binary Trees']")
    private WebElement typesOfBinaryTrees;
    @FindBy(xpath="//a[text()='Implementation in Python']")
    private WebElement implementationInPython;
    @FindBy(xpath="//a[text()='Binary Tree Traversals']")
    private WebElement binaryTreeTraversals;
    @FindBy(xpath="//a[text()='Implementation of Binary Trees']")
    private WebElement implementationOfBinaryTrees;
    @FindBy(xpath="//a[text()='Applications of Binary trees']")
    private WebElement applicationsOfBinaryTrees;
    @FindBy(xpath="//a[text()='Binary Search Trees']")
    private WebElement binarySearchTrees;
    @FindBy(xpath="//a[text()='Implementation Of BST']")
    private WebElement implementationOfBST;
    @FindBy(xpath="//a[@class='btn btn-info']")
    private WebElement tryHere;
    @FindBy (xpath ="//form/div/div/div/textarea")
    private WebElement textEditor;
    @FindBy(xpath="//button[text()='Run']")
    private WebElement runBtn;
    @FindBy(xpath="//pre[@id='output']")
    private WebElement output;
    @FindBy(xpath="//a[text()='Practice Questions']")
    private WebElement practiceQuestions;
    @FindBy(xpath="//a[text()='Sign out']")
    private WebElement SignOut;
   
    private WebDriverWait wait;


    // initializing page objects
    public Tree_Page() {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
    }

    //Action methods
    public void clickTreeGetStarted() {
        logger.info("User Click the tree Get Started Button");
        treeGetStartedBtn.click();
    }

    public boolean isOnExpectedURL(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        logger.info("Validating URL: Expected '{}', Actual '{}'", expectedUrl, actualUrl);
        return actualUrl.equals(expectedUrl);
    }

    public boolean getTitleOfPage(String expectedTitle) {
        String actualTitle = driver.getTitle();
        logger.info("Validating page title. Expected: '{}', Actual: '{}'", expectedTitle, actualTitle);
        return actualTitle.equals(expectedTitle);
    }

    public boolean isTreeTitleVisible() {
        return treeTitle.isDisplayed();
    }

    public void verifyOverviewOfTreeLink() {
        logger.info("User Clicks on Overview of Tree link");
        overviewOfTrees.click();
    }

    public void verifyTerminologyLink() {
        logger.info("User Clicks on Terminologies link");
        terminologies.click();
    }

    public void verifyTypesOFTreeLink() {
        logger.info("User Clicks on Types of tree link");
        typesOfTrees.click();
    }

    public void verifyTreeTraversalLink() {
        logger.info("User Clicks on  tree traversal link");
        treeTraversals.click();
    }

    public void verifyTravelIllustrateLink() {
        logger.info("User Clicks on  traversal Illustration  link");
        traversalsIllustration.click();
    }

    public void verifyBinaryTreeLink() {
        logger.info("User Clicks on  Binary Tree link");
        binaryTrees.click();
    }

    public void verifyTypesOfBinaryLink() {
        logger.info("User Clicks on types of Binary tree link");
        typesOfBinaryTrees.click();
    }

    public void verifyImplementPythonLink() {
        logger.info("User Clicks on Implementation of Python link");
        implementationInPython.click();
    }

    public void verifyBinaryTreeTraversalsLink() {
        logger.info("User Clicks on Binary tree traversal link");
        binaryTreeTraversals.click();
    }

    public void verifyImplementationOfBinaryTreesLink() {
        logger.info("User Clicks on Implementation of Binary Trees link");
        implementationOfBinaryTrees.click();
    }

    public void verifyApplicationsOfBinaryTreesLink() {
        logger.info("User Clicks on Applications of Binary Trees link");
        applicationsOfBinaryTrees.click();
    }

    public void verifyBinarySearchTreesLink() {
        logger.info("User Clicks on  Binary Search Trees link");
        binarySearchTrees.click();
    }

    public void verifyImplementationOfBST() {
        logger.info("User Clicks on Implementation of Binary Search Trees link");
        implementationOfBST.click();
    }

    public void verifyTryHereLink() {
        logger.info("User Clicks on Try Here button");
        tryHere.click();
    }

    public void enterCode(String pythonCode) throws InterruptedException {
        logger.info("User enters Python code");
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(textEditor))
                .sendKeys(pythonCode);
    }

    public void clickRunButton() throws InterruptedException {
        logger.info("User Clicked Run button");
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(runBtn))
                .click();

    }

    public void verifyEditorOutput() {
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertMessage = alert.getText();
            logger.warn("Alert message displayed: {}", alertMessage);
            alert.accept();
        } catch (TimeoutException e) {
            try {
                wait.until(ExpectedConditions.visibilityOf(output));
                String codeOutput = output.getText();
                logger.info("Code output displayed: {}", codeOutput);
            } catch (TimeoutException ex) {
                logger.error("No output element found or no output generated.");
            }
        }
    }

    public String getErrorMessage() {
        String errorMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return errorMessage;
    }

    public void verifyPracticeQuestionsLink() {
        logger.info("User Clicks the Practice Questions link");
        practiceQuestions.click();
    }

    public void navigateToHomePage() {
        driver.get(homepage);
        logger.info("Navigated to homepage: " + homepage);
    }

}
