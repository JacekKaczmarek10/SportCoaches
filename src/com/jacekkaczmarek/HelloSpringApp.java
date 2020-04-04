package com.jacekkaczmarek;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		
		//config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		System.out.println(theCoach.getDailyFortune());
		
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		
		context.close();
	}

}
