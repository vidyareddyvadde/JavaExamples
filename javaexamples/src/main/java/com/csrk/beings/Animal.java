package com.csrk.beings;

public class Animal {
	
	private int numOfLegs;
	private int numOfTails;
	
	public int getNumOfLegs(int numOfLegs) {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

	public int getNumOfTails(int numOfTails) {
		return numOfTails;
	}

	public void setNumOfTails(int numOfTails) {
		this.numOfTails = numOfTails;
	}
	
	
	public void says(){
		System.out.println("Animal says");
	}	
}
