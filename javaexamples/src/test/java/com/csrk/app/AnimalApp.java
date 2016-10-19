package com.csrk.app;

import com.csrk.beings.Animal;
import com.csrk.beings.Calculator;
import com.csrk.beings.Cat;
import com.csrk.beings.Dog;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal aAnimal = new Animal();
		Dog aDog = new Dog();
		Cat aCat = new Cat();
		
		aAnimal.says();
		aDog.says();
		aCat.says();
		aCat.print();
		
		//Calculator Main Method
		System.out.println("---------");
		Calculator aCalculator = new Calculator();
		
		aCalculator.add(1,2);
		aCalculator.substract(5,2);
		aCalculator.multiply(3,1);
		aCalculator.divide(6,2);
		
		System.out.println("addition=" +aCalculator.add(1,2));
		System.out.println("Sustract=" +aCalculator.substract(5,2));
		System.out.println("Multiply=" +aCalculator.multiply(3,1));
		System.out.println("Divide=" +aCalculator.divide(6,2));			
		
	}

}
