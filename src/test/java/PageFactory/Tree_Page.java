package PageFactory;

import Drivers.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;

import java.time.Duration;

public class Tree_Page {


    public WebDriver driver;
    private WebDriverWait wait;
    Utility_Methods util = new Utility_Methods();

    private String homepageUrl = ConfigReader.homePage();

    // initializing page objects
    public Tree_Page() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    //Locators
//  @FindBy(xpath= "//a[@href='tree']")
//  private WebElement treeGetStartedBtn;
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

    //login page
    @FindBy(xpath="//input[@value='Login']")
    private WebElement loginBtn;
    @FindBy(xpath="//input[@id='id_username']")
    private WebElement usernameInput;
    @FindBy(xpath="//input[@id='id_password']")
    private WebElement passwordInput;


    //Action methods
//    public void clickTreeGetStarted() {
//        logger.info("User Click the tree Get Started Button");
//        treeGetStartedBtn.click();
//    }

    public void login(String username, String password){
        usernameInput.clear();
        usernameInput.sendKeys(username);

        passwordInput.clear();
        passwordInput.sendKeys(password);

        loginBtn.click();
    }

    public boolean isOnExpectedURL(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        LoggerLoad.info("Validating page Url");
        return actualUrl.equals(expectedUrl);
    }

    public boolean getTitleOfPage(String expectedTitle) {
        String actualTitle = driver.getTitle();
        LoggerLoad.info("Validating page title");
        return actualTitle.equals(expectedTitle);
    }

    public boolean isTreeTitleVisible() {
        return treeTitle.isDisplayed();
    }

    public void verifyOverviewOfTreeLink() {
        LoggerLoad.info("User Clicks on Overview of Tree link");
        overviewOfTrees.click();
    }

    public void verifyTerminologyLink() {
        LoggerLoad.info("User Clicks on Terminologies link");
        terminologies.click();
    }

    public void verifyTypesOfTreeLink() {
        LoggerLoad.info("User Clicks on Types of tree link");
        typesOfTrees.click();
    }

    public void verifyTreeTraversalLink() {
        LoggerLoad.info("User Clicks on  tree traversal link");
        treeTraversals.click();
    }

    public void verifyTravelIllustrateLink() {
        LoggerLoad.info("User Clicks on  traversal Illustration  link");
        traversalsIllustration.click();
    }

    public void verifyBinaryTreeLink() {
        LoggerLoad.info("User Clicks on  Binary Tree link");
        binaryTrees.click();
    }

    public void verifyTypesOfBinaryLink() {
        LoggerLoad.info("User Clicks on types of Binary tree link");
        typesOfBinaryTrees.click();
    }

    public void verifyImplementPythonLink() {
        LoggerLoad.info("User Clicks on Implementation of Python link");
        implementationInPython.click();
    }

    public void verifyBinaryTreeTraversalsLink() {
        LoggerLoad.info("User Clicks on Binary tree traversal link");
        binaryTreeTraversals.click();
    }

    public void verifyImplementationOfBinaryTreesLink() {
        LoggerLoad.info("User Clicks on Implementation of Binary Trees link");
        implementationOfBinaryTrees.click();
    }

    public void verifyApplicationsOfBinaryTreesLink() {
        LoggerLoad.info("User Clicks on Applications of Binary Trees link");
        applicationsOfBinaryTrees.click();
    }

    public void verifyBinarySearchTreesLink() {
        LoggerLoad.info("User Clicks on  Binary Search Trees link");
        binarySearchTrees.click();
    }

    public void verifyImplementationOfBSTLink() {
        LoggerLoad.info("User Clicks on Implementation of Binary Search Trees link");
        implementationOfBST.click();
    }

    public void verifyTryHereLink() {
        LoggerLoad.info("User Clicks on Try Here button");
        tryHere.click();
    }

    public String outputConsole() {
            String result = output.getText().trim();
            LoggerLoad.info("Fetched output from console");
            return result;
    }

    public void enterCode(String pythonCode) throws InterruptedException {
        textEditor.sendKeys(pythonCode);
        LoggerLoad.info("User enters Python code");
    }

    public WebElement getTextEditor() {
        return textEditor;
    }

    public void clickRunButton() {
        runBtn.click();
        LoggerLoad.info("User Clicked Run button");
    }

    public void verifyEditorOutput() {
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertMessage = alert.getText();
            LoggerLoad.warn("Alert message displayed: ");
            alert.accept();
        } catch (TimeoutException e) {
            try {
                wait.until(ExpectedConditions.visibilityOf(output));
                String codeOutput = output.getText();
                LoggerLoad.info("Code output displayed: ");
            } catch (TimeoutException ex) {
                LoggerLoad.error("No output element found or no output generated.");
            }
        }
    }

    public String getErrorMessage() {
        String errorMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return errorMessage;
    }

    public void verifyPracticeQuestionsLink() {
        LoggerLoad.info("User Clicks the Practice Questions link");
        practiceQuestions.click();
    }

    public void navigateToTreeTopic(String topicKey) {
        String url;

        switch (topicKey) {
            case "tree":
                url = ConfigReader.getTreeUrl();
                break;
            case "overviewOfTrees":
                url = ConfigReader.getOverviewOfTreesUrl();
                break;
            case "terminologies":
                url = ConfigReader.getTerminologiesUrl();
                break;
            case "typesOfTrees":
                url = ConfigReader.getTypesOfTreesUrl();
                break;
            case "treeTraversals":
                url = ConfigReader.getTreeTraversalsUrl();
                break;
            case "traversalsIllustration":
                url = ConfigReader.getTraversalsIllustrationUrl();
                break;
            case "binaryTrees":
                url = ConfigReader.getBinaryTreesUrl();
                break;
            case "typesOfBinaryTrees":
                url = ConfigReader.getTypesOfBinaryTreesUrl();
                break;
            case "implementationInPython":
                url = ConfigReader.getImplementationInPythonUrl();
                break;
            case "binaryTreeTraversals":
                url = ConfigReader.getBinaryTreeTraversalsUrl();
                break;
            case "implementationOfBinaryTrees":
                url = ConfigReader.getImplementationOfBinaryTreesUrl();
                break;
            case "applicationsOfBinaryTrees":
                url = ConfigReader.getApplicationsOfBinaryTreesUrl();
                break;
            case "binarySearchTrees":
                url = ConfigReader.getBinarySearchTreesUrl();
                break;
            case "implementationOfBST":
                url = ConfigReader.getImplementationOfBSTUrl();
                break;
            default:
                throw new IllegalArgumentException("Invalid Tree topic key: " + topicKey);
        }
        driver.get(url);
    }
}
