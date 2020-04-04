package com.jacekkaczmarek;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String teamName;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("CRICKET COACH SETTER FUNCTION email");
		this.emailAddress = emailAddress;
	}



	public String getTeamName() {
		return teamName;
	}



	public void setTeamName(String teamName) {
		System.out.println("CRICKET COACH SETTER FUNCTION team name");
		this.teamName = teamName;
	}



	public CricketCoach() {
		System.out.println("CRICKET COACH BASIC CONTRUCTOR");
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CRICKET COACH SETTER FUNCTION");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public int getDailyFortune() {
		return fortuneService.getForune();
	}

}
