package com.csrk.beings;

public class Calculator {
	
	private int numOne;
	private int numTwo;
	private int value;
	
	public int add(int numOne, int numTwo){
		return value = numOne+numTwo;
	}
	public int substract(int numOne, int numTwo){
		return value = numOne-numTwo;
	}
	public int multiply(int numOne, int numTwo){
		return value = numOne*numTwo;
	}
	public int divide(int numOne, int numTwo){
		return value = numOne/numTwo;
	}
	public int getNumOne() {
		return numOne;
	}
	public void setNumOne(int numOne) {
		this.numOne = numOne;
	}
	public int getNumTwo() {
		return numTwo;
	}
	public void setNumTwo(int numTwo) {
		this.numTwo = numTwo;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
}
