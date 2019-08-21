package com.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Bean
	public BeanDev deanDev() {
		return new BeanDev();
		
	}

}