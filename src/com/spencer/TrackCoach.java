package com.spencer;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkout() {
        return "Run a hard 5K";
    }

    @Override
    public String getFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }
}
