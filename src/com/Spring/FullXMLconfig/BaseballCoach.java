package com.Spring.FullXMLconfig;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "You have done 30 minutes workout";
    }
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
