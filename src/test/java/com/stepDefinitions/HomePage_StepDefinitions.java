package com.stepDefinitions;


import com.bookings.pages.Home_Page;
import com.runners.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePage_StepDefinitions extends TestRunner{

	Home_Page HomePage = new Home_Page(driver);

	@Given("^Navigate to flight booking portal$")
	public void navigate_to_flight_booking_portal() throws Throwable {
		HomePage.launchPortal();
	}

	@When("^User enters from city \"([^\"]*)\"$")
	public void user_enters_from_city(String from) throws Throwable {
		HomePage.source(from);
	}

	@When("^User enters destination city \"([^\"]*)\"$")
	public void user_enters_destination_city(String destination) throws Throwable {
		HomePage.destination(destination);
	}

	@When("^Search for a given flight$")
	public void search_for_a_given_flight() throws Throwable {
		HomePage.search();
	}

}
