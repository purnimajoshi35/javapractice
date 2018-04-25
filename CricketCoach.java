package com.purnima.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String name;
	private String mailid;
	
	
	
	public CricketCoach() {
		
	}


	public CricketCoach(FortuneService happyfortuneService) {
		
		this.fortuneService = happyfortuneService;
	}
	
	
	public void setFortuneService(FortuneService happyfortuneService) {
		this.fortuneService = happyfortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice cricket daily!!!";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

	

	public void setName(String name) {
		this.name = name;
	}


	public void setMailid(String mailid) {
		this.mailid = mailid;
	}


	public String getName() {
		return name;
	}


	public String getMailid() {
		return mailid;
	}
	
	

}
