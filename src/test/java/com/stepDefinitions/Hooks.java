package com.stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{

	@Before
	public void beforeHook(Scenario scenario)
	{
		System.out.println("Scenario is get started - "+scenario.getName());
	}

	@After
	public void afterHook(Scenario scenario)
	{
		System.out.println("Scenario execution gets ended - "+scenario.getName());
	}

}
