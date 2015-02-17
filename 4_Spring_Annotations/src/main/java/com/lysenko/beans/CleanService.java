package com.lysenko.beans;

import com.lysenko.abstractClasses.Animal;
import com.lysenko.abstractClasses.Service;
import com.lysenko.interfaces.CleanInterface;

public class CleanService extends Service implements CleanInterface {

	public String clean() {

		return this.animal.getName() + " is clean! ";
	}

}
