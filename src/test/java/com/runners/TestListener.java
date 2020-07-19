package com.runners;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

	public static ThreadLocal<WebDriver> dynamicDriver = new ThreadLocal<WebDriver>();


	@Override
	public void onFinish(ITestContext arg0) {
	}

	@Override
	public void onStart(ITestContext arg0) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String runningPlatform = null ;
		String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String logText = "<b>Test Method"+result.getMethod().getMethodName()+" Skipped</b>";
	}

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String logText = "<b>Test Method"+result.getMethod().getMethodName()+" Successful</b>";
	}


	public static String takeScreenshot(String methodName)
	{
		String fileName = getScreenshotName(methodName);
		String directory = System.getProperty("user.dir")+"\\Screenshots\\";
		new File(directory).mkdirs();
		String path = directory+fileName;
		try {
			File screenshot = ((TakesScreenshot)dynamicDriver.get()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File(path));
			System.out.println("*******************************************************");
			System.out.println("Screenshot stored at:"+path);
			System.out.println("*******************************************************");
		}catch(Exception e)
		{
			System.err.println("Getting error while storing image into path-TestListeners class");
			e.printStackTrace();
		}
		return path;
	}

	public static String getScreenshotName(String methodName)
	{
		return methodName.toString().replace("-", "_").replace(")", "_")
				.replace("(", "_").replace(" ","_").replace(".","_") +"_"+LocalDateTime.now().toString().replace("-", "_")
				.replace(":", "_").replace(" ","_").replace(".","_")+".png";
	}

}

