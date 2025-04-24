package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.iGreetings;

@SpringBootApplication
public class Project3Spring8SpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Project3Spring8SpringBootApplication.class, args);
	
		iGreetings se=container.getBean(iGreetings.class);
		System.out.println(se.GenerateWish("akanksha"));
	}

}
 