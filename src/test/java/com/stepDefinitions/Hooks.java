package com.stepDefinitions;

import com.runners.TestListener;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{

	@Before
	public void beforeHook(Scenario scenario)
	{
        System.out.println("Scenario is get started - "+scenario.getName() +" on session - " + TestListener.dynamicDriver.get().getClass().getName());
	}

	@After
	public void afterHook(Scenario scenario)
	{
		 System.out.println("Scenario execution gets ended - "+scenario.getName() +" on session - " + TestListener.dynamicDriver.get().getClass().getName());
	}

}
