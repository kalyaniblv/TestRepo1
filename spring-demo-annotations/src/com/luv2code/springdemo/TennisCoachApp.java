package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TennisCoachApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("AnnotationDemo-applicationContext.xml");
		
		Coach ch = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(ch.getDailyWorkOout());
		System.out.println(ch.getDailyFortune());
	}

}
