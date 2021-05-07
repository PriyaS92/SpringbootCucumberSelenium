package com.automation.springtest.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class Homepage{
	
	@FindBy(xpath="//*[@id='loginLink']")
    WebElement btnLogin;

	public Homepage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void ClickLogin()
    {
		try{
			TimeUnit.SECONDS.sleep(5);
			btnLogin.click();
		}
		catch(Exception e){e.printStackTrace();}
	}
}
