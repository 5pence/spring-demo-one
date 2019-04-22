package com.spencer;

public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    public BasketballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkout() {
        return "Fire 3 pointers for 15 minutes";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
