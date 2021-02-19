package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("restFortuneService")
	private FortuneService fs;
	
	public TennisCoach()
	{
		System.out.println("1)from TennisCoach()");
	}
	
	@Override
	public String getDailyWorkOout() {
		
		return "2)do 1 hour daily practice of Tennis";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getDailyFortune();
	}

}
