package com.lysenko.beans;

import java.util.List;

import com.lysenko.abstractClasses.Animal;
import com.lysenko.abstractClasses.Service;
import com.lysenko.interfaces.FeedInterface;

public class EatService extends Service implements FeedInterface {
	
	private List<String> food; 
	public String feed() {
		String result = this.animal.getName() + " eats: ";
		for(String s : this.food){
			result+="\n"+s;
		}
		return result+"\n Now animal is full.";
	}
	
	public void setFood(List<String> food) {
		this.food = food;
	}
}
