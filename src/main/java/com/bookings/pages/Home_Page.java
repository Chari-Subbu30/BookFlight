package com.bookings.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.booking.constants.Constants;

public class Home_Page {

    WebDriver driver;

	@FindBy(how = How.XPATH, using = "//div[starts-with(@class,'autopop__wrap')]")
	public WebElement signup;

	@FindBy(how = How.XPATH, using = "//li[@data-cy='account']")
	public WebElement login_account;

	@FindBy(how = How.XPATH, using = "//span[text()='Flights']")
	public WebElement flights_Menu;

	@FindBy(how = How.ID, using = "fromCity")
	public WebElement from_source;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='From']")
	public WebElement textbox_from;

	@FindBy(how = How.XPATH, using = "//ul[@role='listbox']/li")
	public List<WebElement> cities;

	@FindBy(how = How.ID, using = "toCity")
	public WebElement to_destination;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='To']")
	public WebElement textbox_destination;

	@FindBy(how = How.XPATH, using = "//label[@for='departure']")
	public WebElement defaurture_datePicker;

	@FindBy(how = How.XPATH, using = "//p[text()='29']")
	public WebElement defaurture_date;

	@FindBy(how = How.XPATH, using = "//a[text()='Search']")
	public WebElement btn_search ;

	public Home_Page(WebDriver driver)
	{
		this.driver = driver;
	}

	public void launchPortal()
	{
		driver.get(Constants.FLIGHT_BOOKING_PORTAL);
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
	}

	public void source(String from)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(signup));
			login_account.click();
		}catch(Exception e) {}
		flights_Menu.click();
		from_source.click();
		textbox_from.sendKeys(from);
		try {Thread.sleep(10000);} catch (InterruptedException e) {e.printStackTrace();}
		cities.get(0).click();
	}

	public void destination(String destination)
	{
		try {
			to_destination.click();
		}catch(Exception e) {System.out.println("Some times here getting exception");}
		textbox_destination.sendKeys(destination);
		try {Thread.sleep(10000);} catch (InterruptedException e) {e.printStackTrace();}
		cities.get(0).click();
		try {
			defaurture_datePicker.click();
		}catch(Exception e) {System.out.println("Some times here getting exception");}
		defaurture_date.click();
	}

	public void search()
	{
		btn_search.click();
	}

}

