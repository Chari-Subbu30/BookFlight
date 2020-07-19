package com.runners;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.driver.initialize.BrowserFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"com.stepDefinitions"},
		plugin = {"pretty", "json:Reports/Browser-cucumber.json" , "html:Reports/Browser-cucumber-pretty"},
		monochrome=true,
		tags=	{"@Functional"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{

	public static WebDriver driver = null;

	@BeforeTest
	public void createSession(ITestContext context) {
		String browserName = context.getName();
		driver = BrowserFactory.getBrowser(browserName);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@AfterTest
	public void quitTheSession(ITestContext context) {
		String browserName = context.getName();
		BrowserFactory.quitDriver(browserName);
	}
}

