package com.automation.springtest.stepdefinitions;

import org.springframework.beans.factory.annotation.Autowired;

import com.automation.springtest.pages.Basepage;

import io.cucumber.java.en.Given;

public class Stepdefinition {
	
	@Autowired
	private Basepage base;
	
	@Given("I want to navigate to application with {string}")
	public void i_want_to_navigate_to_application_with(String url) {
	    //throw new io.cucumber.java.PendingException();
		base.navigate(url);
	}
}
