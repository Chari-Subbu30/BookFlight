package com.stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.booking.constants.Constants;
import com.bookings.pages.Home_Page;
import com.runners.TestRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePage_StepDefinitions {

	static Home_Page HomePage = null;

	static
	{
		HomePage = PageFactory.initElements(TestRunner.driver, Home_Page.class);
	}

	@Given("^Navigate to flight booking portal$")
	public void navigate_to_flight_booking_portal() throws Throwable {
		TestRunner.driver.get(Constants.FLIGHT_BOOKING_PORTAL);
		Thread.sleep(10000);
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