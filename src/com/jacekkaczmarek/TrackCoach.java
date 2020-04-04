package com.jacekkaczmarek;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run sprint 100m";
	}

	@Override
	public int getDailyFortune() {
		return fortuneService.getForune();
	}

}
