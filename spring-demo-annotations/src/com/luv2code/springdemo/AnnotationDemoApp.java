package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// Read spring config file
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("AnnotationDemo-applicationContext.xml");
		// get the bean from the bean container
		
		Coach ch = c.getBean("kabaddiCoach", Coach.class);

		// call method on the bean
		System.out.println(ch.getDailyWorkOout());
		System.out.println(ch.getDailyFortune());
		// close the context....
		c.close();

	}

}
