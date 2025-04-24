package com.example.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimeConfig {

	public TimeConfig() {
		System.out.println("TimeConfig bean is created");
	}
	
	@Bean
	public LocalTime Createtime() {
		return LocalTime.now();
	}
}
