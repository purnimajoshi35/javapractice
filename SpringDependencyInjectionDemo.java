package com.purnima.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependencyInjectionDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCoach", CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getName());
		System.out.println(theCoach.getMailid());
		
		context.close();

	}

}
