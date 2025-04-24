package com.example.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements iGreetings {
	
	@Autowired
	private LocalTime localtime;
	
//	@Autowired
//	public void setLocaltime(LocalTime localtime) {
//		this.localtime = localtime;
//	}

	public GreetingService() {
		System.out.println("GreetingService bean created");
	}

	@Override
	public String GenerateWish(String name) {
		// TODO Auto-generated method stub
		
		int hour=localtime.getHour();
		if(hour<12)
			return "good morning "+ name;
		else if(hour<16)
			return "good Afternoon "+name;
		else if(hour<20)
			return "good Evening "+name;
		else
			return "Good Night "+name;
				
	}

}
