package com.Spring.AnnotationsXMLConfigScan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Annotations-applicationContext.xml");

        Coach retriveBean = context.getBean("tennisCoach",Coach.class);
        Coach retriveBean1 = context.getBean("defaultBeanID",Coach.class);
        FortuneService retriveBean2 = context.getBean("happyFortuneService",FortuneService.class);

        System.out.println(retriveBean.getDailyWorkout());
        System.out.println(retriveBean1.getDailyWorkout());
        System.out.printf(retriveBean2.getFortune());
        System.out.println();
        context.close();
    }
}
