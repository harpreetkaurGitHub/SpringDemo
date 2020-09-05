package com.Spring.AnnotationsXMLConfigScan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext beanScope = new ClassPathXmlApplicationContext("Annotations-applicationContext.xml");
        Coach coachAlpha = beanScope.getBean("tennisCoach" , Coach.class);
        Coach coachBeta = beanScope.getBean("tennisCoach" , Coach.class);

        System.out.println("I am alpha obj "+coachAlpha.getDailyWorkout());
        System.out.println("I am beta  obj "+coachBeta.getDailyWorkout());
        beanScope.close();
    }

}
