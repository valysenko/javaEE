package com.lysenko.model;

public class ChampionsModel {
	public String getChampion(String country){
		String result="";
		switch( country){
			case "Italy":
				result = "Juventus";
				break;
			case "Germany":
				result = "Bayern";
				break;
			case "England":
				result = "Manchester City";
				break;
			case "Spain":
				result = "Atletico Madrid";
				break;
			default:
				break;
		}
		return result;
		
	}
}
