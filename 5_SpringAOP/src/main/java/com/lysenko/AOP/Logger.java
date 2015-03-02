package com.lysenko.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {
	@Pointcut("execution(* com.lysenko.beans.PlayerInterface.play(..))")
	public void action(){}

	@Before("action( )")
	public void startEvent(){
		System.out.println("The game begins");
	}

	@Before("action( )")
	public void thinkAboutNumber(){
		System.out.println("The player choosing number");
	}

	@After("action( )")
	public void expectorStarts(){
		System.out.println("Expector comes and takes his place");
	}
	
}
