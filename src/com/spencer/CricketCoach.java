package com.spencer;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("inside Cricket constructor");
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }



    @Override
    public String toString() {
        return emailAddress + " plays for " + team;
    }
}
