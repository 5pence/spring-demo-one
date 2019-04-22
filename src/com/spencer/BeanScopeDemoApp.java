package com.spencer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // load spring config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // get beans from spring container
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach coach1 = context.getBean("myCoach", Coach.class);

        // check if these are the same beans
        boolean result = (coach == coach1);
        System.out.println("\nPointing to the same object? " + result);

        System.out.println("\nMemory location for the coach " + coach);
        System.out.println("\nMemory location for the coach1 " + coach1);

        // close the context
        context.close();

    }
}
