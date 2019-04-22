package com.spencer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);

        System.out.println(cricketCoach.getWorkout());
        System.out.println(cricketCoach.getFortune());
        System.out.println(cricketCoach.toString());

        context.close();
    }
}
