package com.automation.springtest.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class WebDriverConfig {
	
	@Bean
    @ConditionalOnProperty(name = "browser", havingValue = "Chrome")
	@Scope("cucumber-glue")
	public WebDriver getChrome(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		return new ChromeDriver();
	}
	
	@Bean
    @ConditionalOnProperty(name = "browser", havingValue = "IE")
	@Scope("cucumber-glue")
	public WebDriver getIE(){
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
		return new InternetExplorerDriver();
		
	}
}
