package com.springdemo;

import org.springframework.stereotype.Component;

@Component("theSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley!";
	}

}
