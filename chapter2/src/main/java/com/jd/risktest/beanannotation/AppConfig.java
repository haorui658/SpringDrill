package com.jd.risktest.beanannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Value("${message}")
	private String message;

	@Bean
	public BeanInterface getBeanInterface() {
		System.out.println(message);
		return new BeanInterfaceImplOne();
	}

	@Bean(name = "BeanInterface2")
	public BeanInterface getBeanInterface2() {
		return new BeanInterfaceImplTwo();
	}
}
