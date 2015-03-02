package com.lysenko;

import com.lysenko.AOP.ExpectorInterface;
import com.lysenko.beans.PlayerInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        PlayerInterface player = (PlayerInterface)context.getBean("player");
        ExpectorInterface expector = (ExpectorInterface)context.getBean("expector");
        player.play(20);
        System.out.println(expector.getResult());
        System.out.println("");
        System.out.println("");
        player.play(35);
        System.out.println(expector.getResult());
    }
}
