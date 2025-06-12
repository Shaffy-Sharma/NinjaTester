package Runner;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;

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

	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
	}
}