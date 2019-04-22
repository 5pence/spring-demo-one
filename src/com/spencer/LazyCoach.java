package com.spencer;

public class LazyCoach implements Coach {

    private FortuneService fortuneService;

    public LazyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkout() {
        return "Watch TV for 4 hours";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
