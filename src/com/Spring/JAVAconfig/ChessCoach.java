package com.Spring.JAVAconfig;

public class ChessCoach implements Coach {

    private HappyService happyService;
    public ChessCoach(HappyService theHappyService) {
        happyService = theHappyService;
    }

    @Override
    public String getPerformance() {
        return "You are performing well";
    }

    @Override
    public String getScore() {
        return "your score is 70/150";
    }

    public String happyService() {
        return happyService.happyService();
    }
}
