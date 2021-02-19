package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class VbCoach implements Coach {

	private FortuneService fs;
	
	
	
	public VbCoach(FortuneService fs) {
		this.fs = fs;
	}

	@Override
	public String getDailyWorkOout() {
		// TODO Auto-generated method stub
		return "1 hour daliy vb practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getDailyFortune();
	}

}
