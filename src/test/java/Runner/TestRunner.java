package Runner;

import org.testng.annotations.DataProvider;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = { "pretty", "html:Reports/cucumber-reports.html",
				"json:Reports/cucumber-reports.json",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
		monochrome=false, 
		tags = "@stack",
		features = {"src/test/resources/Features"}, 
		glue= {"stepDefinitions","Hooks"})

public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
	}
}