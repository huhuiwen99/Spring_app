package com.luv2code.springdemo;

public class SwimmingCoach implements Coach {
	
	private FortuneService fortuneService;
	private String team;
	
	public SwimmingCoach() {
		System.out.println("SwimmingCoach: inside no-arg constructor");
		
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("SwimmingCoach: inside setter method.");
		this.fortuneService = fortuneService;
	}
	
	
	public String getTeam() {
		return "Name: " + team;
	}

	public void setTeam(String team) {
		System.out.println("SwimmingCoach: inside setter method - setTeam.");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim for 10 cycles!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}	

}
