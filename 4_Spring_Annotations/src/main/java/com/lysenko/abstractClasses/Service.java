package com.lysenko.abstractClasses;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Service {
	
	@Autowired
	protected Animal animal;

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
