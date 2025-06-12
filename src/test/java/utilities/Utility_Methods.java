package utilities;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import PageFactory.SignIn_Page;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Drivers.DriverFactory;

public class Utility_Methods {

    public  WebDriver driver = DriverFactory.getDriver();
    public  String ExcelPath = ConfigReader.getexcelfilepath();
    WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));

    public  void waitForElement(WebElement element) {
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void enterPythonCodeForPractice(String code, WebElement element) {
        new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        String[] str1 = code.split("\n");
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].equalsIgnoreCase("\\b")) {
                element.sendKeys(Keys.BACK_SPACE);
            } else {
                element.sendKeys(str1[i]);
                element.sendKeys(Keys.ENTER);
            }
        }
    }

    public  boolean enterPythonCode(WebElement element, String code) {
        LoggerLoad.info("Before sending keys to " + element.getText() );
        try {
            new Actions(driver).sendKeys(element, code).perform();
        } catch(Exception e) {
            element.sendKeys(code);
        }
        return true;
    }

    public String getResultFromExcel(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testdata = reader.getData(ExcelPath, sheetName);
        String result = testdata.get(rowNumber).get("Output");
        LoggerLoad.info("Expected result from Excel sheetName " + sheetName + " and " + rowNumber + " : " + result);
        return result;
    }

    public String getCodeFromExcel(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testdata = reader.getData(ExcelPath, sheetName);
        String code = testdata.get(rowNumber).get("PythonCode");
        return code;
    }

}
