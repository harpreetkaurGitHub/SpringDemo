package com.Spring.FullXMLconfig;

public class MyApp {
    public static void main(String[] args) {
        Coach coach = new TrackCoach();
        System.out.printf(coach.getDailyWorkout());
    }
}
