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

    // add an init method
    public void doMyInit() {
        System.out.println("TrackCoach: inside doMyInit");
    }

    // add an destroy method
    public void doMyDestroy() {
        System.out.println("TrackCoach: inside doMyDestroy");
    }
}
