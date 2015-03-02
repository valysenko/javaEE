package com.lysenko.AOP;

public class Expector implements ExpectorInterface{
	private Integer number = 30;
	private String result="";

    public void expect(Integer number){
		if(this.number>=number)
            this.result+="Unfortunately player gives less and loses!";
        else
            this.result = "Player  gives more and wins!";
	}

    public String getResult(){
        return this.result;
    }
}
