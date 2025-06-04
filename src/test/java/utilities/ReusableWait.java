package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import Drivers.DriverFactory;

public class ReusableWait 
{
	public WebDriver driver=DriverFactory.getDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	public WebElement until(ExpectedCondition<WebElement> elementToBeClickable)
//	{
//		
//		return null;
//	}
//	public WebElement until(ExpectedCondition<WebElement> elementToBeClickable) {
//		// TODO Auto-generated method stub
//		return null;
//	}



}
