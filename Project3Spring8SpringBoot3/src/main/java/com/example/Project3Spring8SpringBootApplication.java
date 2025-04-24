package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project3Spring8SpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Project3Spring8SpringBootApplication.class, args);
	
	 int count =container.getBeanDefinitionCount();
	 System.out.println("Number of beans created "+count);
	 String ar[]=container.getBeanDefinitionNames();
	 for(String s:ar)
		 System.out.println(s);
	}

}
 