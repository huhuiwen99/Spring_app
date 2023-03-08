package com.luv2code.springdemo;

public class SwimmingCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Swim for 10 cycles!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "You'd be more careful today.";
	}
	

}
