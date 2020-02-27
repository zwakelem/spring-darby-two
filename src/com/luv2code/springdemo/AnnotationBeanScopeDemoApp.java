package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		Coach aCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = coach == aCoach;
		
		System.out.println("\npointing to same object: " + result);
		
		System.out.println("\nMemory location of coach: " + coach);
		
		System.out.println("\nMemory location of aCoach: " + aCoach);
		
		context.close();
	}

}
