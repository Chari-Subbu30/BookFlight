package com.bookings.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//div[@class='fli-intl-lhs pull-left']/div/div")
	public List<WebElement> flight_vendors;

	@FindBy(how = How.XPATH, using = "//div[@class='timeSlotsOuter']/div")
	public List<WebElement> time_slots;

	@FindBy(how = How.ID, using = "review-continue")
	public WebElement btn_continue;

	public SearchResultPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void getFares(){
		System.out.println("Available flights count: " + flight_vendors.size());
		System.out.println("Available flights Details : Below");
		boolean skipfirstrow = true;
		for(WebElement vendor : flight_vendors)
		{
			if(skipfirstrow == true)
			{
				skipfirstrow = false;
				continue;
			}
			try {
				System.out.println(vendor.getText());
			}catch(Exception e)
			{	}
			System.out.println("==========================================================");
		}
	}

	public void selectBestItinerary()
	{
		if(flight_vendors.size() > 1)
		{
			for(WebElement slot : time_slots)
			{
				if(slot.getText().contains("After") && slot.getText().contains("6") && slot.getText().contains("PM"))
				{
					slot.click();
					break;
				}
			}
		}
		boolean skipBanner = true;
		for(WebElement vendor : flight_vendors)
		{
			if(skipBanner == true)
			{
				skipBanner = false;
				continue;
			}
			WebElement Btn_BookNow = vendor.findElement(By.xpath("//button[contains(text(),'Book Now')]"));
			WebElement Btn_View_Fares = vendor.findElement(By.xpath("//button[contains(text(),'View Fares')]"));
			if(!Btn_BookNow.isDisplayed())
			{
				Btn_View_Fares.click();
				WebDriverWait wait = new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.visibilityOf(Btn_BookNow));
				Btn_BookNow.click();
				break;
			}
			else
			{
				Btn_BookNow.click();
				break;
			}
		}
	}

}
