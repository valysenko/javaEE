package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lysenko.HelloWorld;
import com.lysenko.beans.CleanService;
import com.lysenko.beans.EatService;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
		
		EatService eS = (EatService) context.getBean("feedService");
		System.out.println(eS.feed());
		CleanService cS = (CleanService) context.getBean("cleanService");
		System.out.println(cS.clean());
	}
	
}
