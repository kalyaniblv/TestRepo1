package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class KabaddiCoach implements Coach {

	@Autowired
	private FortuneService fs;

	public KabaddiCoach() {
		System.out.println("1.inside KabaddiCoach()-constructor");
	}

	public FortuneService getFs() {
		return fs;
	}

	@Autowired
	public void setFs(FortuneService fs) {
		System.out.println("2.inside setFs() method");
		this.fs = fs;
	}

	@Override
	public String getDailyWorkOout() {

		return "3.Exercise daily 1-hour";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		System.out.println("4.inside getDailyFortune() method");
		return fs.getDailyFortune();
	}

}
