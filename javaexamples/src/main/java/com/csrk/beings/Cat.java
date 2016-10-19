package com.csrk.beings;

public class Cat extends Animal {
	public void says(){
		System.out.println("Meow");
	}
	public void print(){
		System.out.println("Cat has " + getNumOfLegs(4) +" Legs");
		System.out.println("Cat has " + getNumOfTails(1) +" Tails");
		
	}
}