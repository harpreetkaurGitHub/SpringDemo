package com.Spring.FullXMLconfig;

import com.Spring.FullXMLconfig.Coach;
import com.Spring.FullXMLconfig.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(){}
    public TrackCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    public String getDailyWorkout(){
        return "run 5km daily";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
    public void addToMyStartUpStuff() {
        System.out.println("TrachCoach :: inside method addToMyStartUpStuff() ");
    }
    public void addToMyEndUpStuff() {
        System.out.println("TrachCoach :: inside method addToMyEndUpStuff() ");
    }

}
