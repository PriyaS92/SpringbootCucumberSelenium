package com.automation.springtest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties
@EnableConfigurationProperties
class ApplicationTests{

	@Value("${browser}")
	String browsername;
}