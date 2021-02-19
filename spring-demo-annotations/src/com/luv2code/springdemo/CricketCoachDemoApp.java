package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketCoachDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("AnnotationDemo-applicationContext.xml");

		Coach ch = c.getBean("cricketCoach", Coach.class);

		System.out.println(ch.getDailyWorkOout());

	}

}
