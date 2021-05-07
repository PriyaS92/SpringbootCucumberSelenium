package com.automation.springtest.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.automation.springtest.stepdefinitions.Hooks;

@Component
@Scope("cucumber-glue")
public class Basepage{
	
	@Autowired
	public Hooks hook;
	
	public Basepage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void navigate(String url){
		try{
			hook.driver.get(url);
			hook.driver.manage().window().maximize();
			TimeUnit.SECONDS.sleep(5);
		}
		catch(Exception e){e.printStackTrace();}
	}
	
	
}
