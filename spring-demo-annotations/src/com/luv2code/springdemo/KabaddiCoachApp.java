package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KabaddiCoachApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c
		= new ClassPathXmlApplicationContext("AnnotationDemo-applicationContext.xml");
		
		Coach ch = c.getBean("kabaddiCoach",Coach.class);
		
		System.out.println(ch.getDailyWorkOout());
		
	}

}
