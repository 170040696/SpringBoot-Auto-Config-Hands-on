package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class Java implements Course{

	public Java() {
		System.out.println("Java bean is created");
	}
	
	//@Override
	public boolean GetTheCourse(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Java course and amount is" + amount);
		return true;
	}
	

}
