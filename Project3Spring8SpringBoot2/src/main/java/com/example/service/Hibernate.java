package com.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Hibernate implements Course {

	public Hibernate() {
		System.out.println("hibernate bean is created");
	}
	
	
	public boolean GetTheCourse(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate course and amount is " + amount);
		return true;
	}

}
