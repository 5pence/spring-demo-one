package com.spencer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.invoke.ConstantCallSite;

public class HelloSpringApp {

    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from the Spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(coach.getWorkout());
        System.out.println(coach.getFortune());

        // close the context
        context.close();
    }
}
