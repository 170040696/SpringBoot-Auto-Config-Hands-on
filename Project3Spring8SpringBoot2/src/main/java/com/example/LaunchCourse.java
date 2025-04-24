package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.service.Course;
import com.example.service.SpringBoot;

@Component
public class LaunchCourse {
	
//	@Autowired
//	@Qualifier("springBoot")
	private Course course;
	
//	public LaunchCourse(SpringBoot sb)
//	{
//		this.course=sb;
//	}
	
     public LaunchCourse() {
    	 System.out.println("LaunchCourse Bean created");
     }

     @Autowired
	public LaunchCourse(@Qualifier("java") Course c) {
		// TODO Auto-generated constructor stub
		this.course=c;
	}
     
    // @Autowired
 	//@Qualifier("springBoot")
	public void setCourse(Course course) {
    	 System.out.println("Setter injuction");
		this.course = course;
	}
boolean BuyTheCourse(double amount) {
	  return course.GetTheCourse(amount);
  }
}
