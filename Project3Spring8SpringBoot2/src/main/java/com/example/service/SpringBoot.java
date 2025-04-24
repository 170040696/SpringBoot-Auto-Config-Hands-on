package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class SpringBoot implements Course{

	public SpringBoot() {
		System.out.println("SpringBoot bean is created");
	}
	
	//@Override
	public boolean GetTheCourse(double amount) {
		// TODO Auto-generated method stub
		System.out.println("SpringBoot course and amount is" + amount);
		return true;
	}

}
