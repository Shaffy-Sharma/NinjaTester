package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ConfigReader;
import utilities.LoggerLoad;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Drivers.DriverFactory;

@CucumberOptions(
		plugin = { "pretty", "html:Reports/cucumber-reports.html",
				"json:Reports/cucumber-reports.json",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
		monochrome=false, 
		tags = " ",
		features = {"src/test/resources/Features"}, 
		glue= {"stepDefinitions","Hooks"})

public class TestRunner extends AbstractTestNGCucumberTests {

	DriverFactory driverFactory;
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
	}
	
	@BeforeTest
	@Parameters({ "browser" })
	public void defineBrowser( @Optional("chrome") String browser) throws Throwable {
	    ConfigReader.readConfig();  // Load configurations
	    LoggerLoad.info("Setting up WebDriver for browser: " + browser);

	    // Initialize DriverFactory and WebDriver
	    driverFactory = new DriverFactory();  // Create an instance of DriverFactory
	    driverFactory.initializeWebDriver(browser);  // Initialize WebDriver for the given browser

	    ConfigReader.setBrowserType(browser);  // Optional: for further configuration
	}
}