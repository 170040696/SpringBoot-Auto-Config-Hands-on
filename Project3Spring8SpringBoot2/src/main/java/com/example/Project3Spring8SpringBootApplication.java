package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Project3Spring8SpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Project3Spring8SpringBootApplication.class, args);
	     LaunchCourse lc= container.getBean(LaunchCourse.class);
	     System.out.println(lc.BuyTheCourse(200.0));
	}

}
 