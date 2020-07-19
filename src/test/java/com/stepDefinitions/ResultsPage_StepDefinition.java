package com.stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.bookings.pages.SearchResultPage;
import com.runners.TestListener;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ResultsPage_StepDefinition{
	
	static SearchResultPage searchResults = null;
	
	static
	{
		searchResults = PageFactory.initElements(TestListener.dynamicDriver.get(), SearchResultPage.class);
	}
	
	@Then("^Get the fares$")
	public void get_the_fares() throws Throwable {
		searchResults.getFares();
	}

	@When("^Selects best itinerary$")
	public void selects_best_itinerary() throws Throwable {
		searchResults.selectBestItinerary();
	}
}
