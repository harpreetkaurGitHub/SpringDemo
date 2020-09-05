package com.Spring.AnnotationsXMLConfigScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
@Scope("prototype")
public class TennisCoach implements Coach {

    //    @Autowired     //field injection no need for setter methods
     private FortuneService theFortuneService;

     // used when field injection is in used
    TennisCoach() {
        System.out.println("field injection is in used");
    }

//    @Autowired      //@Qualifier  used when there are multiple implementations....
//    public TennisCoach(FortuneService fortuneService) {
//        fortuneService = theFortuneService;
//    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }
    public String addToMyStartUpStuff(){
        return "Hey I am THe lucky who stared at first";
    }

}
