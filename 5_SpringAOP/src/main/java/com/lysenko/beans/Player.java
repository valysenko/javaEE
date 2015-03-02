package com.lysenko.beans;

public class Player implements PlayerInterface{
	private Integer number = 0;
	
	public void play(Integer number){
		System.out.println("Player gives "+number);
		this.number = number;
	}
	
}
