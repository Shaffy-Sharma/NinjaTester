package PageFactory;

import Drivers.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.LoggerLoad;


import java.time.Duration;

public class Tree_Page {


    public WebDriver driver;
    private WebDriverWait wait;

    // initializing page objects
    public Tree_Page() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    //Locators
    @FindBy(xpath= "//a[text()='Tree']")
    private WebElement treeTitle;
    @FindBy(xpath="//a[@href='overview-of-trees']")
    private WebElement overviewOfTrees;
    @FindBy(xpath="//a[@href='terminologies']")
    private WebElement terminologies;
    @FindBy(xpath="//a[@href='types-of-trees']")
    private WebElement typesOfTrees;
    @FindBy(xpath="//a[@href='tree-traversals']")
    private WebElement treeTraversals;
    @FindBy(xpath="//a[@href='traversals-illustration']")
    private WebElement traversalsIllustration;
    @FindBy(xpath="//a[@href='binary-trees']")
    private WebElement binaryTrees;
    @FindBy(xpath="//a[@href='types-of-binary-trees']")
    private WebElement typesOfBinaryTrees;
    @FindBy(xpath="//a[@href='implementation-in-python']")
    private WebElement implementationInPython;
    @FindBy(xpath="//a[@href='binary-tree-traversals']")
    private WebElement binaryTreeTraversals;
    @FindBy(xpath="//a[@href='implementation-of-binary-trees']")
    private WebElement implementationOfBinaryTrees;
    @FindBy(xpath="//a[@href='applications-of-binary-trees']")
    private WebElement applicationsOfBinaryTrees;
    @FindBy(xpath="//a[@href='binary-search-trees']")
    private WebElement binarySearchTrees;
    @FindBy(xpath="//a[@href='implementation-of-bst']")
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


    //Action methods
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
        LoggerLoad.info("User clicks on Overview of Trees link");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overviewOfTrees);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", overviewOfTrees);
    }

    public void verifyTerminologyLink() {
        LoggerLoad.info("User Clicks on Terminologies link");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", terminologies);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", terminologies);
    }

    public void verifyTypesOfTreeLink() {
        LoggerLoad.info("User Clicks on Types of tree link");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", typesOfTrees);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", typesOfTrees);
    }

    public void verifyTreeTraversalLink() {
        LoggerLoad.info("User Clicks on  tree traversal link");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", treeTraversals);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", treeTraversals);
    }

    public void verifyTravelIllustrateLink() {
        LoggerLoad.info("User Clicks on  traversal Illustration  link");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", traversalsIllustration);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", traversalsIllustration);
    }

    public void verifyBinaryTreeLink() {
        LoggerLoad.info("User Clicks on  Binary Tree link");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", binaryTrees);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", binaryTrees);
    }

    public void verifyTypesOfBinaryLink() {
        LoggerLoad.info("User Clicks on types of Binary tree link");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", typesOfBinaryTrees);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", typesOfBinaryTrees);
    }

    public void verifyImplementPythonLink() {
        LoggerLoad.info("User Clicks on Implementation of Python link");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", implementationInPython);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", implementationInPython);
    }

    public void verifyBinaryTreeTraversalsLink() {
        LoggerLoad.info("User Clicks on Binary tree traversal link");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", binaryTreeTraversals);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", binaryTreeTraversals);
    }

    public void verifyImplementationOfBinaryTreesLink() {
        LoggerLoad.info("User Clicks on Implementation of Binary Trees link");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", implementationOfBinaryTrees);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", implementationOfBinaryTrees);
    }

    public void verifyApplicationsOfBinaryTreesLink() {
        LoggerLoad.info("User Clicks on Applications of Binary Trees link");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", applicationsOfBinaryTrees);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", applicationsOfBinaryTrees);
    }

    public void verifyBinarySearchTreesLink() {
        LoggerLoad.info("User Clicks on  Binary Search Trees link");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", binarySearchTrees);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", binarySearchTrees);
    }

    public void verifyImplementationOfBSTLink() {
        LoggerLoad.info("User Clicks on Implementation of Binary Search Trees link");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", implementationOfBST);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", implementationOfBST);
    }

    public void verifyTryHereLink() {
        LoggerLoad.info("User Clicks on Try Here button");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tryHere);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", tryHere);
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

}
