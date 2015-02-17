package com.lysenko.beans;

import com.lysenko.abstractClasses.Animal;
import com.lysenko.interfaces.MeowInterface;

public class Cat extends Animal implements MeowInterface
{
	
	public Cat(){
		
	}

	public Cat(String name, String age){
		super(name,age);
	}
	public String meow(){
		return "meow";
	}
}
