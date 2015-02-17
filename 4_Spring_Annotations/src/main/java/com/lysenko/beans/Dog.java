package com.lysenko.beans;

import com.lysenko.abstractClasses.Animal;
import com.lysenko.interfaces.GowInterface;

public class Dog extends Animal implements GowInterface{

	public Dog(){
		
	}
	
	public String gow(){
		return "gow";
	}

}
