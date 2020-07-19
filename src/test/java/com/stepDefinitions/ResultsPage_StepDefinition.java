package com.stepDefinitions;

import com.bookings.pages.SearchResultPage;
import com.runners.TestRunner;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ResultsPage_StepDefinition extends TestRunner{

	SearchResultPage searchResults = new SearchResultPage(driver);

	@Then("^Get the fares$")
	public void get_the_fares() throws Throwable {
		searchResults.getFares();
	}

	@When("^Selects best itinerary$")
	public void selects_best_itinerary() throws Throwable {
		searchResults.selectBestItinerary();
	}
}
