package com.Spring.JAVAconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("chessCoach" , Coach.class);

        System.out.println(coach.getScore());
        System.out.println(coach.getPerformance());
        System.out.println(coach.happyService());

        context.close();
    }
}
