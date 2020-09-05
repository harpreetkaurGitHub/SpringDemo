package com.Spring.FullXMLconfig;

import com.Spring.FullXMLconfig.Coach;
import com.Spring.FullXMLconfig.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("baseballCoach",Coach.class);
        Coach theCoach1 = context.getBean("trackCoach",Coach.class);

        CricketCoach cricketCoach = context.getBean("myCricketCoach" , CricketCoach.class);
//        System.out.println(String.valueOf(theCoach));
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach1.getDailyWorkout());
        System.out.println(theCoach1.getDailyFortune());
        System.out.println("email :: " + cricketCoach.getEmail() + " team name :: " + cricketCoach.getTeam());
        context.close();

    }
}
