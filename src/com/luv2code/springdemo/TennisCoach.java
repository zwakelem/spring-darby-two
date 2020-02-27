package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: inside setFortuneService");
//		this.fortuneService = fortuneService;
//	}

//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: inside doSomeCrazyStuff");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
