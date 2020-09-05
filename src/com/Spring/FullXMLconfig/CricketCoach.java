package com.Spring.FullXMLconfig;

public class CricketCoach implements Coach {

    private String team;
    private String email;

    public void setTeam(String team) {
        this.team = team;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public String getEmail() {
        return email;
    }

    CricketCoach(){

    }
    public FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "score 100 runs daily";
    }

    @Override
    public String getDailyFortune() {
        return "Happy cricket fortune";
    }
}
