package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import java.io.ByteArrayInputStream;

import utilities.ConfigReader;
import utilities.LoggerLoad;

public class hooks {
	// execute code before and after each scenario or step

	public WebDriver driver;
	DriverFactory driverFactory = new DriverFactory();

	@Before
	public void defineBrowser(Scenario scenario) throws Throwable {
		ConfigReader.readConfig();
		driverFactory.initializeWebDriver(ConfigReader.getBrowserType());
	}

	@AfterStep
	public void afterStep(Scenario scenario) {
		if (scenario.isFailed()) {
			LoggerLoad.error("Steps Failed , Taking Screenshot");
			final byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			Allure.attachment("Myscreenshot", new ByteArrayInputStream(
					((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES)));
		}
	}

	@After
	public void afterScenario(Scenario scenario) {
		driverFactory.closeDriver();
	}

}
