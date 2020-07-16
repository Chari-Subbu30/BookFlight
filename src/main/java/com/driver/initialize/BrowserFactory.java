package com.driver.initialize;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

	public static WebDriver getBrowser(String browserName) {
		WebDriver driver = null;

		switch (browserName) {
		case "Safari":
			driver = drivers.get("Safari");
			if (driver == null) {
				driver = new SafariDriver();
				drivers.put("Safari", driver);
			}
			break;
		case "Chrome":
			driver = drivers.get("Chrome");
			if (driver == null) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				drivers.put("Chrome", driver);
			}
			break;
		}
		return driver;
	}

	public static void quitDriver(String browserName) {
		try {Thread.sleep(10000);} catch (InterruptedException e) {e.printStackTrace();}
		for (String key : drivers.keySet()) {
			if(browserName.equalsIgnoreCase(key))
				drivers.get(key).quit();
			break;
		}
	}
}
