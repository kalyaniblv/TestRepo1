package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VBDemoApp {

	public static void main(String[] args) {
		// Read spring config file
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("AnnotationDemo-applicationContext.xml");
		// get the bean from the bean container

		Coach ch = c.getBean("vbCoach", Coach.class);

		// call method on the bean
		System.out.println(ch.getDailyWorkOout());
		// close the context
		c.close();

	}

}
