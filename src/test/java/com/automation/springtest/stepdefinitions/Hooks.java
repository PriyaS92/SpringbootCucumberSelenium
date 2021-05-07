package com.automation.springtest.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.automation.springtest.SpringContextConfig;

import io.cucumber.java.After;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringContextConfig.class)
public class Hooks {

	@Autowired 
	public WebDriver driver;
	
	@After
	public void closebrowser(){
		driver.quit();
	}
	
}
